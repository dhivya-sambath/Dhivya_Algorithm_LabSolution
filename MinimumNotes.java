package com.myprograms.folder;
import java.util.Scanner;

public class MinimumNotes {
	
	public int[] sort(int arr[], int size) {
 	   for(int j=1; j<size;j++) {
 		   int key = arr[j];
 		   int i=j-1;
 		   while((i>-1)&&(arr[i]>key)) {
 			   arr[i+1] = arr[i];
 			   i--;
 		   }
 		   arr[i+1]=key;
 	   }
 	  return arr;
    }
	
	public static void main(String args[]) {
		
		MinimumNotes obj= new MinimumNotes();
 	    Scanner in= new Scanner(System.in);
 	    
 	    System.out.println("Enter the size of currency denominations");
 	    int size = in.nextInt();
 	    
 	    int currency_denom[] = new int[size];
 	    int sorted_arr[] = new int[size];
 	    
 	    int currency_pay[]= new int[size];
 	    for (int i=0;i<size;i++) {
 	    	currency_pay[i] = 0;
 	    }
 	    
 	    System.out.println("Enter the currency denominations value");
        for (int i=0;i<size;i++) {
        	currency_denom[i] = in.nextInt();
        }
        
        System.out.println("Enter the amount you want to pay");
 	    int amount = in.nextInt();
 	    
        sorted_arr = obj.sort(currency_denom,size);
        
        int temp_amount = amount;
        for(int i=size-1; i>=0; i--) {
        	if ( temp_amount >= sorted_arr[i] && sorted_arr[i] !=0){
        		currency_pay[i] = temp_amount/sorted_arr[i];
        		temp_amount = temp_amount % sorted_arr[i];
        		if(temp_amount == 0) {
        			break;
        	 }
        }
        }
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i=0;i<size;i++){
        	if(currency_pay[i] !=0){
        		System.out.println(sorted_arr[i] + ":"  + currency_pay[i]);
        	}
        }
 	   
	}

}
