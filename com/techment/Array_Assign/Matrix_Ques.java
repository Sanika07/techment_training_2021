package Array_Assign;

public class Matrix_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MatrixA[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int MatrixB[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int MatrixC[][] = new int [3][3];
		
		for (int i = 0; i<MatrixA.length;i++)
		{
			for (int j = 0;j<MatrixB.length;j++) 
			{
				 MatrixC[i][j] = MatrixA[i][j]+MatrixB[i][j];
				 System.out.print(MatrixC[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
