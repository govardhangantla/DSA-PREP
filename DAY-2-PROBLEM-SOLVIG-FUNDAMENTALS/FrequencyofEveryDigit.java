public class FrequencyofEveryDigit {
    public static void main(String[] args) {

        int n = 583838;

        int[] freq = new int[10];

        while (n > 0) {

            int digit = n % 10;

            freq[digit]++;

            n = n / 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " → " + freq[i]);
        }
    }
}