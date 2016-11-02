package general;
import java.util.*;


public class InputData {
	public int sizeOfArray = 10;
	
	//int a[] = new int[sizeOfArray];
	
	public static void arrayInput(int a[])
	{
		
		
		System.out.println("Enter Element: ");
		Scanner input = new Scanner(System.in);
		int n;
		
		
		n = input.nextInt();
		
		for(int i = 0; i <n ; i++){
			a[i] = input.nextInt();
		}
		
		
	}
	
	
	
}
