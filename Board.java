import java.util.concurrent.TimeUnit;
import java.lang.*;
class Board{
	int[][] a;
	int size;


	Board(int size){
		 this.a = new int[size][size];
		 this.size = a[0].length;

	}

	// public int size(){
	// 	return this.size;

	// }

	public void place(int row,int column){
		a[row][column] = 1;

	}

	public void remove(int row,int column){
		a[row][column] = 0;

	}

	public void print(){
		for (int i=0;i<this.size;i++ ) {
			for (int  j=0;j<this.size;j++ ) {
				System.out.print(a[i][j]+" ");
				
			}System.out.println();
			
		}
		System.out.println();

	}

	public boolean isSafe(int row,int column){
		boolean flag = true;
		for (int i=0;i<this.size ;i++ ) {
			if(a[row][i]!=0){
				
				flag = false;
				}	
		}

		for (int j=0;j<this.size ;j++ ) {
			if(a[j][column]!=0){

				flag = false;
			}
		}

		for (int i=row,j =column;i>=0 && j>=0 ;i--,j-- ) {
			if(a[i][j]!=0){
			 flag = false; 
			}
		}

		for (int i=row,j =column;i<this.size && j>=0 ;i++,j-- ) {
			if(a[i][j]!=0){
			 flag = false; 
			}
		}



		return flag;

	}

	public void delay(){
		try
			{
    			Thread.sleep(1000);
			}
		catch(InterruptedException ex)
			{
    			Thread.currentThread().interrupt();
			}	
	}

}