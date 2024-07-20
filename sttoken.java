// x2 b. Write a Java class called Customer to store their name and date_of_birth. The date_of_birth format should be dd/mm/yyyy. Write methods to read customer data as <name, dd/mm/yyyy> and display as <name, dd, mm, yyyy> using StringTokenizer class considering the delimiter character as “/”.

import java.util.Scanner;
import java.util.StringTokenizer;
class Customer
{
String cname,dob;
Scanner sobj=new Scanner(System.in);
void read()
{
System.out.println("Enter Customer name:");
cname=sobj.next();
System.out.println("Enter Customer DOB in the format dd/mm/yyy");
dob=sobj.next();
}
void display()
{
StringTokenizer st = new StringTokenizer(dob, "/");
System.out.print(cname+",");
while(st.hasMoreTokens())
{
String val = st.nextToken();
System.out.print(val);
if(st.countTokens()!=0)
System.out.print(","+" ");

}
}
}
public class sttoken {
	public static void main(String[] args) {
							Customer cobj=new Customer();
			cobj.read();
			System.out.println("Customer Details");
			System.out.println("---------------------");
			cobj.display();
			}
}

