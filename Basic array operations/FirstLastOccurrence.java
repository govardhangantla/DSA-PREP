import java.util.Scanner;

class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 5, 4, 7, 4, 9};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        sc.close();
    }
}