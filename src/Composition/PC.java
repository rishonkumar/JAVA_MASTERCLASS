package Composition;
/*
    Here we dont use extends coz we cant inherit from multiple class
    so we use composition

 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Mothboard mothboard;

    public PC(Case theCase, Monitor monitor, Mothboard mothboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mothboard = mothboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mothboard getMothboard() {
        return mothboard;
    }
}
