package Car;

public class SportCar extends Car{

    private int weight;
    public SportCar(String [] carParameters){
        super(Integer.parseInt(carParameters[0]), Integer.parseInt(carParameters[1]),
                Integer.parseInt(carParameters[2]), Integer.parseInt(carParameters[3]));
        this.weight=Integer.parseInt(carParameters[4]);
    }

    public int getWeight() {
        return weight;
    }
    public String toString(){
        return String.format(getIdn() +","+ getPrice() +","+ getMaxSpeed()+","+ getFuelCons()
                +","+getWeight()+","+this.getClass().getSimpleName()+";");
    }
}
