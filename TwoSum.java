import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        System.out.println("Enter the number : ");
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }

        System.out.println("enter the target :");
        int target = sc.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {

                if (nums[i] + nums[j ] == target) 
                {
                    System.out.println(i + "," + (j));
                    
                }
                break;
            }

        }
sc.close();
    }
}
