package Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Mothboard theMothboard = new Mothboard("BJ-200","Asus",4,6,"2.44");

        PC thePc = new PC(theCase, theMonitor, theMothboard);

        thePc.getMonitor().drawPixelAt(1500,1200,"red");
        thePc.getMothboard().loadProgram("windows 1.0");
        thePc.getTheCase().pressPowerButton();
    }
}
