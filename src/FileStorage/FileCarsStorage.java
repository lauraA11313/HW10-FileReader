package FileStorage;


import Car.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringJoiner;

public class FileCarsStorage implements CarsStorage {



    private String inputFile;
    private String outputFile;
    Car[] cars = new Car[0];

    public FileCarsStorage(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Override
    public Car[] readCars() throws IOException {
        FileInputStream fis = new FileInputStream(inputFile);
        byte[] readBytes = new byte[fis.available()];
        fis.read(readBytes);
        String file = new String(readBytes);
        String[] dividedFile = file.split(";\r\n");
        System.out.print(Arrays.toString(dividedFile));

        for(String line:dividedFile){
            String [] carParameters = line.split(",");
            checkTypeOfCar(carParameters);
        }
        return cars;
    }

    @Override
    public void writeCars(Car[] carsToWrite) throws FileNotFoundException {
        StringJoiner joiner = new StringJoiner("\r\n");
        for(Car car: cars){
            joiner.add(car.toString());
        }
        String joinedCars=joiner.toString();
        try(FileOutputStream fos=new FileOutputStream(outputFile)){
            byte[] bytesFromString = joinedCars.getBytes();
            fos.write(bytesFromString, 0, bytesFromString.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }

    private void checkTypeOfCar(String [] carParameters){
        if(carParameters[carParameters.length-1].equals("PassengerCar")){
            Car car = new PassengerCar(carParameters);
            cars = extendCarArrayByNewCar(car);
            return;
        }
        if(carParameters[carParameters.length-1].equals("SportCar")){
            Car car = new SportCar(carParameters);
            cars=extendCarArrayByNewCar(car);
            return;
        }
        if(carParameters[carParameters.length-1].equals("Truck")){
            Car car = new Truck(carParameters);
            cars=extendCarArrayByNewCar(car);
            return;
        }
        if(carParameters[carParameters.length-1].equals("RefrigeratorCar")){
            Car car = new RefrigeratorCar(carParameters);
            cars=extendCarArrayByNewCar(car);
            return;
        }
        if(carParameters[carParameters.length-1].equals("Tank")){
            Car car = new Tank(carParameters);
            cars=extendCarArrayByNewCar(car);
        }

    }

    private Car [] extendCarArrayByNewCar(Car carToAdd){
        Car[] newCarArray=new Car[cars.length+1];
        for (int i=0; i<cars.length;i++)
            newCarArray[i]=cars[i];
        newCarArray[cars.length] = carToAdd;
        return newCarArray;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

}
