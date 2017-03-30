package javaproject;

import org.omg.Messaging.SyncScopeHelper;

public class CharPattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			int k=97;
			for(int j=1; j<=i;j++)
			{
				System.out.print((char)k);
			k += 1;
			}
			System.out.println();
		}

	}

}
