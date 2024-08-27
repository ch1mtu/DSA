public class BinaryPalindrome {
    public static boolean checkpalindrome(int n)
    {
        int rb=0;
        int Copynum=n;
        while(Copynum!=0)
        {
            rb=(rb<<1)|(Copynum&1);
            Copynum>>=1;
        }
        return rb==n;
    }
    public static void main(String[] args)
    {
        int i=5;
        System.out.println(checkpalindrome(i));
    }
}
