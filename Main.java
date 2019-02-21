import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of nxn chess board");
		int n = scan.nextInt();
		Board b = new Board(n);
		solveQueens(b);
		System.out.println("Total number of arrangements is : "+count);
		



	}
static int count = 0;
	public static void solveQueens(Board b){
		quuensHelper(b,0);


	}

	public static void quuensHelper(Board b,int column){


		
		if(column>=b.size){
			count++;
			b.print();
			// return true;
		}else{
			for (int row=0;row<b.size;row++ ) {
				if(b.isSafe(row,column)){
					b.place(row,column); //choose
					//  
					// boolean finished =
					quuensHelper(b,column+1); //explore
					// if(finished){
					// 	 return true;

					// }
					b.remove(row,column); //unchoose

				}
				
			}
		}


		// return false;

	}
}