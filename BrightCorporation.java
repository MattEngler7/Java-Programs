//Matt Engler Tuesday 6-10pm
//CIS 111
//Code is designed to enhance security and prevent an individual from stealing
//corporate secrets.
import java.util.Scanner;
public class BrightCorporation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i%2==0)
        System.out.println("Even number");

        else
          System.out.println("Odd number");


    }
}
