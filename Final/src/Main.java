import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> midSize = new LinkedList<String>();
		LinkedList<String> fullSize = new LinkedList<String>();
		LinkedList<String> compSize = new LinkedList<String>();
		
		File carFile = new File("C:\\Users\\be\\Downloads\\CarsReturned.txt");
		
		try
		{
			Scanner carScanner = new Scanner(carFile);//Car Scanner	
			
			while(carScanner.hasNextLine()) 
			{
				String line1 = carScanner.nextLine();
				String[] tokens1 = line1.split(",");
				String make = tokens1[0];
				String model = tokens1[1];
				String size = tokens1[2];
				if(line1.contains("Compact"))
				{
					compSize.add(make + " " + model + " " + size);
				}
				else if(line1.contains("Mid-size")) 
				{
					midSize.add(make + " " + model + " " + size);
				}
				else if(line1.contains("Full-size")) 
				{
					fullSize.add(make + " " + model + " " + size);
				}
			}
			carScanner.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		File resFile = new File("C:\\Users\\be\\Downloads\\Reservations.txt");
		
		try 
		{
			Scanner resScanner = new Scanner(resFile);
			
			while(resScanner.hasNextLine()) 
			{
				String line = resScanner.nextLine();
				String[] tokens = line.split(",");
				String name = tokens[0];
				String size1 = tokens[1];
				String elite = tokens[2];
				if(line.contains("true")) 
				{
					System.out.println(name + " " + fullSize.pollFirst() + " Has been upgraded");
				}
				else if(line.contains("Compact")) 
				{
					System.out.println(name + " " + compSize.pollFirst());
				}
				else if(line.contains("Mid-size")) 
				{
					System.out.println(name + " " + midSize.pollFirst());
				}
				else if(line.contains("Full-size")) 
				{
					System.out.println(name + " " + fullSize.pollFirst());
				}
				else if(line.contains("Full-size,false")) 
				{
					System.out.println(name + " " + midSize.pollFirst());
				}
				
				
				
			}
			resScanner.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}

}
