import FileStorage.CarsStorage;
import FileStorage.FileCarsStorage;
import TaxiPark.TaxiPark;

import java.io.IOException;

import Car.*;


public class Processor {

    public static void main(String[] args) throws IOException {
       /*  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

       Car[] cars = new Car[n];

        cars[1] = new SportCar(1, 2000000, 300, 100, 728);
        cars[2] = new PassengerCar(2, 68000, 250, 11.4, 5);
        cars[3] = new PassengerCar(3, 20100, 210, 6.4, 5);
        cars[4] = new Tank(4, 60000, 180, 16.7, 15000, 100);
        cars[5] = new RefrigeratorCar(5, 96000, 200, 18.9, 11000, 2);
        cars[6] = new SportCar(6, 390000, 410, 20.8, 1400);
        cars[7] = new Tank(7, 35000, 16000, 11.5, 13000, 55);
        cars[8] = new PassengerCar(8, 80000, 290, 9.3, 7);
        cars[9] = new PassengerCar(9, 16000, 270, 7.2, 5);
        cars[0] = new SportCar(10, 90000, 350, 12.1, 1600);
*/

        CarsStorage storage = new FileCarsStorage("src/FileStorage/input.txt", "output.txt");
        Car[] cars=storage.readCars();

        TaxiPark tp = new TaxiPark(cars);
        //System.out.println(tp.totalCost());
        //System.out.print("Мин скорость ");
        //int minSpeed = Integer.parseInt(stdin.readLine());
        //System.out.print("Макс скорость ");
        //int maxSpeed = Integer.parseInt(stdin.readLine());
        //System.out.println(tp.speedRange(maxSpeed, minSpeed));

        tp.sortByFuelConsumption();
        System.out.print(tp);
        storage.writeCars(tp.getCars());


    }
}
