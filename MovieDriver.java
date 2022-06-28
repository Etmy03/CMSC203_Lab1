import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// Create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
				
		//Create a new movie object
		Movie myMovie = new Movie();
		
		//Prompt the user to enter the title of a movie 
		System.out.println("Enter the name of a movie ");
		
		//Read in the line that the user types
		//Set the title in the movie object
		myMovie.setTitle(keyboard.nextLine());

		//Prompt the user to enter the movie’s rating
		System.out.println("Enter the rating of the movie ");
		
		//Read in the line that the user types
		//Set the rating in the movie object
		myMovie.setRating(keyboard.nextLine());
		
		//Prompt the user to enter the number of tickets sold at a (unnamed) theater
		System.out.println("Enter the number of tickets sold for this movie ");
		
		//Read in the integer that the user types
		//Set the number of tickets sold in the movie object
		myMovie.setSoldTickets(keyboard.nextInt());
		
		//Print out the information using the movie’s toString method
		System.out.println(myMovie.toString());	

		System.out.println("Goodbye");

	}

}
