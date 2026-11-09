class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int n = arr.length;

        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        System.out.println("Missing Number: " + sum);
    }
}
