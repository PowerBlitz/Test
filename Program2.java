import java.util.*;
import java.io.*;

class Program2
{
    public static void main(String args[])
    {
        int series=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No.: ");
        int no=sc.nextInt();
        System.out.println("Final result: ");
        int count = 0;
        for (int i = 1; count < no; i += 2) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                count++;
        }
        
    }
}