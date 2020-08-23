

import java.util.Scanner;

import calculator.impl.Calculator;
import calculator.interfaces.BasicCalculator;


    public class App
    {
        public static void main( String[] args )
        {

            System.out.println( "Final CALCULATOR" );
            Calculator basicCalc = new BasicCalculator();
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter two numbers: " );
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();


            System.out.print("Sum is :" );
            basicCalc.add(num1, num2);
            System.out.print("divide is: " );
            basicCalc.divide(num1, num2);
            System.out.print("minus :" );
            basicCalc.sub(num1, num2);
            System.out.print("Multiplication :" );
            basicCalc.multiply(num1,num2);
        }
    }


