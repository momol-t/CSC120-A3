
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Conversation {

  public static void main(String[] args) {
    try (// Prompt user to enter number of rounds
    Scanner input = new Scanner(System.in)) {
      System.out.println("How many rounds?");
      int Rounds = input.nextInt();
      Random Rand = new Random();

      List<String> transcript = new ArrayList<String>();

      // Print greeting
      System.out.println("Hi there! What's on your mind?");

	transcript.add("Hi there! What's on your mind?");


        // Initialize variables
        String userInput;
        String cannedArray[] = {
            "Interesting, tell me more.",
            "That sounds like a challenging problem.",
            "That sounds like fun!",
            "That's cool!"
        };

        // Start conversation
        for (int count = 0; count <= Rounds; count++) {
            // Get user input
            userInput = input.nextLine();
            transcript.add(userInput);

            // Generate bot response
          String[] words = userInput.split(" ");
          String response = "";
          Boolean personal = false;
          for (int i = 0; i < words.length; i++) {
            if (i!=0){
              response+= " ";
            }
            if (words[i].equalsIgnoreCase("I")) {
              response += "You";
              personal = true;
            } else if (words[i].equalsIgnoreCase("you")) {
              response += "I";
              personal = true;
            } else if (words[i].equalsIgnoreCase("me")) {
              response += "you";
              personal = true;
            } else if (words[i].equalsIgnoreCase("am")) {
              response += "are";
              personal = true;
            } else if (words[i].equalsIgnoreCase("are")) {
              response += "am";
              personal = true;
            } else if (words[i].equalsIgnoreCase("my")) {
              response += "your";  
              personal = true;
            } else if (words[i].equalsIgnoreCase("your")) {
              response += "my";
              personal = true;
            } else {
              response += words[i];
            }
          }
        if (!personal) {
        // or if (response == userInput) {
          int index = Rand.nextInt();
          response = cannedArray[index % cannedArray.length];
          transcript.add(response);
        }
        
            // Print bot response
            System.out.println(response);
        }
      }
    // Print goodbye and conversation transcript
      System.out.println("Well, it was nice talking to you. Here is a transcript of our conversation:");
      //System.out.println(userInput);
      //System.out.println(response);
    System.out.println(Arrays.toString(transcript));
    
  }
}
