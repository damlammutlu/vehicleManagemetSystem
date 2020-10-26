package vehiclemanagementsystem;

/**
 *
 * @author Damla
 */
public class VehicleManager {
    IVehicle vehicle;
    
    public void getVehicle()
    {
        vehicle.info();
    }
    
    public void setVehicle(String brand)
    {
        vehicle.describe(brand);
    }
}
