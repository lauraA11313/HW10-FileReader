package FileStorage;

import Car.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface CarsStorage {

    Car[] readCars() throws IOException;

    void writeCars(Car[] carsToWrite) throws FileNotFoundException;

}
