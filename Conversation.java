
import java.util.Random;
import java.util.Scanner;

class Conversation {

  public static void main(String[] args) {
    try (// Prompt user to enter number of rounds
    Scanner input = new Scanner(System.in)) {
      System.out.println("How many rounds?");
      int Rounds = input.nextInt();

      // Print greeting
      System.out.println("Hi there! What's on your mind?");



        // Initialize variables
        String userInput;
        String[] responses = {
            "Interesting, tell me more.",
            "That sounds like a challenging problem.",
            "That sounds like fun!",
            "That's cool!"
        };

        // Start conversation
        for (int count = 0; count <= Rounds; count++) {
            // Get user input
            userInput = input.nextLine();

            // Generate bot response
          String[] words = userInput.split(" ");
          String response = " ";
          for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("I")) {
              response += "You";
            } else if (words[i].equalsIgnoreCase("you")) {
              response += "I";
            } else if (words[i].equalsIgnoreCase("me")) {
              response += "you";
            } else if (words[i].equalsIgnoreCase("am")) {
              response += "are";
            } else {
              response += words[i];
            }
          response += " ";
          }
        


            // Print bot response
            System.out.println(response);
        }
    }
    // Print goodbye and conversation transcript
      System.out.println("Well, it was nice talking to you. Here is a transcript of our conversation:");
      //System.out.println(userInput);
      //System.out.println(response);
    }
  }

