import java.text.DecimalFormat;

public class MagicSquare {

	private int[][] data;
	private int size;

	public MagicSquare() {
		
		//create a 3x3 magic square
		
	}
	
	public MagicSquare(int n) {
		
		//create an nxn magicsquare
		
	}
	
	public int[][] getData(){
		
		return null;
		
	}
	
	
	
	public void computeMagicSquare() {
		
		/* fill in data with a valid magic square set of numbers */
		
	}
	
	//return a string representation of a magic square
	public String toString() {
	  // The following will always display 3 digits for x when printed
	  // using the formatter object
	  //  DecimalFormat df = new DecimalFormat("000");
	  //  int x = 3;
	  //  System.out.println(df.format(x));
		return null;
		
	}
	
	public int getSize() {
		
		return size;
		
	}
	/* return true if all rows meet the specs of a MagicSquare */
	public static boolean checkRows(int[][] mg) {
		
		return false;
		
	}
	
	/* return true if all columns meet the specs of a MagicSquare */
	public static boolean checkColumns(int[][] mg) {
		
		return false;
		
	}
	
	
	/* return true if all diagonals meet the specs of a MagicSquare */
	public static boolean checkDiagonals(int[][] mg) {
		
		return false;
		
	}
	
	
}
