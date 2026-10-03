import java.util.Scanner;

public class SolarEnergyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter morning energy generation (in kWh):"); 
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy generation (in kWh):"); 
        double evening = sc.nextDouble();
        
        double totalEnergy = morning + evening;
        System.out.println("Total energy generated:" + totalEnergy + "kWh");
        
        sc.close();
    }
}

