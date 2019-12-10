package Programs;

public class SmallestOfThreeIntegersWithoutComparisonOperator {
	
	public static void main(String[] args) {
		
		int x=12, y=14, z=6;
		
		System.out.println(smallest(x, y, z));
		
	}
	
	public static int smallest(int x, int y, int z) {
		
		int count=0;
		
		while(x!=0 && y!=0 && z!=0) {
			
			x--;
			y--;
			z--;
			count++;
		}
		return count;
	}

}
