package Implementation.Algorithms.Arrays;

public class MaxDiffBwTwoElement {
  public static void main(String args []) {
	  int array[] = {3,1,4,7,5,100,10};
	  System.out.println(find(array));
	  System.out.println(diffArray(array));
	  System.out.println(max_diff(array));
	  System.out.println(max_diff_bestApproach(array));
  }
  
  private static int find(int array[]) {
	 int max = 0;
	 for(int i = 0 ; i < array.length ; i++) {
		 for(int j =i+1 ; j < array.length ; j ++) {
			 if(array[j] > array[i]) {
				 int diff = array[j]-array[i]; 
				 if(diff > max) {
					 max = diff;
				 }
			 }
		 }
	 }
	 return max;
  }
  
  private static int diffArray(int array[]) {
	  int diff[] = new int[array.length-1];
	  for(int i = 0 ;  i < array.length-1 ; i++) {
		  diff[i] =  array[i+1] - array[i];
	  }
	  int max =  diff[0];
	  for(int i = 1 ; i< diff.length ; i++) {
		  if(diff[i-1] > 0) {
			  diff[i] = diff[i-1] + diff[i];
		  }
		  if(diff[i] > max ) {
			  max = diff[i];
		  }
	  }
	 return max;
  }
  
  public static int max_diff(int array[]) {
	  int currMin =  array[0];
	  int max_diff = 0;
	  for(int i = 1 ; i< array.length ; i++) {
		  if(array[i]-currMin > max_diff) {
			  max_diff  =  array[i] - currMin;
		  }
		  if(currMin > array[i]) {
			  currMin = array[i];
		  }
	  }
	  return max_diff;
  }
  
  public static int max_diff_bestApproach(int array[]) {
	  int currMin =  array[0];
	  int max_diff = array[1] - array[0];
	  int current_diff = array[1] - array[0];
	  for(int i = 1; i < array.length ; i++) {
		  if(currMin > array[i]) {
			  currMin = array[i];
		  }else {
			  current_diff  =  array[i] - currMin;
			  if(current_diff  > max_diff) {
				  max_diff = current_diff;
			  }
		  }
	  }
	  return max_diff;
  }
}