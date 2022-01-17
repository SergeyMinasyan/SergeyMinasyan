package Exams.Iterator;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {

        ArrayList<String> cityNames = new ArrayList<>();
    cityNames.add("Germany");
    cityNames.add("France");
    cityNames.add("Italy");
    cityNames.add("Spain");
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
    }
}
