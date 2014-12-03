package P610;

import java.util.Scanner;

public class FactorGenerator {
    public static void main(String[] args) {
        int num = getInt("Enter an integer:");
        System.out.println();
        if (num <= 1)
        {
            System.out.println(num);
        }
        else
        {
            for (int i = 2; i < num; i++)
            {
                while (num % i == 0)
                {
                    System.out.println(i);
                    num /= i;
                }
            }
            if (num >= 2)
            {
                System.out.println(num);
            }
        }
    }

    public static int getInt(String text)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.nextInt();
    }
}