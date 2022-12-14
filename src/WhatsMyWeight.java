import java.util.*;
import static java.lang.System.*;

public class WhatsMyWeight {
	public static void main(String[] args) {
		Scanner input = new Scanner(in);
		int choice;
		double weight, newWeight;
		String planet;
		
		out.println("Enter weight:");
		weight = input.nextDouble();
		out.println("\t\tMenu\n1.\tVoltar\n2.\tKrypton\n3.\tFertos\n4.\tPlanet X\n\tYour Selection:");
		choice=input.nextInt();
		planet = getPlanet(choice);
		if(planet.equals("Not a valid option")) 
		{
			out.println(planet);
		}
		newWeight = getWeight(planet, weight);
		out.println(weight+" on "+planet+" is converted to "+String.format("%.3f",newWeight));		
        input.close();	
	}

	public static String getPlanet(int choice) {
        if (choice == 1) {
            return "Voltar";
        }
        else if (choice == 2) {
            return "Krypton";
        }
        else if (choice == 3) {
            return "Fertos";
        }
        else if (choice == 4) {
            return "Planet X";
        }
        else {
            return "Not a valid option";
        }
    }
	
	public static double getWeight(String planet, double weight) {
        if (planet.equals("Voltar")) {
            return weight * 0.158;
        }
        else if (planet.equals("Krypton")) {
            return weight * 0.846;
        }
        else if (planet.equals("Fertos")) {
            return weight * 1.269;
        }
        else if (planet.equals("Planet X")) {
            return weight * 0.020;
        }
        else {
            return 0;
        }
    }
	
}
