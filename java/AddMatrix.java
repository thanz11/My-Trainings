
class AddMatrix
{
public static void main(String args[])
{
int row, col,i,j;
int mat1[][]={{699,900,900},{900,900,99},{988,900,899}};
int mat1[][]={{699,900,90 	0},{900,900,99},{988,900,899}};
int res[i][j];
//int mat1[][] = new int[row][col];
//int mat2[][] = new int[row][col];
//int res[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1");
 
for ( int i= 0 ; i < row ; i++ )
{ 
 
for ( int j= 0 ; j < col ;j++ )

 
System.out.println();
}
System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )

 
System.out.println();
}
 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}
 
}
}