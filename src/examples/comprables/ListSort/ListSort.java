package examples.comprables.ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Author> authorList = new ArrayList<>();
        Author author1 = new Author("Poxos", "Poxosyan", 30, "Poxos@mail.ru", "male");
        Author author2 = new Author("Babo", "Poxosyan", 10, "Babo@mail.ru", "male");
        Author author3 = new Author("Aram", "Poxosyan", 20, "Aram@mail.ru", "male");
        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        Collections.sort(authorList);
        for (Author author : authorList) {
            System.out.println(author);
        }
    }
}
