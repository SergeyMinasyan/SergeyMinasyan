package education__.storage;

import education__.model.Lesson;

public class LessonStorage {
  private Lesson[] lessons = new Lesson[10];
    private int size;


    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();


        }
        lessons[size++]=lesson;
    }
    private void extend() {
        Lesson[] temp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, temp, 0, lessons.length);
        lessons = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(lessons[i]);
        }
    }

    public void searcByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().contains(keyword)) {
                System.out.println(lessons[i]);
            }
        }

    }


    public void searcByPrice(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getPrice() > minPrice && lessons[i].getPrice() < maxPrice) {
                System.out.println(lessons[i]);
            }
        }
    }



    public Lesson getByName(String lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lesson)) {
                return lessons[i];
            }
        }
        return null;
    }

    public void earchLecture(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLecturerName().equals(name)){
                System.out.println(lessons[i]);
            }
        }
    }




    private void deleteByIndex(int index){
        for (int i = index+1; i < size; i++) {
            lessons[i-1] = lessons[i];
        }size--;
    }

    public void deleteLesson(String name) {
        for (int i = 0; i < size; i++) {
          if (lessons[i].getName().equals(name)) {
          deleteByIndex(i);
          }
    }
}
    }
