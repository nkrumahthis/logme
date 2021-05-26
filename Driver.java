import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Main
 */
public class Driver {

    private static int add(int a, int b){
        return(a + b);
    }

    private static int subtract(int a, int b){
        return (a - b);
    }

    private static int multiply(int a, int b){
        return (a * b);
    }

    private static double divide(int a, int b){
        return (b != 0 ) ? (a / b) : 0.0;
    }

    private static void adder(BufferedReader reader){
        
        try {
            System.out.println("Enter First integer to add:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Enter First integer to add:");
            int b = Integer.parseInt(reader.readLine());
            
            int r = add(a,b);

            System.out.println(String.format("%d + %d = %d", a,b,r));

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    private static void subtracter(BufferedReader reader){
        
        try {
            System.out.println("Enter integer to subtract from:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Enter integer to subtract:");
            int b = Integer.parseInt(reader.readLine());
            
            int r = subtract(a,b);

            System.out.println(String.format("%d - %d = %d", a,b,r));

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    private static void multiplier(BufferedReader reader){
        
        try {
            System.out.println("Enter integer to multiply:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Enter integer to be multiplied:");
            int b = Integer.parseInt(reader.readLine());
            
            int r = multiply(a,b);

            System.out.println(String.format("%d × %d = %d", a,b,r));

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    private static void divider(BufferedReader reader){
        
        try {
            System.out.println("Enter integer to be divided:");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Enter integer to divide:");
            int b = Integer.parseInt(reader.readLine());
            
            double r = divide(a,b);

            System.out.println(String.format("%d / %d = %.1f", a,b,r));

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        
        System.out.println("Choose an operation:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\n->");
        char choice = in.next().toUpperCase().charAt(0);
        
        switch(choice){
            case 'A':
                adder(reader);
                break;
            case 'S':
                subtracter(reader);
                break;
            case 'M':
                multiplier(reader);
                break;
            case 'D':
                divider(reader);
                break;
            
        }
        in.close();


    }
    
}