package Test;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * String input = sc.next(); char array[] = input.toCharArray();
		 */

		String s = "cat";

		permute(s,0,s.length()-1);
	}
	
	private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
 
   
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
