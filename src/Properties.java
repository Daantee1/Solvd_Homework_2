public class Properties {

    private int horsepower;
    private int year;
    private int mileage;
    private String typeOfFuel;

    public Properties(int horsepower, int year, int mileage, String typeOfFuel) {
        this.horsepower = horsepower;
        this.year = year;
        this.mileage = mileage;
        this.typeOfFuel = typeOfFuel;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
