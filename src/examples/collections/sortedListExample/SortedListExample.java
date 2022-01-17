package examples.collections.sortedListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListExample {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        Author author1 = new Author("Poxos", "Poxosyan", 30, "Poxos@mail.ru", "male");
        Author author2 = new Author("Arman", "Poxosyan", 20, "Arman@mail.ru", "male");
        Author author3 = new Author("Babken", "Poxosyan", 10, "Babken@mail.ru", "male");
        Author author4 = new Author("Babken", "Poxosyan", 10, "Babken@mail.ru", "male");
        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        authorList.add(author4);
        Collections.sort(authorList);
        for (Author author : authorList) {
            System.out.println(author);
        }
    }
}
