import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);
        
       String name = scanner.nextLine();
       System.out.println(name);
    }
}