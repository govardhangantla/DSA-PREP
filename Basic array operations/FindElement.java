
import java.util.Scanner;
class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
                }
        int target = sc.nextInt();
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
               }
        System.out.println(index);
        sc.close();
    }
}

