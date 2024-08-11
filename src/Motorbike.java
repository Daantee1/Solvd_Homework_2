public class Motorbike {

    private String model;
    private String owner;
    private Properties properties;

    public Motorbike(String model, String owner) {
        this.model = model;
        this.owner = owner;
    }
    public Motorbike() {
        this.model = "Unknown model";
        this.owner = "Unknown owner for this motorbike";
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
