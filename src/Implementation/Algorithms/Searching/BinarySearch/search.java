package Implementation.Algorithms.Searching.BinarySearch;

public class search {
	public static void main(String args[]) {
		int array[] = {1,2,3,10,32,11,54,6,78,100};
		if(searchElement(array, 106)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	
    private static boolean searchElement(int array[], int n) {
	for(int i =0 ; i< array.length; i++) {
		 if(array[i] == n ) {
			 return true;
		 }
	}
    return false;  
  }
}
