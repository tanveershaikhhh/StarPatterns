package starpattern;
import java.util.*;
public class printNumbers {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter till what number you want to print");
	int n = sc.nextInt();
	System.out.println("=================================================================================================================================================================================");

for (int i=1; i<=10; i ++) {
	for (int j=i; j<=n; j = j+10) {
		System.out.print(" " +j +"   ");
	}
	System.out.println();
}
}
}
