package Interface.interface4;

public interface MyIF {
    int getNumЬer();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}