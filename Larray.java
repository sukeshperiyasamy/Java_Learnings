import java.util.Scanner;

public class Larray {

    public static void main(String a[])
    {
        
            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }


            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
sc.close();

    }







}
