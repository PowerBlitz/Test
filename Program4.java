import java.util.*;
import java.io.*;

class Program4
{
    public static void main(String args[])
    {
        int[] inputList = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] cnt = new int[9];
        
        for (int num : inputList) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    cnt[i - 1]++;
                }
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            System.out.print((i + 1) + ":" + cnt[i]);
            if (i < cnt.length - 1) {
                System.out.print(", ");
            }
        }
    }
} 
