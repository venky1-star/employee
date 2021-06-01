package mycaptain_java;
import java.util.Scanner;
public class Emp {
    String name;
    int year;
    String address;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Emp obj[]=new Emp[10];
		System.out.print("No of Employees : ");
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			obj[j]=new Emp();
			System.out.println("Enter the employee"+(j+1));
			System.out.print("Enter the name of employee :");
			obj[j].name=sc.next();
		 	System.out.print("Enter the year of joining :");
		    obj[j].year=sc.nextInt();
			System.out.print("Enter the address : ");
			obj[j].address=sc.next();
			System.out.println();
		}
		System.out.println();
		System.out.println("Name    "+"Year of joining   "+"Address");
		for(int j=0;j<n;j++)
		{
			System.out.println(obj[j].name+"  "+obj[j].year+"  "+obj[j].address);
		}
	}
}
