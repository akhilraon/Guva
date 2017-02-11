import java.util.Scanner;

public class Max_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String[] str=new String[10];

System.out.println("Enter the number of students");
int num=sc.nextInt();
System.out.println("Enter name mark1,mark2,mark3 of n students");
String[] array=new String[20];
for(int i=0;i<num;i++)
{
	array[i]=sc.next();

}
int total,sum=0;
String name=null;
for(int i=0;i<num;i++)
{
	str=array[i].split("#");
	total=Integer.parseInt(str[1])+Integer.parseInt(str[2])+Integer.parseInt(str[3]);
	if(sum<total)
	{
		sum=total;
		name=str[0];
		
	}
  	
}
System.out.println("Maximum marks is "+sum+" for "+name);







	}

}
