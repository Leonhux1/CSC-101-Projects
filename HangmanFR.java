/*Name = Faizan Rafieuddin.
  Description = "This program is based on the game 'Hangman'.
                 This program asks the first player to enter
                 any word/sentence and the number of guesses the other
                 player would be allowed. After that, the game
                 begins, and player 2 is asked for alphabets. Every
                 time he/she guesses an alphabet wrong, a guess is 
                 subtracted from the total number of guesses he/
                 she has, until he/she gets exhausted of guesses,
                 in which case, the game ends. Otherwise, if the
                 word/sentence is guessed correctly, a winning message is
                 displayed to the player currently playing. */

// Importing the java.util package for the Scanner class and other useful classes.
import java.util.*;

// Creating the class named HangmanFR, with the access type public. It is a static method and with a return type of void.
class HangmanFR {
   public static void main(String args[]) {
      // Creating the Scanner object for catching input.
      Scanner input = new Scanner(System.in);
      
      // Declaring and initializing all of the necessary variables to be used in the program.
      String word, alphabet, checkWin, checkWin2;
      int guess, tracker, finalTracker;
      
      tracker = 0;
      
      finalTracker = 0;
      
      /* Printing out the prompt (for the first user) to enter the word/sentence to be guessed for the second user and
         catching the input in a variable. */
      System.out.println("Welcome to Hangman. Player 1, enter the mystery word or phrase.");
      word = input.nextLine();
     
      /* Printing out the prompt (for the first user) to enter the number of guesses the second user has and catching
         the input in a variable. */
      System.out.println("How many missed guesses is player 2 allowed?");
      guess = input.nextInt();
      
      // Printing out enough blank lines so that player 2 doesn't get to see the word/sentence player 1 entered for his/her guessing.
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      
      // Declaring and creating an array of the length as similar to length of the word/sentence player 1 enters.
      String[] array = new String[word.length()];
      
      // If a space is encountered anywhere in the word/sentence, a space is added in the array at the same index as in the word/sentence.
      for(int count = 0; count < array.length; count ++) {
         if(Character.toString(word.charAt(count)).equals(" ")) {
            array[count] = " ";
         }
         else if(count == array.length - 1) {
            array[count] = "_.";
         }
         // If a word is encountered in the loop, an underscore is inserted in the array at teh same index as in the word/sentence.
         else {
            array[count] = "_ ";
            tracker ++;       // the number of the variable 'tracker' is increased by one.
         }
         
          
      }
      /* The prompt message is displayed for player 2, which is an indicative that the game is ready, and he/she can start
         entering alphabets. */
      System.out.println("Welcome Player 1. Below is your mystery phrase. You are allowed");
      System.out.println("3 missed guesses before you lose. Enter a letter.\n");
      
      // Printing the contents of the array, or the current guessed word/sentence.
      for (String value: array) {
         System.out.print(value);
         
      }
      System.out.println("\n");     // Printing a newline.
      
      // While the guesses are not exhausted, this block will execute repeatedly.
      while(guess > 0) {
         // Initializing two variables that will be used for checking if the player has won or not, so the program can act accordingly.
         checkWin = "";
         checkWin2 = "";
         
         /* Capturing the input of player 2 in the variable 'alphabet'. In case player 2 enter more than one alphabet,
            only the alphabet at the first place is utilized as his/her input. */
         alphabet = Character.toString(input.next().charAt(0));
         
         // If the alphabet is present in the word/sentence, this block will execute.
         if(word.toLowerCase().contains(alphabet.toLowerCase() + "")) {
         
            /* This block will iterate through the entire array, and cross check its contents with the alphabet that
               is entered. If the alphabet is already in there, nothing happens, if it is not in there, it is addded
               in the array. */
            for(int count2 = 0; count2 < word.length(); count2 ++) {
               if(Character.toLowerCase(word.charAt(count2)) == Character.toLowerCase(alphabet.charAt(0))) {
                  array[count2] = array[count2].replace('_', alphabet.charAt(0));
               }
            }
          
            System.out.println();      // Leaving a blank line.
           
            // Printing out the current array.
            for(String value2 : array) {
               System.out.print(value2);
            }
            /* For each execution of the while loop, the code below checks whether the contents of the array match
               the original word/sentence by iterating through the entire array, and adding all of the elements in
               the array to a single variable. Then, that variable is checked to be equal to the original word/sentence.
               If the contents match perfectly, i.e. player 2 wins, the print statement with the number of guesses is not
               printed. If the player does not win, and the game is still in sequence, that statement is printed. */
            if(word.length() == array.length) {
               for(String value4 : array) {
                  checkWin += value4.replace(" ", "").replace(".", "");
               }
               if(checkWin.toLowerCase().equals(word.replace(" ", "").toLowerCase()) == false) {
                  System.out.println();
                  System.out.println("\nWell done. You have " + guess + " guesses remaining.");
                  System.out.println();
               }
            }
         
         }
         
         /* If the alphabet entered by the user does not match to any alphabet in the original word/sentence, this block
            of code gets executed. */
         else {
            guess --;      // Firstly, the number of guesses is subtracted by one.
            
            // A blank line is printed along with the current state of the array.
            System.out.println();
            for(String value3 : array) {
               System.out.print(value3);
            }
            /* A message is printed showing player 2 that the word/sentence is incorrect and also shows the number of guesses
               he/she has left. */
            System.out.println("\n\nThat letter is not present. You have " + guess + " missed guesses left.");
            System.out.println();
         }
          
         // If the guesses are exhausted, a loosing message is printed.
         if(guess == 0) {
            System.out.println();   
            System.out.println("Sorry, you lose.");
         }
         /* For each execution of the while loop, the code below checks whether the contents of the array match
            the original word/sentence by iterating through the entire array, and adding all of the elements in
            the array to a single variable. Then, that variable is checked to be equal to the original word/sentence.
            If the contents match perfectly, i.e. player 2 wins, the print statement with the number of guesses is not
            printed. If the player does not win, and the game is still in sequence, that statement is printed. 
            Also, if player 2 wins, a winning message is printed.*/

         if(word.length() == array.length) {
            for(String value4 : array) {
               checkWin2 += value4.replace(" ", "").replace(".", "");
            }
            if(checkWin.toLowerCase().equals(word.replace(" ", "").toLowerCase())) {
               System.out.println();
               System.out.println("\nWell done. You win the Game!");
               guess = 0;
            }
          
         }
      }   
   }
}
     