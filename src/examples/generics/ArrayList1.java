package examples.generics;


public class ArrayList1 {
    public static void main(String[] args) {
java.util.ArrayList<String> food = new java.util.ArrayList<String>();
food.add("pizza");
food.add("hamburger");
food.add("hoddog");
food.set(0,"sushi");
food.remove(2); // delete
// food.clear();
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }

}

