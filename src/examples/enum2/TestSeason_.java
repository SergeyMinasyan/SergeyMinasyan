package examples.enum2;

public class TestSeason_ {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        Animal animal = Animal.DOG;
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Season);
        System.out.println(season.getClass());
        System.out.println("Season is "  + season.name());
        System.out.println("Name of animal " + animal.name());
        Animal CAT = Animal.valueOf("CAT");
        System.out.println(CAT.getTranslation());
        System.out.println("Index is " + season.ordinal());

    }
}
