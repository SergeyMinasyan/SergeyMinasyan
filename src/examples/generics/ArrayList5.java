package examples.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList5 {
    public static void main(String[] args) {
        String[] friendsArray = new String[3];
        String[] friendsArray2 = {"John", "Chris", "Eric"};
        ArrayList<String> friendsArrayList = new ArrayList<>();
        friendsArrayList.add("John");
        friendsArrayList.add("Chris");
        friendsArrayList.add("Eric");

        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric"));
        System.out.println("friendsArray2[1] => " + friendsArray2[1]);
        System.out.println("friendsArrayList2.get(2) -> " + friendsArrayList2.get(2));
        System.out.println("friendsArray.length -> " + friendsArray.length);
        System.out.println("friendsArrayList2.size() -> "+  friendsArrayList2.size());

        friendsArrayList2.add("Mitch");
        System.out.println("friendsArrayList2.get(3) -> " + friendsArrayList2.get(3));
    }
}
