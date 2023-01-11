package ARRAY;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArrayList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter the size of array ");
		 int a=sc.nextInt();
		 int[] arr=new int[a];
		 System.out.println("enter "+a+"values");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
     ArrayList<Integer> al1=new ArrayList<>();
     ArrayList<Integer> al2=new ArrayList<>();
     
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]%2==0)
    	  {
    		  al1.add(arr[i]);
    	  }else {
    		  al2.add(arr[i]);
    	  }
      }
      int temp1=0,temp2=0;
      System.out.println("Even num are: ");
      for(int no:al1)
      {
    	  temp1=temp1+no;
    	  System.out.println(no);
      }
      System.out.println("num of even ele is"+al1.size());
      System.out.println("Sum of even num are: "+temp1);
      System.out.println("odd num are: ");
      for(int no:al2)
      {
    	  temp2=temp2+no;
    	  System.out.println(no);
      }
      System.out.println("num os odd ele is"+al2.size());
      System.out.println("Sum of odd num are:"+temp2);
     sc.close();
	}
}