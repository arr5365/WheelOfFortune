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
import java.util.Random;


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
      
     System.out.println("                   ======================\n    "
             + "               =  Wheel Of Fortune  =\n    "
             + "               ======================\n"
             + "1. Spin the wheel\n"
             + "2. Buy a vowel\n"
             + "3. Solve the puzzle\n"
             + "4. Quit\n"
             + "9. Test letter input\n"
             + "Enter choice:    ");
     action = scanner.next();
     System.out.println(action);
//     Here if the user input does not equal 0 it will then go through the following loop. 
     while ((action != "0")){
//         if the user inputs 1, it go through the following if statement.
//         Since the first action is to spin the wheel this if statement calls the WheelSpin() method below to get a random value.
         if ("1".equals(action)) {
//         action = "You choose to spin the wheel.";
//         System.out.println(action);
         wheelSpin();
         System.out.println("Choose a letter:");
         letter = scanner.next();
//         Below checks the users input, only allows for letter input.
            if (letter.matches("[A-z]")){
                System.out.println("You choose the letter:"+ letter);
                action();
                }
                else{
                 System.out.println("Invalid letter, try again");
                   action();
                    }
         }
//         
         if ("2".equals(action)){ 
//         action = "You choose to buy a vowel.";
//         System.out.println(action);
         System.out.println("What vowel are you going to buy?:");
         letter = scanner.next();
         System.out.println("You choose to buy:" + letter);
     }
         if ("3".equals(action)){ 
//         action = "You choose to solve the puzzle.";
//         System.out.println(action);
     }
         
           if ("4".equals(action)) 
         {action = "QA Test Mode.";
         System.out.println(action);
        
     }
           if ("9".equals(action)) 
         {action = "You choose to quit.";
         System.out.println(action);
         System.exit(0);
     }
        
         action();
     }
  
  }
//  Here I created a wheelSpin method. Which, I listed the wheel values in an array. 
//  Then I created a random variable which goes through the array and picks a value at random.
//  This value is then showed to the user. No need to add values yet. Not keeping track of 'money won'.
  public static void wheelSpin(){
      String [] wheelValues = {"$300","$300","$300","$300","$300","$350","$400",
          "$400","$450","$500","$500","$500","$550","$600","$600","$600","$700","$800"
              + "$800","$900","$900","$5000","BANKRUPT", "LOSE A TURN"};
      Random randValue = new Random();
      int index = randValue.nextInt(wheelValues.length);
      System.out.println("You landed on:" + wheelValues[index]);

    }
  }
