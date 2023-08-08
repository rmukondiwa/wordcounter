import java.util.Scanner;
public class Main {
    public static void main(String args[]) 
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the word counter or character counter. Do you want to track the words or characters? ");
      String firstUserInput = scan.nextLine();
      
      if (firstUserInput.equals("Count words") ||
    firstUserInput.equals("Track words") ||
    firstUserInput.equals("Words, please") ||
    firstUserInput.equals("I want to count words") ||
    firstUserInput.equals("Counting words") ||
    firstUserInput.equals("words") ||
    firstUserInput.equals("Words")) {
    // Handle word counting logic
        System.out.println("Type/Paste your text");

    String wordUserInput = scan.nextLine();
    String[] wordUserArray = wordUserInput.trim().split("\\s+");
    System.out.println(wordUserArray.length + " words!" );
} else if (firstUserInput.equals("Count characters") ||
           firstUserInput.equals("Track characters") ||
           firstUserInput.equals("Characters, please") ||
           firstUserInput.equals("I want to count characters") ||
           firstUserInput.equals("Counting characters") ||
           firstUserInput.equals("characters") ||
           firstUserInput.equals("Characters")){
    // Handle character counting logic
        System.out.println("Type/Paste your text");

    String charUserInput = scan.nextLine();
    System.out.println(charUserInput.length() + " characters!");
} else if (firstUserInput.equals("Both") ||
           firstUserInput.equals("Can I choose both?") ||
           firstUserInput.equals("Count words and characters") ||
           firstUserInput.equals("Words and characters") ||
           firstUserInput.equals("Both options") ||
           firstUserInput.equals("All of the above") ||
           firstUserInput.equals("Let me count both words and characters") ||
           firstUserInput.equals("both")) 
           {
    // Handle both words and characters counting logic
        System.out.println("Type/Paste your text");

    String bothUserInput = scan.nextLine();
    System.out.println(bothUserInput.length() + " characters!");
    String[] wordArray = bothUserInput.trim().split("\\s+");
    System.out.println(wordArray.length + " words!" );

           } 
else if (firstUserInput.equals("What's the difference between counting words and characters?") ||
           firstUserInput.equals("Can you explain the options?") ||
           firstUserInput.equals("How does this work?") ||
           firstUserInput.equals("What do you mean by tracking words/characters?")) {
    // Provide explanation or clarification
} else if (firstUserInput.equals("Exit") ||
           firstUserInput.equals("Cancel") ||
           firstUserInput.equals("Quit") ||
           firstUserInput.equals("Not interested") ||
           firstUserInput.equals("Help") ||
           firstUserInput.equals("Main menu")) {
    // Handle user's request to exit, cancel, or get help
    System.out.println("To stop, restart me!");
} else {
    // Handle unrecognized input
    System.out.println("Sorry, I do not understand you! Restart me!");
}
      
      
    }
}