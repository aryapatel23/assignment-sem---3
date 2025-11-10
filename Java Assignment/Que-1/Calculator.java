// create a class Calculater that overloads add() method 
// two integers, three integers, and two double values.

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Main method to test
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));

        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));

        System.out.println("Sum of two doubles: " + calc.add(12.5, 7.5));
    }
}
