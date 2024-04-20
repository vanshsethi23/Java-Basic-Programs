public class MathClass {
    public static void main(String[] args) {
        // Maths Class - this class in JAVA provides a set of static methods for performing common mathematical operations.
        System.out.println(Math.max(3894, 3891));
        System.out.println(Math.min(756, 789));

        System.out.println();
        
        // Math.random(): Returns a pseudo-random double between 0.0 (inclusive) and 1.0 (exclusive). Prints "long" values by default.
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        System.out.println(Math.pow(3,2));
    }
}
