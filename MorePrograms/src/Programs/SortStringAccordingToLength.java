package Programs;

public class SortStringAccordingToLength {

	public static void main(String args[]) {
		
		SortStringAccordingToLength obj = new SortStringAccordingToLength();
		
		String[] arr = { "GeeksforGeeks", "I", "from", "am" };
		int n = arr.length;

		obj.sort(arr, n);

		obj.printArraystring(arr, n);

	}
	
	public void sort(String[] arr, int n) {
		
		for(int i=1; i<arr.length; i++) {
			
			String temp = arr[i];
			
			int j=i-1;
			
			while(j>=0 && temp.length() < arr[j].length()) 
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
			
		}
	}
	
	public void printArraystring(String[] arr, int n) 
	{
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
	}

}
