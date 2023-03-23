/*Take the values continously from the User 
if no of arguments passed is 3 then multiply the values.
else find the sum of all the values
*/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
        al.add(sc.nextInt());
        }
        B b=new B();
        int len=al.size();
        if(len==3)
        {
            b.muli(al,len);
        }
        else{
            b.add(al,len);
        }
        
    }
}
class A{
    int sum=0;
    void add(ArrayList<Integer> al,int len)
    {
        for(int i=0;i<len;i++)
        {
            sum+=(al.get(i));
        }
        System.out.println("sum is:"+sum);
    }
}
class B extends A{
    int mul=1;
    void muli(ArrayList<Integer> al,int len)
    {
        for(int i=0;i<len;i++)
        {
            mul*=(al.get(i));
        }
        System.out.println("product is :"+mul);
    }
    
}
