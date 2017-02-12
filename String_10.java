
public class String_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str={"100","111","10100","10","1111"};
int count=0;
for(int i=0;i<str.length;i++)
{
	if(!(str[i].contains("10")&&str[i].contains("01")))
	{
		if(str[i].contains("10") || str[i].contains("01"))
		{
			count++;
		}
		
	}
}
System.out.println("Number of 10 or 01 is "+count);
}


}
