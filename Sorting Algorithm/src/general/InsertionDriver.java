package general;

public class InsertionDriver {
	public static void main(String[] args) {
		int a[] = new int[100000];
		InputData.arrayInput(a);
		
		for(int i = 0; i< 3; i++){
			System.out.println(a[i]);
		}
	}

}
