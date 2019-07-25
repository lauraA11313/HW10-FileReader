package Car;
import CarInterface.ISomePassengerCar;

import java.net.Inet4Address;


public class PassengerCar extends Car implements ISomePassengerCar {

    private int idn;
    private int price;
    private int maxSpeed;
    private int fuelCons;
    private int seatsNum;


    public PassengerCar(String [] carParameters){
        super(Integer.parseInt(carParameters[0]), Integer.parseInt(carParameters[1]),
                Integer.parseInt(carParameters[2]), Integer.parseInt(carParameters[3]));
        this.seatsNum= Integer.parseInt(carParameters[4]);
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public String toString(){
        return String.format(getIdn() +","+ getPrice() +","+ getMaxSpeed()+","+ getFuelCons()+","+getSeatsNum()+","+this.getClass().getSimpleName()+";");
    }
}
