

public class LargestDigitinaNumber {
    public static void main(String[] args) {
        int N = 594328;
        int Largest = 0;
        while( N > 0)
        {
        int digit = N%10;
        if(digit > Largest)
        {
            Largest = digit;
        }
        N = N /10;
    }
        System.out.println(Largest);


        
    }
    
}
