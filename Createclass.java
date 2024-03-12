class calculator
{

    public int add(int num1, int num2) {

        int result = num1 + num2;
return result;
    }
}

public class Createclass {

    public static void main(String args[]) {

        int num1 = 10;
        int num2 = 20;
calculator calc=new calculator();

    System.out.println(calc.add(num1,num2));

    }
}
