package Exams.equalse_;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(10);
        Animal animal2 = new Animal(20);
        System.out.println(animal1.equals(animal2));
    }
    }
    class Animal{
        private int id;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return id == animal.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        public Animal(int id){
            this.id = id;
        }
    }

