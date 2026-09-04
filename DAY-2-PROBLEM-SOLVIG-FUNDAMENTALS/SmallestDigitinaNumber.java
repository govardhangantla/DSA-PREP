public class SmallestDigitinaNumber {
    public static void main(String[] args) {
        int n = 123479;
        int smallest = 9;
        while(n>0)
        {
           int digit = n%10;
           if(digit<smallest)
           {
            smallest = digit;
           }
           n = n/10;

        }
        System.out.println(smallest);
    }
    
}
