public class Reduce {
    public static void main(String[] args) {
        // Initialization
        int n = 100;
        int count = 0;

        // Main loop.
        while (n != 0){
            // If num is even.
            if (n % 2 == 0){
                n = n / 2;
            }
            // If num is odd.
            else {
                n--;
            }
            count++;
        }
        System.out.println(count);
    }
}
