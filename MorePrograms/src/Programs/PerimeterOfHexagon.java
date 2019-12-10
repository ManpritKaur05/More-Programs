package Programs;

public class PerimeterOfHexagon {
	
	public static int perimeter(int side) {
		return (6*side);
	}
	
	public static void main(String[] args) {
		
		int side=4;
		System.out.println(perimeter(side));
	}

}
