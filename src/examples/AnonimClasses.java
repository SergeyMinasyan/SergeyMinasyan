package examples;

 class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
  class Test {
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.eat();
            Animal animal2 = new Animal() {
                public void eat(){
                    System.out.println("Animal -> is eating");
                }
            };
            animal2.eat();
        }
    }
