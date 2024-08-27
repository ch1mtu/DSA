public class SubString
{ 
    public static int Sub(String heystack,String needle)
    {
        if(needle.length()>heystack.length())
        {
            return -1;
        }
        int i=0;
        int j=0;
        int count=0;
        while(j<needle.length()&&i<heystack.length())
        {

            if(needle.charAt(j)==heystack.charAt(i))
            {
                i++;
                j++;
                count++;
            }
            else if(needle.charAt(j)!=heystack.charAt(i)&&j!=0&&i!=0)
            {
                i++;
                j=0;
                count=0;

            }
            else 
            {
                count=0;
                i++;
            }

        }
        if(count==needle.length())
        {
           return i-j;
        }
        return -1;
        
    }
    public static void main(String[] args)
    {
        String heystack="mississippi";
        String needle="issip";
        System.out.println(Sub(heystack,needle));
    }
    
}