class MoveZeroesToBeginning {
    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 0, 5, 2};

        int k = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k--;
            }
        }

        while (k >= 0) {
            arr[k] = 0;
            k--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
