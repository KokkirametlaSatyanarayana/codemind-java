import java.util.*;
class pub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x,y;
        int a;
        float d=0,c=0;
        x=sc.nextLine();
        y=sc.nextLine();
        a=sc.nextInt();
        if(a<199)
        {
            c+=(a*1.2);
        }
        if(a>=200 && a<400)
        {
            c+=(a*1.5);
        }
        if(a>=400 && a<600)
        {
            c+=(a*1.8);
        }
        if(a>=600)
        {
            c+=(a*2.0);
        }
        if(c>400)
        {
            d+=(0.15*c);
        }
        if(d<100)
        {
            d=100;
        }
        System.out.format("%.2f",d+c);
    }
}