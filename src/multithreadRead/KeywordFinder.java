package multithreadRead;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

class KeywordFinder implements Runnable {
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    final String keyword =";";
    Stream <String> lines;
    public KeywordFinder(Stream lines) {
        this.lines=lines;
    }

    public static AtomicInteger getCount(){
        return countOfKeyword;
    }
    @Override
    public void run() {
        this.lines.forEach((str)->{
            if (str.contains(keyword)) {
                countOfKeyword.incrementAndGet();
            }
        });
    }
}