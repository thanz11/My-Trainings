class TwoArray
{
public static void main(String args[])
{
//int arr[][]=new int [3][3];
int arr[][]={{100,800,100},{900,900,800},{900,500,800}};
System.out.println(arr[2][0]);
System.out.println(arr.length);
for (int i=0;i<arr.length;i++)
{
for (int j=0;j<arr.length;j++)
{
System.out.println(arr[i][j]+  "  ");
}
System.out.println(  );
}
}
}

