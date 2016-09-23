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
      String puzzle = "The quick brown fox jumps over the lazy dog";
      String input = " ";
      Scanner guess = new Scanner (System.in);
      boolean notSolved = true;
      while (notSolved){
          notSolved = false;
          for (char unvieldLetter: puzzle.toCharArray()) {

              if (input.indexOf(unvieldLetter) == -1) {
                  System.out.print("_ ");
                  notSolved = true;
                  
              }
              else{
                  System.out.print(unvieldLetter);
              }
          }
          if (! notSolved ) {
              break;
              
          } 
           
             
             
      
      
     System.out.println("\n"
             + "                   ======================\n    "
             + "               =  Wheel Of Fortune  =\n    "
             + "               ======================\n"
             + "1. Spin the wheel\n"
             + "2. Buy a vowel\n"
             + "3. Solve the puzzle\n"
             + "4. Quit\n"
             + "8. Toggle Puzzle\n"
             + "9. Test letter input\n"
             + "Enter choice:    ");
     
     
     
     action = scanner.next();
//     Here if the user input does not equal 0 it will then go through the following loop. 
     while ((action != "0")){
         
         
//         if the user inputs 1, it go through the following if statement.
//         Since the first action is to spin the wheel this if statement calls the WheelSpin() method below to get a random value.
         if ("1".equals(action)) {
         
         action = "You choose to spin the wheel.";

         wheelSpin();
         createPuzzle();


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
//         If user enters 2, they are asked which vowel they want to buy. Currently this does nothing and will be dealt with later.
         if ("2".equals(action)){ 
         action = "You choose to buy a vowel.";
         System.out.println("What vowel are you going to buy?:");
         letter = scanner.next();
         System.out.println("You choose to buy:" + letter);
     }
//      If the user inputs 3, they will be allowed to solve the puzzle. Currently this does nothing and will be dealt with later.   
         if ("3".equals(action)){ 
         action = "You choose to solve the puzzle.";

     }
//         If the user enter 4, they quit the application.
           if ("4".equals(action)) 
         {action = "You choose to quit.";
         System.out.println(action);

         System.exit(0);
     }
//           If user inouts 8 in menu it will show them the puzzle. Coud not do this during puzzle solving 
           
           if ("8".equals(action)) // when the user chooses 4, the game quits
         {
             System.out.println(puzzle);
             
             int num; 
             Scanner in = new Scanner(System.in);
             System.out.println("Press 8 again to untoggle");
             num = in.nextInt();
             
             if(num%2 == 0)
                 System.out.println(num);
             action();
               
          }

//           This mode is meant for QA testers to make sure the game works properly
           if ("9".equals(action)) 
         {action = "QA Test Mode.";

     }
        
         action();
     }
     System.out.println("\nEnter a Letter");
      String character = guess.next();
      input += character;
      }
      
      
  }
//  Here I created a wheelSpin method. Which, I listed the wheel values in an array. 
//  Then I created a random variable which goes through the array and picks a value at random.
//  This value is then showed to the user. No need to add values yet. Not keeping track of 'money won'.
  public static void wheelSpin(){
      String [] wheelValues = {"$300","$300","$300","$300","$300","$350","$400",
          "$400","$450","$500","$500","$500","$550","$600","$600","$600","$700","$800"
              , "$800","$900","$900","$5000","BANKRUPT", "LOSE A TURN"};
      Random randValue = new Random();
      int index = randValue.nextInt(wheelValues.length);
      System.out.println("You landed on:" + wheelValues[index]);

    }
//  The below method creates the puzzle. And it waits for the users input. As the user enters a letter the puzzle is unvaild one by one.
  public static void createPuzzle(){
      String puzzle = "The quick brown fox jumps over the lazy dog";
      String input = " ";
      Scanner guess = new Scanner (System.in);
      boolean notSolved = true;
      while (notSolved){
          notSolved = false;
          for (char unvieldLetter: puzzle.toCharArray()) {

              if (input.indexOf(unvieldLetter) == -1) {
                  System.out.print("_ ");
                  notSolved = true;
                  
              }
              else{
                  System.out.print(unvieldLetter);
              }
          }
          if (! notSolved ) {
              break;
              
          } 
           
             
             
      System.out.println("\nEnter a Letter");
      String character = guess.next();
      input += character;
      }
  }
  }
