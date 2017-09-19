package Calculator;

import java.util.Scanner;

public class Application {

   static double summarize(double a, double b) {
        double result = (double) (a + b);
        return result;
    }


    static double divide(double a, double b) {
        double result = (double)a/b;
        return result;
    }


    static double multiply(double a, double b) {
        double result = (double) a * b;
        return result;
    }


    static double subtract(double a, double b) {
        double result = (double) (a - b);
        return result;
    }

    static boolean NumericValues (String X) throws NumberFormatException {
       try {
           Double.parseDouble(X);
           return true;
       }
       catch (Exception e)
       {
           return false;
       }
    }


    public static void main(String[] args)  {

        Scanner str = new Scanner(System.in);

        double x = 0;
        double y = 0;
        char operation = ' ';
        int State = 0;
        String value = "";


            while (!value.equals("quit")) {

                switch (State) {

                    case 0:
                       System.out.println("Insert first value");
                       value = str.next();
                       if (value.equals("quit"))
                        {
                            break;
                        }
                        else if (NumericValues(value) == true)
                        {
                            x = Double.parseDouble(value);
                            State = 1;
                            break;
                        }
                       else {
                           System.out.println("Please, insert any numeric value or type 'quit' to close app");
                           State = 0;
                           break;
                        }
                    case 1:
                        System.out.println("Insert needed operation");
                        value = str.next();
                        if (value.equals("quit")){
                            break;
                        }
                        else {
                            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"))
                                {
                                    operation = value.charAt(0);
                                    State = 2;
                                    break;
                                }
                             else {
                            System.out.println("Incorrect operation. Please, type correct symbole or typr 'quit' to close the app");
                            State = 1;
                            break;
                            }
                        }
                     case 2:
                        System.out.println("Insert second value");
                        value = str.next();
                        if (value.equals("quit")){
                            break;
                        }
                        else if (NumericValues(value) == true) {
                            y = Double.parseDouble(value);
                            switch (operation) {

                                case '+':
                                    System.out.println("Result =  " + summarize(x, y));
                                    break;

                                case '-':
                                    System.out.println("Result = " + subtract(x, y));
                                    break;

                                case '*':
                                    System.out.println("Result = " + multiply(x, y));
                                    break;

                                case '/':
                                    if (y != 0) {
                                        System.out.println("Result =" + divide(x, y));
                                    } else System.out.println("Division by zero! Try again");
                                    break;

                            }
                            State = 0;
                        }
                        else {
                            System.out.println("Please, insert any numeric value or type 'quit' to close app");
                            State = 2;
                            break;
                        }

                }
            }
        }

    }
