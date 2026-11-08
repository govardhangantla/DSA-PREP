class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 5};

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}