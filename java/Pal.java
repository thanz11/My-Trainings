class Pal
{
public static void main(String args[])
{
int num=5445 ,rev=0,temp=num,rem;
System.out.println(" number to check palindrome or not:" +num);

do
{
	rem=num%10;
	rev=rev *10+rem;
	num=num/10;
}
while(num!=0);
if (temp==rev)
{
	System.out.println("Given number is palindrome");
}
else
{
	System.out.println("Given number is not palindrome");
}
}
}
	