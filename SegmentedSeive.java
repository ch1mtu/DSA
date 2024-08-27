public class SegmentedSeive {
    public static void main(String[] args)
    {
        int a=1,b=100;
        int size=b-a;
        boolean[] prime=new boolean[b+1];
        if(a<2)
        {
            a=2;
        }
        for(int p=2;p*p<=b;p++)
        {
            int sm=(a/p)*p;
            
            if(sm<a)
            {
                sm+=p;
            }
            for(int i=sm+p;i<=b;i+=p)
            {
                prime[i]=true;
            }
        }
        for(int j=a;j<=b;j++)
        {
            if(prime[j]==false)
            {
                System.out.println(j);
            }
        }
        

    }
}
