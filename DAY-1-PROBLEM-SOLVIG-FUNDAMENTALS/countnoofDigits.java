public class countnoofDigits {
    public static void main(String[] args) {
        int n = 564825;
        int count = 0;
        while(n>0)
         {
          n= n/10;
            count++;

        }
        System.out.println(count);
    }
    
}
