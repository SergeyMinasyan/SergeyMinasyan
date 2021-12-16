package examples.enum2;

public enum Animal {
DOG("собака") , CAT ("кошка"), FROG("лягушка");
private String translation;

Animal(){

}
private Animal(String translation){
    this.translation =translation;

}

    public String getTranslation() {
        return translation;
    }
    public String toString(){
    return "Перевод на русский язык " + translation;
    }
}
