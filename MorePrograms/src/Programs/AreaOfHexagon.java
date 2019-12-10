package Programs;

//Number of vertices: 6
//Number of edges: 6
//Internal angle: 120°
//Area = (3 √3(n)^2 ) / 2
//n = side

public class AreaOfHexagon {
	
	public static double area(double n) {
		return (3 * Math.sqrt(3) * (n*n) / 2);
	}
	
	public static void main(String[] args) {
		
		double n=4;
		System.out.println(area(n));
		
	}

}
