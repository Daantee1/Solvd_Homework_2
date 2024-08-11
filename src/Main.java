public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi A4", "Piotr");
        Properties audiProperties = new Properties(150, 2012,10000, "petrol");
        audi.setProperties(audiProperties);
        System.out.println("Car model: " + audi.getModel() + ", owner: " + audi.getOwner() +
                ", horsepower: " + audiProperties.getHorsepower() + ", year: " + audiProperties.getYear()
        + ", mileage: " + audiProperties.getMileage() + " km" + ", type of fuel: " +audiProperties.getTypeOfFuel());


        Mechanic mechanic = new Mechanic("Kacper");
        mechanic.repairCar(audi);

        GasStation orlen = new GasStation(6, 8);
        orlen.refuelWithPetrol(50);


        //I used a different constructor for this object
        Motorbike yamaha = new Motorbike();
        Properties yamahaProperties = new Properties(250, 2019, 5000, "diesel");
        yamaha.setProperties(yamahaProperties);
        System.out.println("Motorbike model: " + yamaha.getModel() + ", owner: " + yamaha.getOwner() +
                ", horsepower: " + yamahaProperties.getHorsepower() + ", year: " + yamahaProperties.getYear()
                + ", mileage: " + yamahaProperties.getMileage() + " km" + ", type of fuel: " +yamahaProperties.getTypeOfFuel());

        Mechanic mechanic2 = new Mechanic("Dawid");
        mechanic2.repairMotorbike(yamaha);
        orlen.refuelWithDiesel(20);
    }
}