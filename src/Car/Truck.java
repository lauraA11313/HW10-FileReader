package Car;

import CarInterface.ISomeTruck;

public class Truck extends Car implements ISomeTruck {

    private int idn;
    private int price;
    private int maxSpeed;
    private int fuelCons;
    private int loadCapacity;

    public Truck(String [] carParameters){
        super(Integer.parseInt(carParameters[0]), Integer.parseInt(carParameters[1]),
                Integer.parseInt(carParameters[2]), Integer.parseInt(carParameters[3]));
        this.loadCapacity=Integer.parseInt(carParameters[4]);
    }


    public String toString(){
        return String.format(getIdn() +","+ getPrice() +","+ getMaxSpeed()+","
                + getFuelCons()+","+getLoadCapacity()+","+this.getClass().getSimpleName()+";");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

