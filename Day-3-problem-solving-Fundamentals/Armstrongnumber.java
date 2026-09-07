public class Armstrongnumber {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int temp = n;
        int digits = 0;
        while(temp>0)
        {
            temp = temp /10;
            digits++;
        }
        int sum =0;
        temp = n;
        while(temp>0)
        {
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit,digits);
            temp = temp /10;
        }
        if (sum == original)
            {
                System.out.println("Armstrong NUmber");
            }  
            else{
                System.out.println("NOt Armstrong NUmber");
            }
            
        }
    }

