package Implementation.Algorithms.Searching.BinarySearch;

public class BS {

	public static void main(String args[]) {
		int array[] = {1,2,3,4,10,12,13,36,76,100,232,323,400};
		int search =  100;
		if(B_search(array, search)) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	public static boolean B_search(int array[], int n) {
	    int left = 0;
	    int right = array.length - 1;
		while(left <= right) {
			int middle = (left + right)/2;
		    if(array[middle] == n) {
				return true;
			}
		    if(n >array[middle]) {
		    	left =  middle + 1;
		    } else if(n < array[middle]) {
		    	right = middle-1;
		    }	
	    }
		return false;
	}
}