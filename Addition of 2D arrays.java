import java.util.*;
public class Addition_of_Matrixes
{
	public static void  main(String args[]){
	int a,b;
  
  /* Declaring the arrays */
	   int x [][] = new int[2][2];	
	   int y [][] = new int[2][2];
	   int z[][]= new int[2][2];
  
  
/* Taking input for the first array */

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the elements of first Matrix " );
	for(int i =0;i<2;i++)
		for(int j=0;j<2;j++)
			x[i][j] = sc.nextInt();


/* Taking input for the second array */

	System.out.println("Enter the elements of Second Matrix " );		
	for(int i =0;i<2;i++)
		for(int j=0;j<2;j++)
			y[i][j] = sc.nextInt();

/* Printing the first matrix */
	System.out.println("Matrix 1 :");
	for(int i =0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(x[i][j]+" ");	
				}
		System.out.println();
			}


/* Printing the Second matrix */
	System.out.println("Matrix 2 :");
	for(int i =0;i<2;i++){
		for(int j=0;j<2;j++){
			System.out.print(y[i][j]+" ");	
				}
		System.out.println();
			}

/* Adding the arrays */
	for(int i =0;i<2;i++)
		for(int j=0;j<2;j++)
	 z [i][j]=x[i][j]+y[i][j];



	System.out.println("Matrix after the addition :");
	for(int i =0;i<2;i++){
		for(int j=0;j<2;j++){
		System.out.print(z[i][j]+" ");
					}
		System.out.println();
}
		
}
}
