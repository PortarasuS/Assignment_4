

//Question : 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

import java.util.Scanner;


abstract class Input 
{
	String usrinput = "";
	void input()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the string");
			usrinput = scan.next();
		}
		catch (Exception e) {
			System.out.println("Enter the string value ");
		}
	}
}
class DupChecking extends Input
{
	void dupchecking() 
	{
		char [] usr = new char[this.usrinput.length()];
		for (int i=0; i<usr.length; i++)
		{
			usr[i] = this.usrinput.charAt(i);
			//System.out.print(usr[i]);
		}

		char temp = ' ';
		char temp1 = ' ';
		char [] res = new char[usr.length];

		for (int k=0; k<usr.length; k++)
		{
			temp = '$';
			for (int j = k ; j<usr.length; j++)
			{

				if (usr[k] == usr[j] && k!=j)
				{
					if ((usr[k] != '$' ) )
					{
						if (k == (usr.length-1))
						{
							temp1 = usr [j];
							//System.out.println(temp1);
						}

						//System.out.println("EQUAL K "+k +" : " + usr[k]  + " equal J " + j+" : " + usr[j]);
						usr[j] = '$';
						//System.out.println(usr[j]);
						temp = usr[k];
					}
				}
				else if (usr[k] != usr[j])
				{
					//System.out.println("NOT EQUAL K "+k +" : " + usr[k]  + " grt J " + j+" : " + usr[j]);

					temp = usr[k];
					//System.out.println(usr.length);
					if (k == (usr.length-2))
					{

						temp1 = usr [j];
						//System.out.println(temp1);
					}
				}
			}

			//System.out.println("Temp : " +temp);

			res [k] = temp; //a , 
		}
		res[res.length-1] = temp1;
		for (char a : res)
		{
			if (a != '$')
			{
				System.out.print(" "+ a + " ");
			}
		}
	}
}

class Assignment4
{
	public static void main(String[] args) 
	{
		//System.out.println("Test ok");
		DupChecking dpc = new DupChecking();
		dpc.input();
		dpc.dupchecking();
	}
}