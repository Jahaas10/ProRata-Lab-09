public class IT25102586Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to calculate square of an integer
    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)^2\t: " + expr1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t: " + expr2);
    }
}