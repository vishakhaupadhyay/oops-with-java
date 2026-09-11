
import java.util.Scanner;

public class agevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        try {
            agecheck(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

    static void agecheck(int a) throws InvalidAgeException {
        if (a < 18)
            throw new InvalidAgeException("Age is invalid");
        
        System.out.println("Age is valid");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

