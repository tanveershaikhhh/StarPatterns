package starpattern;
import java.util.*;
public class Table {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	for (int i=1; i<=n; i++) {
		
		for (int k=1; k<=10; k ++) {
			

			System.out.print(k*i + " ");
		}
	System.out.println();	
	}
}
}