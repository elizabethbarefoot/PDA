import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    Scanner scanner = new Scanner(System.in);
    int age = 0;
    int LOWER_BOUND = 14;
    int realMinAge = 0;
    int realMaxAge = 0;
    boolean shouldContinue = true;
    public void getYoungerAge() { 
        float getYoungerAge = age;
        realMinAge = Math.round((age/2)+7);
    }
    public void getOlderAge() {
        float getOlderAge = age;
        realMaxAge = Math.round(age-7)*2;
    }
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        System.out.println("Note: you can input 0 to quit the program");
        while (shouldContinue == true) {
            System.out.println("How old are you?");
            try { 
                age = scanner.nextInt();
                if (age == 0) {
                    System.out.println("Bye");
                    shouldContinue = false;
                }
                if (age < LOWER_BOUND && age != 0) {
                System.out.println(age  +" is too young!!");
            } else if (age != 0){
                getYoungerAge();
                getOlderAge(); 
                System.out.println("The age range goes from "+ realMinAge + " to "+ realMaxAge);
                }
            
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter an integer");
            } 
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

