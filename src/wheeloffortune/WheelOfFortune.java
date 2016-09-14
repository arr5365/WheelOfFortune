/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* TODO: DON'T FORGET TO PUT YOUR NAME AND ID
* Student: Andrew Rooney.
* ID: arr5365
*/
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {
      String action;
      String letter;
      Scanner scanner = new Scanner(System.in);
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      action();
  }
  
  public static void action(){
      String action;
      String letter;
      Scanner scanner = new Scanner(System.in);
      
     System.out.println("\nWhat do you want to do? \nEnter:1 To Spin the Wheel., \nEnter:2 To buy a Vowel., "
             + "\nEnter:3 To Solve the Puzzle. \nEnter:4 To Quit. \nEnter 5: QA Tester.");
     action = scanner.next();
     System.out.println(action);
     
     while ((action != "0")){
         if ("1".equals(action)) {
         action = "You choose to spin the wheel.";
         System.out.println(action);
         System.out.println("Choose a letter:");
         letter = scanner.next();
            if (letter.matches("[A-z]")){
                System.out.println("You choose the letter:"+ letter);
                action();
                }
                else{
                 System.out.println("Invalid letter, try again");
                   action();
                    }
         }
         if ("2".equals(action)){ 
         action = "You choose to buy a vowel.";
         System.out.println(action);
         System.out.println("What vowel are you going to buy?:");
         letter = scanner.next();
         System.out.println("You choose to buy:" + letter);
     }
         if ("3".equals(action)){ 
         action = "You choose to solve the puzzle.";
         System.out.println(action);
     }
         if ("4".equals(action)) 
         {action = "You choose to quit.";
         System.out.println(action);
         System.exit(0);
     }
           if ("5".equals(action)) 
         {action = "QA Test Mode.";
         System.out.println(action);
        
     }
         
         action();
     }
      
  }
  }
  
