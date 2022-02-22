/* Name: Ayman Hossain
 * Program: Computer Programming
 * Course: SYST17796
 * Assessment: Midterm Exam Part C
 *
 * Prompts the use for id and preferred genre values to test the instantiation
 * of the UserProfile class in the same package.
 *
 */



package midtermexam_versiona_extensioncode;

import java.util.Scanner;



// The question on the quiz specified that the class be called
// "TestUserprofile" rather than "TestUserProfile" as might be advisable by
// style standards.
public class TestUserprofile
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Prompts for and records entered userID.
        System.out.print("User Profile Creation\nEnter your name: ");
        String userId = in.nextLine();

        // Initializing an array so that input can be received as an offset
        // index.
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
       
        // Variable to store user response as it is validated.
        String genreResponse = "";
        
        // Flag to exit loop when the selection is valid.
        boolean genreValid;

        // Loop repeatedly prompts user for preferred genre until input is valid.
        // Validation is done via regex.
        do {

        genreValid = true;

        System.out.print("Indicate your preferred Genre by entering the number"
                + " next to your selection.\n1. Comedy\n2. Drama\n3. Action"
                + "\n4. Mystery\nYour selection: ");
        
        genreResponse = in.nextLine();
        
        if (genreResponse.matches("[^1-4]"))
        {
            System.out.println("Error: Valid selection must be an integer"
                    + " from 1 to 4");

            genreValid = false;
        }

        } while (!genreValid);

        // Instantiating UserProfile based on input values.
        UserProfile profile = new UserProfile(userId, genres[Integer.parseInt(genreResponse) - 1]);

        // Displaying indication of created profile with its values.
        System.out.printf("User profile with id: %s and favourite genre: %s"
                + " has been created.", profile.getUserID(), profile.getGenre());
 

    }

}
