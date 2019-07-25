package Car;

import CarInterface.ISomeCar;

public class Car implements ISomeCar {
    private int idn;
    private int price;
    private int maxSpeed;
    private int fuelCons;     //kg/h

    Car (int idn, int price, int maxSpeed, int fuelCons){
        this.idn=idn;
        this.price=price;
        this.maxSpeed=maxSpeed;
        this.fuelCons=fuelCons;
    }


    public int getIdn() {
        return idn;
    }

    public void setIdn(int idn) {
        this.idn = idn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(int fuelCons) {
        this.fuelCons = fuelCons;
    }
}
