package doubly.link;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Inplementation obj = new Inplementation();
        int n , p ;
        System.out.print("No. of elements :   ");
        p = sc.nextInt();
        int k = 1;
        while( k <= p )
        {
            if ( k == 1 )
            {
               System.out.print( k + "st Element :  " );
            }
            else if ( k == 2 )
            {
                System.out.print( k + "nd Element :  " );
            }
            else
                {
                System.out.print( k + "th Element :  ");
                }
            n = sc.nextInt();
            Node newnode = new Node(n);
            obj.insert(newnode);
            k++;
        }

        System.out.println("Press 1 for Displaying Left to Right ");
        System.out.println("Press 2 for Displaying Right to Left ");
        int ch =sc.nextInt();
        if(ch==1)
        {
            obj.displaythrough_LtoR();
        }
        else
        {
        obj.displaythrough_RtoL();
        }
    }
}