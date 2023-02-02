import java.util.*;
class pub
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0;
        a=sc.nextInt();
        if(a==4 || a==5 || a==6)
        {
            System.out.println("Summer");
            c+=1;
        }
        if(a==7 || a==8 || a==9 || a==10)
        {
            System.out.println("Rainy");
            c+=1;
        }
        if(a==11 || a==12 || a==1)
        {
            System.out.println("Winter");
            c+=1;
        }
        if(a==2 || a==3)
        {
            System.out.println("Spring");
            c+=1;
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        
    }
}