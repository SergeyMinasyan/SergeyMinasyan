package examples.collections.setExample;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        Set<Author> authorSet = new TreeSet<>();
        Author author1 = new Author("Poxos","Poxosyan",12,"Poxos@mail.ru", "male");
        Author author2 = new Author("Babken","Poxosyan",12,"Poxos@mail.ru", "male");
        Author author3 = new Author("Arto","Poxosyan",22,"Arto@mail.ru", "male");
        authorSet.add(author1);
        authorSet.add(author2);
        authorSet.add(author3);
        for (Author author : authorSet) {
            System.out.println(author);
        }

    }
}
