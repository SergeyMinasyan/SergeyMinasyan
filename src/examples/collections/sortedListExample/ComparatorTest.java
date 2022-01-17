package examples.collections.sortedListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        Author author1 = new Author("Poxos", "Poxosyan", 30, "Poxos@mail.ru", "male");
        Author author2 = new Author("Arman", "Poxosyan", 40, "Poxos@mail.ru", "male");
        Author author3 = new Author("Karen", "Poxosyan", 10, "Poxos@mail.ru", "male");
        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        Collections.sort(authorList,new AuthorAgeComparator());

//        Collections.sort(authorList, new Comparator<Author>() {
//            @Exams.Override
//            public int compare(Author o1, Author o2) {
//                return 0;
//            }
//        });

        for (Author author : authorList) {
            System.out.println(author);
        }
    }
}
