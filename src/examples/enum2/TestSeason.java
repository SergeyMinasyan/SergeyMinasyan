package examples.enum2;

public class TestSeason {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        switch (season){
            case WINTER:
                System.out.println("It's cold outside");
                break;
            case SUMMER:
                System.out.println("It's warm outside");
                break;
        }
        System.out.println(Season.AUTUMN.getTemperature());

    }
}
