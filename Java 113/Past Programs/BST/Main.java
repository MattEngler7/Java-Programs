import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Integer,Player>rank = new TreeMap<Integer,Player>();

		File myFile = new File("C:\\Users\\matts\\Downloads\\PlayersStats.txt");

		try 
		{
			Scanner myScanner = new Scanner(myFile);
			while(myScanner.hasNextLine()) 
			{
				String line = myScanner.nextLine();
				String[] tokens = line.split(",");
				rank.put(Integer.parseInt(tokens[0]), new Player (Integer.parseInt(tokens[0]), tokens[1].trim(), tokens[2].trim(), tokens[3].trim(), tokens[4].trim()));
			}
			myScanner.close();
			
			Set<Map.Entry<Integer, Player>> playerSet = rank.entrySet();
			
			for(Map.Entry<Integer, Player> player : playerSet) 
			{
				System.out.println(player.getValue());
			}
		}
		catch (Exception e)
		{
			System.out.println("File: Cannot be found");
		}
	}

}
