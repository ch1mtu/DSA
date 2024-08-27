import java.util.HashMap;

public class Stobogrammatic
{
    public static boolean check(String n)
    {
        HashMap<Character,Character> memo=new HashMap<>();
        memo.put('6','9');
        memo.put('9','6');
        memo.put('8','8');
        memo.put('1','1');
        memo.put('0','0');

        int i=0;
        int r=n.length()-1;
        while(i<=r)
        {
            if(!memo.containsKey(n.charAt(i)))
            {
                return false;
            }
            if(memo.get(n.charAt(i))!=n.charAt(r))
            {
                return false;
            }
            i++;
            r--;
        }
        return true;

        
    }
    public static void main(String[] args)
    {
        System.out.println(check("601"));
        
    }
}