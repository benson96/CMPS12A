import java.util.Random;
import java.util.Scanner;

public class Guess{
  public static void main(String[] args) {
      
      int NumberToGuess;
      NumberToGuess = (int) (Math.random() *9 + 1);
   
      int x, N=NumberToGuess ;
      Scanner sc = new Scanner(System.in);
      System.out.print("I'm thinking of an integer in the range 1 to 10. You have three guesses.\n Enter your first guess: ");
      x = sc.nextInt();
       
      if( x<N ){
          System.out.println("Your guess is too low.");
      }else if ( x==N ){
          System.out.println("You win!");
      }else{
          System.out.println("your guess is too high.");
      }
      
      int y, P=NumberToGuess;

      System.out.print("\nEnter your second guess: ");
      y = sc.nextInt();
 
      if( y<P ){
          System.out.println("Your guess is too low.");
      }else if ( x==P ){ 
          System.out.println("You win!");
      }else{
          System.out.println("your guess is too high.");
      }
      
      int z, Q=NumberToGuess;

      System.out.print("\nEnter your third guess: ");
      z = sc.nextInt();

      if( z==Q ){
         System.out.println("You win!");
      }else{
         System.out.println("You Lose!");
      }

      System.out.println("Secret number is " + NumberToGuess);
   }
}
