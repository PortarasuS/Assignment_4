import java.util.Scanner;

//2. WAP to print Duplicates characters from the String.


class Input 
{
	public void input () 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Pease enter the String to check duplicate character : ");
		String userin = scan.next();
		char temp = ' ';
		char[] result = new char [userin.length()];
		//System.out.println(userin.length());
		int counter = 0;
		for (int i=0; i<userin.length(); i++) 
		{
			for (int j=i; j<userin.length(); j++) 
			{
				if (i!=j) 
				{
					if (userin.charAt(i) == userin.charAt(j) && userin.charAt(j) != '$')
					{
						//System.out.println("Value of i " + i + "J " + j);

						temp = userin.charAt(i);

						//System.out.println("user input " + userin.charAt(i));

						result[counter] =  userin.charAt(i);
						//System.out.println(result[counter]);
						//System.out.println(userin.charAt(i));

						//System.out.println("char at I " + userin.charAt(i) + "  " + i + "  " + j );
						counter++;
						userin = userin.replace(userin.charAt(j), '$');

					}

				}
			}
		}
		//System.out.println(result.length  +" " +  result);

		for (int i=0; i<result.length; i++)
		{
			//System.out.println(result[0]);
			if (result[0] !='\u0000' )
			{
				if (result[i] != '$')
				{
					System.out.println(result[i]);
				}

			}
			else 
			{
				System.out.println ("No Duplicates Available" );
				break;

			}
		}		
	}
}

public class Ass4Question2 
{

	public static void main(String[] args) 
	{
		Input inpp = new Input();
		inpp.input();
	}

}
