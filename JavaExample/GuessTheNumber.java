import java.io.*;
import java.util.*;
public class GuessTheNumber {
    int max;
    int num;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    public void play(){
        System.out.println("Welcome to the Number Game Let's Play!");
        System.out.println("Enter the maximum number between which you want to guess !");
        max = sc.nextInt();
        num = Math.abs(random.nextInt()) % max;
        System.out.println("Enter the number you Guess !");
        while(true){
	    int insert = sc.nextInt();
            if(insert > num){
                System.out.println("Your Number is BIG!");
            }else if(insert < num){
                System.out.println("Your Number is Small !");
            }else{
                System.out.println("You Got My BRO, You Are Awesome !");
                break;
            }
        }
    }
    public static void main(String args[]) {
        GuessTheNumber guess = new GuessTheNumber();
        guess.play();
    }
}
