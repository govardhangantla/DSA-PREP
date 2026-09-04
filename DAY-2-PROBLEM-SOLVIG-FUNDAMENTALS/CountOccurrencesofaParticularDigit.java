

public class CountOccurrencesofaParticularDigit {
    public static void main(String[] args) {

        int n = 583838;
        int target = 8;
        int count = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit == target) {
                count++;
            }

            n = n / 10;
        }

        System.out.println("Count: " + count);
    }
}
