public class Test {
    public static void main(String[] args) {
        int number = 4; // Example input
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
