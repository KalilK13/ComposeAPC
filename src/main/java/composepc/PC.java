package composepc;

public class PC {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;
    public PC(Case pcCase, Motherboard motherboard, Monitor monitor){
        setMonitor(monitor);
        setPcCase(pcCase);
        setMotherboard(motherboard);
    }
    public PC (Case pcCase){
        setPcCase(pcCase);
    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(20,80, "green");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today: \n" +
                monitor + "\n " + pcCase + "\n " + motherboard);
    }
    public void powerUp(){
        pcCase.pressPowerButton();
        this.drawLogo();
        motherboard.loadProgram("Zoom");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
