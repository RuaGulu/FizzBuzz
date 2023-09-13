public class Multiples {
    public static void main(String[] args) {
        // Initialization
        int count = 0;
        int num = 1;

        // Loop for finding multiples below 1000.
        while (num < 1000) {
            // num is a multiple if satisfy any of the two conditions.
            if (num % 3 == 0 || num % 5 == 0) {
                count++;
            }
            // Check the next num
            num++;
        }
        // Print out how many multiples
        System.out.println(count);
    }
}
