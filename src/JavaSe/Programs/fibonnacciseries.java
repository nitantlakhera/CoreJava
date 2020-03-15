package JavaSe.Programs;

public class fibonnacciseries {
public static void main(String args []) {
	int first =2 , second = 3 , sum =0;
	int number =7;
	int cunter =0 ;
	System.out.println(first);
	System.out.println(second);
	while(cunter<number ) {
		sum = first + second;
		first = second ; 
		second = sum ;
		System.out.println(sum  );
		cunter++;
	}
}
}
