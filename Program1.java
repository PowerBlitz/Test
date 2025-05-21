import java.util.*;
import java.io.*;

class Program1
{
    public static void main(String args[])
    {
        int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A: ");
        Double a=sc.nextDouble();
        System.out.println("Enter value of B: ");
        Double b=sc.nextDouble();

        System.out.println("Choose operation:\n 1) Addition \n 2) Substraction \n 3) Multiplication \n 4) Division");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1: 
            res= (int) (a + b);
            break;
            case 2: 
            res= (int) (a - b);
            break;
            case 3: 
            res= (int) (a * b);
            break;
            case 4: 
            res= (int) (a / b);
            break;
        }
        System.out.println("Final result: "+res);
    }
}