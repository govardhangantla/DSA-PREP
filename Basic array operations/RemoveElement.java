class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3, 4, 2};

        int val = 2;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.print("New Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("New Size: " + k);
    }
}
