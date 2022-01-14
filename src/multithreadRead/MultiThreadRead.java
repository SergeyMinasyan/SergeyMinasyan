package multithreadRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiThreadRead {


    public static String path = "C:\\Users\\Minasyan\\Desktop\\sample.txt";
    public static final int limit = 2000000;
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get(path)).count();
        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for(long i=0; i<count; i=i+limit){
            if((i+limit)<=count){
                threads.add(new Thread(new KeywordFinder(Files.lines(Paths.get(path)).skip(i).limit(i+limit))));
            }
            else{
                threads.add(new Thread(new KeywordFinder(Files.lines(Paths.get(path)).skip(i).limit(count))));
            }
        }
        try {
            for (Thread thr : threads) {
                thr.start();
                thr.join();
            }
        }catch (InterruptedException e){
            System.err.println("exception");
        }
        countOfKeyword=KeywordFinder.getCount();
        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
    }

}
