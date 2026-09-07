public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = 1;
        int smallest = Math.min(a,b);
        for(int i = 1;i<=smallest;i++)
        {
            if(a%2==0&&b%2==0)
            {
                gcd = i;
            }
        }
        System.err.println("GCD= "+gcd);
    }
    
}
