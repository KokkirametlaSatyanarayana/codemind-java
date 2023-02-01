import java.util.*;
class basic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,z,m;
        double n;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        m=(x+y+z)/2;
        n=Math.sqrt(m*(m-x)*(m-y)*(m-z));
        System.out.format("%.2f",n);
    }
}