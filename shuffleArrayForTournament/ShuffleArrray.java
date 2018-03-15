import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A R
 */
public class ShuffleArray {

    /**
     * @param args the command line arguments
     */
    public static void shuffle(Object[] array){
        int numOfElements = array.length;
        //int arr[] = new int[numOfElements];
        for(int i=0; i< numOfElements; i++){
        
        int rand = 1 + (int)(Math.random()*(numOfElements -1));
        Object temp = array[rand];
        array[rand] = array[1];
        array[1] = temp;
        }
    }
    
    //Function for printing array in tournament
    public static void fixetures(int noTeam, String arrTeam[]){
                 
    for(int i=0;i<noTeam; i++){
		
        if(i%2==1){
            System.out.print(arrTeam[i]+" ");
            System.out.print("Vs"+" ");
        }
        if(i%2==0){
            System.out.print(arrTeam[i]+" ");
            System.out.println("\n");
        }
    }
        System.out.println();
    }
    
    
    
    
    public static void main(String[] args) {
        Random rand = new Random();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of team in the tournament !");
         int userInput = sc.nextInt();
         int numberOfTeam = userInput+1;
         String arrayTeam[] = new String[numberOfTeam];
         System.out.println("Enter the name of "+userInput +" team!");
         for(int i=0; i<numberOfTeam; i++){
             arrayTeam[i] = sc.nextLine();
         }
         ShuffleArray.shuffle(arrayTeam);
		 System.out.println("Matches will be fixed as :");
         fixetures(numberOfTeam, arrayTeam);
		 
         
 }
}
