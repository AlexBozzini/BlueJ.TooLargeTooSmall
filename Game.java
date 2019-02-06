
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Game {
  public static void main (String [] args){
      Scanner numberGuess = new Scanner(System.in);
      
      Random rand = new Random();
      int number = rand.nextInt(100);
      int tries = 0;
      Scanner input = new Scanner(System.in);
      int guess;
      boolean win = false;
      
      while (win == false){
          System.out.println("Guess a number between 1 and 100");
          guess = input.nextInt();
          tries ++;
          
          if (guess == number){
              win = true;
            } else if (guess < number){
                System.out.println("Number is too low, try again");
            } else if (guess > number){
                System.out.println("number is too high, try again");
            }
        }
        System.out.println("You win!");
        System.out.println("It took you "+ tries +" tries.");
      
      
          
      
      
      
      
        
        
      
  
        
        }

    }
