import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //This makes it say that
        System.out.println("Say something and I will repeat it.");

        //This allows the user to write something
        String input = sc.nextLine();

        //This outputs what the user has said
        System.out.println(input);

    }

}
