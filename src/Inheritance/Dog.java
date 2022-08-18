package Inheritance;

public class Dog extends Animal {
    // SUPER - Call the constructor form the class we are extending from

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }
    public Dog(String name, int size, int weight, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog chew");
    }

    @Override
    public void eatOne() {
        System.out.println("Dog eat"); // dog
        chew();
        super.eatOne(); // animal
    }

    public void walk() {
        System.out.println("Dog.wal() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
}
