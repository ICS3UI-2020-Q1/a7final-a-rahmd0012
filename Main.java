import java.util.Scanner;
/**
 * a program that shows the user how many 1's there are in their entered number
 * @author Daniel Rahmani
 */
public class Main {

  public static int countOnes(int number){
    // create a do while loop
    do{
      // get the mod of the numbers until it gets them all
      number = number / 10;
      // create and if statement
      if(number == 1){
        number = number + number;
      }  
    }while(number >= 10);
    
    
    int countOnes = number;
    return countOnes;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter a number");
    int n = input.nextInt();
    // calculate the number of ones there are
    int answer = countOnes(n);
    System.out.println(answer);
    
  }
}
