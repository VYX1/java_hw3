import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string to reverse: ");
        String input = scanner.next();
        String reversed = "";
        char character;

        for(int i=0; i<input.length(); i++) {
            character = input.charAt(i);
            reversed = character + reversed;
        }
    System.out.print(reversed);
    }
}