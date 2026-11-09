class RemoveDuplicatesUnsorted {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 1, 2, 5, 1};

        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {

                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("New Size: " + k);
    }
}
