class InsertElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 0};

        int value = 25;
        int pos = 2;

        int size = 4;

        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = value;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}