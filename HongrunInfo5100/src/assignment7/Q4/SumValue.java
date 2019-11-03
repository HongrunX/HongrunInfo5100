package assignment7.Q4;

import java.util.Random;

public class SumValue {
    
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
    	Random r = new Random(); 
        for (int i = 0; i < arr.length; i++) {
           arr[i] = r.nextInt(); 
           System.out.println(arr[i]);
    }
  }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){
    	int sum=0;
    	int i;
    	for(i=0;i<arr.length;i++){
    		sum+= arr[i];
    	}
        return sum;
    }

    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
