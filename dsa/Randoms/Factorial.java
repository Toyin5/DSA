// problem statement 
package dsa.Randoms;
import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) {
        System.out.println("Enter a number");
	    Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        System.out.println(factorialByLoop(number));
        System.out.println(factorialByRecursion(number));
        scanner.close();
    }

    public static int factorialByLoop(int n){
        int fact = 1;
        //your code goes here
        while(n > 0){
            //number=5
            fact *= n;
            //face = 5
            n--;
        }
        return fact;
    }

    public static int factorialByRecursion(int n){
        if (n <= 1) {
            return 1;
        }
        return (n * factorialByRecursion(n -1));
    }
}
