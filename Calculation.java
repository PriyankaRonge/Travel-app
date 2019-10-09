package com.first;

public class Calculation {
 
	public static int findMax(int[] arr){
	int max=arr[0];
	//	int max= 0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max= arr[i];
			}
		}
		
		return max;
		
	}

	public static int cube(int n){
		return n*n*n;
	}
	
	public static String reverse(String name){
		String reverse="";
		for(int i = name.length()-1;i>=0;i--){
			reverse = reverse + name.charAt(i);
		}
		
		
		return reverse;
	}
}
