public class Car {

    private String model;
    private String owner;

    private Properties properties;

    public Car (String model, String owner) {
        this.model = model;
        this.owner = owner;

    }
    public Car() {
        this.model = "Unknown model";
        this.owner = "Unknown owner for this car";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
