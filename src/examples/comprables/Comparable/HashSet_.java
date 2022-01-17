package examples.comprables.Comparable;

import java.util.Set;
import java.util.TreeSet;

public class HashSet_ {
    public static void main(String[] args) {
        Set<Author> authorSet = new TreeSet<>();

        Author author1 = new Author("Poxos", "Poxosyan", 19, "Poxos@mail.ru", "male");
        Author author2 = new Author("Arto", "Poxosyan", 59, "Arto@mail.ru", "male");
        Author author3 = new Author("Babo", "Poxosyan", 39, "Babo@mail.ru", "male");
        authorSet.add(author1);
        authorSet.add(author2);
        authorSet.add(author3);
        for (Author author : authorSet) {
            System.out.println(author);
        }
    }
}