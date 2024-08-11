public class Mechanic {

    private String name;
    private int price;

    public Mechanic(String name) {
        this.name = name;
        if(name.equals("Kacper")){
            price = 2000;
        }
        else if(name.equals("Dawid") ){
            price = 2500;
        }
        else{
            price = 1000;
        }
    }

    public void repairCar(Car car){
        System.out.println(name + " repairs " + car.getModel() + " and the price is " + getPrice() +" zł");
    }
    public void repairMotorbike(Motorbike motorbike){
        System.out.println(name + " repairs " + motorbike.getModel() + " and the price is " + getPrice()  +" zł");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
