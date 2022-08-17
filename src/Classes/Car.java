package Classes;

public class Car {

    // Characteristics of CAR

    // private - does not allow access outside the class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // THIS -> if you have same name or to access or update "String model" field with parameter model

    // GETTERS AND SETTERS
    // Use -> We can give some conditions and change accordingly
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carera")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
