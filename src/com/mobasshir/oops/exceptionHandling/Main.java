package com.mobasshir.oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 0;
        try {
            // divide(a, b);
            String name = "Mobasshir";
            if (name.equals("Mobasshir")) {
                throw new MyCustomException("My Exception occours");
            }
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always run");
        }
    }

    private static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("please do not divide by 0");
        }
        return a / b;
    }
}
