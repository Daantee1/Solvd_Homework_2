public class GasStation {

    private int diesel;
    private int petrol;
    private int quantity;

    public GasStation(int diesel, int petrol) {
        this.diesel = diesel;
        this.petrol = petrol;
    }

    public void refuelWithPetrol(int quantity) {
        int price = this.petrol * quantity;
        System.out.println("Refueling the vehicle with petrol" + " costs " + price +" zł");
    }
    public void refuelWithDiesel(int quantity) {
        int price = this.petrol * quantity;
        System.out.println("Refueling the vehicle with diesel" + " costs " + price +" zł");
    }

    public int getDiesel() {
        return diesel;
    }

    public void setDiesel(int diesel) {
        this.diesel = diesel;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
