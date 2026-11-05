
import java.util.Scanner;
class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }
        sc.close();
    }
}
