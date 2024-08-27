public class ToggleSwitch {
    public static void main(String[] args)
    {
        int n=5;
        boolean b[]= new boolean[n+1];
        int i,j,c=0,o=0;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j+=i)
            {
                if(b[j]==false)
                {
                    b[j]=true;
                }
                else 
                    b[j]=false;
            }
        }
        for(i=1;i<=n;i++)
        {
            if(b[i]==true)
            {
                c++;
            }
            else 
                o++;
        }
        System.out.println(c);
        System.out.println(o);
        

    }

}
