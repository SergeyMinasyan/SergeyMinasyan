package examples.enum2;

public enum Season {
    WINTER(-30), SPRING(20), SUMMER(30), AUTUMN(10);
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;


    }

    public int getTemperature() {
        return temperature;
    }
}

