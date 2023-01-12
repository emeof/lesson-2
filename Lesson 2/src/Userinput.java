import java.util.Scanner; //importing a scanner object

public class Userinput { //Create user input class
    


    public static void main(String[]args){ //Method. Start to create stuff
        Scanner scanner = new Scanner(System.in); //create scanner object
        System.out.println("Enter a string: "); //print out string 
        String input = scanner.nextLine(); //store user as an input variable
        System.out.println(input); //print out the users input
        scanner.close(); //closes the scanner 


    }
}
