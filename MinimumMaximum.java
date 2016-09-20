/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 * This program fills an array with 10 numbers and returns the max and min
 *  values
 ****************************************************************************/


public class MinimumMaximum {

	public static int[]  MinMaxFinder(int[] numbers){
		
		int largest = numbers[0];
		int smallest= numbers[0]; 
		
		for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largest)
                        largest = numbers[i];
                else if (numbers[i] < smallest)
                        smallest = numbers[i];
               
        }
		int minMax [] = new int[]{smallest,largest}; 
		return minMax; 
	}
	
	public static void main(String[] args) {
		
		int[] finalArray;
		
		int[] numbers = new int[10];       
	    //Generates 10 Random Numbers in the range 1 -20
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*100 + 1);
	      System.out.println(numbers[i]);
	    }//end for loop
		
	    finalArray = MinMaxFinder(numbers);
	    System.out.println("The minimum number is " + finalArray[0]);
	    System.out.println("The maximum number is " + finalArray[1]);
	}

}
