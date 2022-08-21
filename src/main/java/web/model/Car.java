package web.model;


public class Car {

    private String manufacturer;

    private String modelName;

    private int yearOfProduction;

    public Car() {}

    public Car(String manufacturer, String modelName, int yearOfProduction) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfProduction = yearOfProduction;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
