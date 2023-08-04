package client;

import java.util.Scanner;

public class CalculatorApplication {
    Scanner scan;
    public CalculatorApplication() {
        scan = new Scanner(System.in);
    }
    
    public void showMenu(){
        System.out.println("----Calculator-----");
        System.out.println("Choose from the options");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }
    public void run(){
        int choice = 0;
        int a = 0;
        int b = 0;
        do{
            showMenu();
            choice = scan.nextInt();
            scan.nextLine();
            
            switch(choice){
                case 1: System.out.println("Enter the first Integer: ");
                        a = scan.nextInt();
                        System.out.println("Enter the second Integer: ");
                        b = scan.nextInt();
                        System.out.println("Result is: "+Calculator.add(a, b));
                        break;
                case 2: System.out.println("Enter the first Integer: ");
                        a = scan.nextInt();
                        System.out.println("Enter the second Integer: ");
                        b = scan.nextInt();
                        System.out.println("Result is: "+Calculator.subtract(a, b));
                        break;
                case 3: System.out.println("Enter the first Integer: ");
                        a = scan.nextInt();
                        System.out.println("Enter the second Integer: ");
                        b = scan.nextInt();
                        System.out.println("Result is: "+Calculator.multiply(a, b));
                        break;
                case 4: System.out.println("Enter the first Integer: ");
                        a = scan.nextInt();
                        System.out.println("Enter the second Integer: ");
                        b = scan.nextInt();
                        System.out.println("Result is: "+Calculator.divide(a, b));
                        break;
                default: System.out.println("Enter a valid option");
            }
            
        }while(choice != 5);
        
    }
    public static void main(String[] args){        
        CalculatorApplication cA = new CalculatorApplication();
        cA.run();
    }
}
