class Rev
{
public static void main(String args[])
{
int num=198766,rev=0;
{
System.out.println(" a number to check rev is :" + num);
while(num!=0)
{

int rem =num%10;
rev=rev *10+ rem;
num=num/10;
}
	System.out.println("rev of num is : "+rev); 
}
}
}

