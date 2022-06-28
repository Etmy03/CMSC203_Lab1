import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		var playAgain="y";
		boolean play=true;
		int count=0;
		String movieName; 
		
		// Create a new object of type Scanner that reads from the keyboard
		Scanner keyboard = new Scanner(System.in);
				
		//Create a new movie object
		Movie myMovie = new Movie();
		
		do{
			/*
			 * Simply using the extra keyboard.nextLine(); did not help me solve the problem,
			 * so I used the if/else statement to change the first and second loop.
			 */
			
			//Prompt the user to enter the title of a movie 
			System.out.println("Enter the name of a movie ");
			movieName=keyboard.nextLine();
			
			//Read in the line that the user types
			//Set the title in the movie object
			if(count==0) {
				myMovie.setTitle(movieName);
				//input.nextLine();
			}
			else {
				myMovie.setTitle(keyboard.nextLine());
				keyboard.nextLine();
			}
			
			
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
			
			count++;
			
			System.out.println("Do you want to enter another? (y or n)");
			playAgain=keyboard.next();
			if(playAgain.equals("y")){
				play=true;
			}
			else {
				play=false;
			}
		}while(play);	
			
		
		
		
		
		System.out.println("Goodbye");

	}

}
