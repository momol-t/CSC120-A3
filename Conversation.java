
import java.util.Random;
import java.util.Scanner;

class Conversation {

  public static void main(String[] args) {
    // Prompt user to enter number of rounds
    Scanner input = new Scanner(System.in);
    System.out.println("How many rounds?");
    int Rounds = input.nextInt();

    // Print greeting
    System.out.println("Hi there! What's on your mind?");



      // Initialize variables
      String userInput;
      String response;
      String[] responses = {
          "Interesting, tell me more.",
          "That sounds like a challenging problem.",
          "That sounds like fun!",
          "That's cool!"
      };

      // Start conversation
      for (int i = 0; i <= Rounds; i++) {
          // Get user input
          userInput = nextLine();

          // Generate bot response
          if (userInput.contains("I") || userInput.contains("you")|| userInput.contains("you")) {
              // Mirror user input
              response = userInput.replace("I", "you").replace("you", "I");
          } else {
              // Select random response
              Random rand = new Random();
              int randIndex = rand.nextInt(responses.length);
              response = responses[randIndex];
          }

          // Print bot response
          System.out.println(response);
      }

      // Print goodbye and conversation transcript
      System.out.println("Well, it was nice talking to you. Here is a transcript of our conversation:");
      //System.out.println(userInput);
      //System.out.println(response);
    }
  }

