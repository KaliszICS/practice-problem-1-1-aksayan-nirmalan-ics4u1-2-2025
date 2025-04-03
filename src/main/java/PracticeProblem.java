public class PracticeProblem {

	public static void main(String[] args) {
		
	}

	public static int sum2D(int[][] intsum2D){
		//Write question 1 code here
		//int sum=0;
		
		int sum=0;
		for (int row=0; row < intsum2D.length;row++){
			for(int col=0; col < intsum2D[row].length;col++){
				sum= sum+intsum2D[row][col];
				
			}
			
		}
		return sum;

	}
		
		
	
	

	public static int sumRow(int[][] intsumRow, int row) {
		//Write question 2 code here
		int sum=0;
		for(int col=0;col<intsumRow[row].length;col++){
			sum=sum+intsumRow[row][col];
		}
		return sum;
	}

	public static int sumColumn(int[][] intsumCol,int col) {
		//Write question 3 code here
		int sum=0;
		for(int row=0;row<intsumCol.length;row++){
			sum=sum+intsumCol[row][col];
		}
		return sum;
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}

