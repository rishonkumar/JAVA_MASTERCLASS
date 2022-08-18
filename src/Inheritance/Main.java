package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"long silky");

        dog.eat(); // eat is defined in Animal and dog is inheriting
        System.out.println(dog.getBrain()); // 1
        System.out.println("----------------");
        dog.eatOne();
        System.out.println("----------------");

        dog.walk();
        dog.run();
    }
}
