import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

       public static void main(String[] args) throws FileNotFoundException {

             TreeMap<Integer,Player> playerBst = new TreeMap<Integer,Player>();

             File file = new File("Macintosh HD⁩\\Users⁩\\⁨MattEngler⁩\\⁨Downloads⁩\\PlayerStats.txt");

             try

             {

                    Scanner myScanner = new Scanner(file);

                    while(myScanner.hasNextLine())

                    {

                           String line = myScanner.nextLine();

                           String[] tokens = line.split(",");

                           playerBst.put(Integer.parseInt(tokens[0]), new Player(Integer.parseInt(tokens[0]), tokens[1],tokens[2],tokens[3],tokens[4]));

                    }

                   

                    myScanner.close();

                    Set<Map.Entry<Integer,Player>> playerSet= playerBst.entrySet();

                    for(Map.Entry<Integer, Player> player: playerSet)

                    {

                           System.out.println(player.getValue());

                    }

                   

                   

             }catch (Exception e) 
             {
            	 System.out.println("File : PlayersStats.txt doesn't exist");
             }
 

       }

}
