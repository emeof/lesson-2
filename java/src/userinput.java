import java.util.Scanner;

public class userinput {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(input);

    scanner.close();
    }
}
