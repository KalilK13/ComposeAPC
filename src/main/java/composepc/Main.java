package composepc;

public class Main {
    public static void main(String[] args) {
        Dimension size = new Dimension(10, 20, 3);
        Resolution screen = new Resolution();
        screen.setHeight(18);
        screen.setWidth(22);
        Monitor monitor = new Monitor(screen, "toshiba flex", "Toshiba");
        Motherboard motherboard = new Motherboard("XXR-001", "Asus", "UEFI", 2, 4);
        Case pcCase = new Case("0027AU", "Hp", "80W", size);
        PC pc = new PC(pcCase, motherboard, monitor);

        pc.description();
        pc.powerUp();

    }

}
