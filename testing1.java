import java.util.Scanner;
public class testing1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char: ");
        char character = sc.next().charAt(0);  // Replace 'a' with the character you want
        int ascii = (int) character;
System.out.println("The ASCII value of " + character + " is: " + ascii);

    }
}
