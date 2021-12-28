package com.myprograms.folder;
import java.util.Scanner;

public class PayMoney {
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
        	   
        	   PayMoney obj = new PayMoney();
        	   Scanner in= new Scanner(System.in);
        	   
        	   System.out.println("Enter the size of transaction array");
        	   int size = in.nextInt();
        	   
        	   int trans_arr[] = new int[size];
        	   int sorted_arr[] = new int[size];
        	  
        	    System.out.println("Enter the values of array");
        	    for(int i=0;i<size;i++) {
        	    	trans_arr[i]=in.nextInt();
               }
        	    
               sorted_arr = obj.sort(trans_arr,size);
               
        	   System.out.println("Enter the total no of targets that needs to be achieved");
        	   int targetno = in.nextInt();
        	   
        	   while( targetno !=0) {
            	 System.out.println("Enter the value of target");
                 int target_amount = in.nextInt();
                 
                 int sum=0;
                 int flag =0;
                 
                 for(int i=0;i<size;i++) {
                	 sum += sorted_arr[i];
                	 	if(sum >= target_amount) {
                	 		flag = 1;
                	 		System.out.println("Target achieved after "+ (i+1)+ " transcation");
                	 		break;
                	 }
                 }
                 if(flag == 0) {
                	 System.out.println("Given target is not achieved");
                 }
                 targetno--;
        	   }

           }
}
