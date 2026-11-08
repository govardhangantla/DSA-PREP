class FrequencyOfDigits {
    public static void main(String[] args) {

        int num = 1223452;

        int[] frequency = new int[10];

        if (num == 0) {
            frequency[0]++;
        }

        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num = num / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}