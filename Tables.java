import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
int n=0;
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);

System.out.println("Enter How Many Table You Need : ");
 int need =sc.nextInt();

 
 System.out.println("Enter the Tables : ");
 int[] arr = new int[need];
 for ( n=0;n<arr.length;n++){
    
    arr[n]=sc.nextInt();
 }

System.out.println("Enter the Start Value: ");
 int b =sc.nextInt();
System.out.println("Enter the End Value : ");
 int j =sc.nextInt();

if( b<j){
    for(int m=0;m<arr.length;m++)
    {
        System.out.println(arr[m]+" Table Values Are: ");
        for(int i=b;i<=j;i++)
        {
            // System.out.println("Inner For Count : "+m+1);

            System.out.print(i+"*"+arr[m]+"="+i*arr[m]+"\n");
    }    
    
}

}
else{
    System.out.println("End value is greater than start value");
}

sc.close();
    }
}
