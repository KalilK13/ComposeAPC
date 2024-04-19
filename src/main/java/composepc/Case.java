package composepc;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions){
        setModel(model);
        setManufacturer(manufacturer);
        setPowerSupply(powerSupply);
        setDimension(dimensions);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
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

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }

    @Override
    public String toString() {
        return "Case" +
                "model: " + model + ", manufacturer: " + manufacturer +
                ", powerSupply: " + powerSupply +
                ", dimension " + dimension;
    }
}
