
package vehiclemanagementsystem;
import java.util.*;
/**
 *
 * @author Damla
 */
public class VehicleManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MainMenu mainMenu=new MainMenu();
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.nextLine();
        System.out.println("Choice:"+choice);
        VehicleManager vehicleManager = new VehicleManager();
        
        switch(choice)
        {
            case "1":
                DataInput dataInput=new DataInput();
                Scanner scanner1=new Scanner(System.in);
                String choice1=scanner1.nextLine();
                switch(choice1){
                    case "1":
                        Scanner scanner2=new Scanner(System.in);
                        String choice2=scanner2.nextLine();
                        vehicleManager.vehicle=new Car();
                        vehicleManager.setVehicle(choice2);
                        
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    case "<":
                        break;
                    case "X":
                        break;
                }
                break;
            case "2":
                break;
            case "3":
                break;
            case "X":
                break;
        }
        
        vehicleManager.getVehicle();
       
    }
    
}
