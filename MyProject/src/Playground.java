import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.572458875;
        boolean isEmployed = true;

        System.out.printf("Hello %s%n", name);
        System.out.printf("Your name starts with %c\n",firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f inches tall\n",height);
        System.out.printf("Employed %b", isEmployed);
        System.out.printf("%.3f\n",12.231423);
        System.out.println(Math.round(height));
        System.out.printf("%.2f",height);

    }
}
