package composepc;

public class Monitor {
    private Resolution reolution;
    private String model;
    private String manufacturer;

    public Monitor(Resolution resolution, String model, String manufacturer){
        setReolution(resolution);
        setModel(model);
        setManufacturer(manufacturer);
    }

    public Resolution getReolution() {
        return reolution;
    }

    public void setReolution(Resolution reolution) {
        this.reolution = reolution;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor " +
                "reolution: " + reolution +
                ", model:" + model + ", manufacturer:" + manufacturer;
    }
}
