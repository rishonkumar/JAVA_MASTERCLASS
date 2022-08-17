package Classes;

public class Main {
    // Class is blueprint for creating objects

    public static void main(String[] args) {

        Car porsche = new Car(); // created an object of type CAR
        Car holden = new Car();
//        System.out.println("Model is " + porsche.getModel()); // null

        porsche.setModel("carera");

        System.out.println("Model is " + porsche.getModel());

    }
}
