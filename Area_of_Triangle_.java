import java.util.*;
class basic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,z;
        double m,n;
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=sc.nextFloat();
        m=(x+y+z)/2;
        n=Math.sqrt(m*(m-x)*(m-y)*(m-z));
        System.out.format("%.2f",n);
    }
}