public class AliceApple {
    public static void main(String[] args)
    {
        int a=150;
        int cnt=0,sum=0;
        while(sum<a)
        {
            cnt++;
            sum+=(12*cnt*cnt);
        }
        System.out.println(8*cnt);
    }
}
