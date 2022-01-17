package examples.collections.sortedListExample;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author> {



  @Override
  public int compare(Author o1, Author o2) {
      if (o1.getAge() == o2.getAge()) {
        return 0;

      }else if(o1.getAge()>o2.getAge()){
        return  1;

      }
      return -1;
    }
  }

