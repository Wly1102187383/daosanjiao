package example;

import java.util.Scanner;

public class daosanjiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println(" ‰»Î≤„ ˝");
		n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n+1-i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
