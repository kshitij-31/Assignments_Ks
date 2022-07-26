package com.Subsequence;
import java.util.Arrays;
import java.util.Scanner;

public class longestSubsequence {
	public static int lic(int a[], int l[], int n) {
		int i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				if(a[i]>a[j])
					l[i]=Math.max(l[j]+1,l[i]);
			}
		}
		Arrays.sort(l);
		
		return l[n-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		
		int a[]=new int[n];
		int l[]=new int[n];
		
		int i;
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			l[i]=1;
		}
		System.out.println(" The length of the longest subsequence array is: " +lic(a,l,n));

	}

}
