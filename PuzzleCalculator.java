package pj1;

public class PuzzleCalculator {
	
	
	
	public PuzzleCalculator(){
		
		
	}
	
	public int getMethod1(int[] puzzle){
		int counter = 0;
		for(int i = 0; i < puzzle.length; i++){
			if(puzzle[i] != i){
				counter++;
			}
		}
		return counter;
	}
	
	public int getMethod2(int[] puzzle){
		int counter = 0;
		int[][] multi = new int[3][3];
		int k = 0;
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
				multi[x][y] = puzzle[k];
				k++;
			}
		}
		
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
				int value = multi[x][y];
				if (value != 0){
					int gX = value / 3; //goal state
					int gY = value % 3;
					int dX = x - gX;	//distance to goal
					int dY = y - gY;
					counter = counter + java.lang.Math.abs(dX) + java.lang.Math.abs(dY);

				}								
			}
		}

		return counter;
	}
	
	public boolean isSolvable(int[] puzzle){
		int inversions = 0;
		
		for(int i = 0; i < puzzle.length; i++){
			for(int j = i+1; j < puzzle.length; j++){
				if(puzzle[j] > puzzle[i]){
					inversions++;
				}	
			}
		}
		if(inversions%2 == 0){
			return true;
		}
		else{
		return false;
		}
	}

}
