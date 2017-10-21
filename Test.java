package pj1;

public class Test {

	public static void main(String[] args) {
		String testStr = "102345678";
		
		PuzzleCalculator pc = new PuzzleCalculator();
		int[] test = new int[9];
		
		
		for(int i = 0; i < test.length; i++){
			test[i] = Character.getNumericValue(testStr.charAt(i));
			
		}
		System.out.println(pc.getMethod2(test));
		
		
		
		
		
	}

}
