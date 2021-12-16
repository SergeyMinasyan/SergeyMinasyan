package examples.enum1;

public enum Lang {
    ARM("ՀԱՅԱՍՏԱՆ", 10000), RU("ՌԴ"), AMD("ԱՄՆ");

    private String countryName;
    private int count;

    public String getCountryName() {
        return countryName;
    }

    private Lang(String countryName, int count) {
        this.countryName = countryName;
        this.count = count;
    }

    private Lang(String countryName) {
        this.countryName = countryName;

    }

    public int getCount() {
        return count;
    }
}
