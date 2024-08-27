public class EulersPhi {
    public static int Phi(int n)
    {
        int result=n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                result-=result/i;
            }
            
        }
        if(n>1)
        {
            result-=result/n;
        }
        return result;
    }
    public static void main(String[] args)
    {
       System.out.println(Phi(50));
    }
}
