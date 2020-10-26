package vehiclemanagementsystem;

/**
 *
 * @author Damla
 */
public class Car extends LandVehicle {

    private String brand, color, fuelType;
    private int speed, numberOfPassenger, cost, numberOfWheels, yearOfProduction;
   
    @Override
    public void acceleration() {
        System.out.println(brand+"car acceleration");
    }

    @Override
    public void brake() {
         System.out.println(brand+"car slowed down");
    }

    @Override
    public void stop() {
        System.out.println(brand+"car stopped");
    }
    @Override
    public void describe(String brand) {
        setBrand(brand);
        
    }
      @Override
    public void info() {
          System.out.println(getBrand());
        
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the numberOfPassenger
     */
    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    /**
     * @param numberOfPassenger the numberOfPassenger to set
     */
    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the numberOfWheels
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param numberOfWheels the numberOfWheels to set
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * @return the yearOfProduction
     */
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * @param yearOfProduction the yearOfProduction to set
     */
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

  

    
    
}
