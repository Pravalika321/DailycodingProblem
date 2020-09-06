import java.util.*;
public class Main
{
public static void main(String[] args) {
int n,i,j;
int p;
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
n=s.nextInt();
int b[]=new int[n];
int arr[]=new int[n];
System.out.println("enter array values");
for(i=0;i<n;i++)
{
   arr[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
   p=1;
   for(j=0;j<n;j++)
    {
        if(i!=j)
        {
            p=p*arr[j];
            
        }
    }
    b[i]=p;
}
for(i=0;i<b.length;i++)
{
   System.out.print(b[i]+" ");
}
}
}