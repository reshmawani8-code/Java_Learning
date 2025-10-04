package Testpckg1;

public class SwapNumber1 {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        System.out.println("Value Before swapping....."+a+"  "+b);
        a= a+b;//a=50
        b= a-b; //b=20
        a= a-b; //a=30

        System.out.println( "Value after swapping...." +a +"  " +b);

    }

}
