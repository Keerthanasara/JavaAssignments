import java.util.Scanner;

interface Orders
{
    void criteria(int price);
}
public class LambdaQue2
{
    public static void main(String args[])
    {
    	Scanner scan=new Scanner(System.in);
    	scan.nextInt();
        Orders lamdaexpression=(int a)->
        {
            if(a>10000)
            {
                System.out.println("order price is more than 10000");
                System.out.println("Completed");
            }
            else
            {
                System.out.println("not accepted");
            }
        };
        lamdaexpression.criteria(20000);
    }
}