package examples.ye;

public enum Language {
    ARM("Hayastan", 100000) , RU("Rusastan") , ENG("America") ;

private String translation;
private int count;

    Language(String translation) {
    }

    public String getTranslation() {
        return translation;
    }

    public int getCount() {
        return count;
    }

    Language(String translation, int count){
    this.translation = translation;
    this.count = count;



}
}
