import java.util.Scanner;

class test{

	public static void main(String [] args)

	{

	char[] english = {'A' , 'B' , 'C' , 'D' , 'E', 'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	  String[] code
            = { ".-----",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.."};
	
		
		String output = "";
		String out = "";

		System.out.println("Enter the english : ");

		Scanner input = new Scanner(System.in);
		String a = input.nextLine();

		for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<english.length;j++)
					{
						if(a.charAt(i) == english[j])
							{
								output = output + code[j];

							}
					}

			}

		System.out.println(output);

		
		System.out.println("Now for morse code : ");
		String[] b = new String[10];

		System.out.print("Enter the length of char : ");
		int c = input.nextInt();

		for(int i=0;i<c;i++)
		{
			b[i]=input.next();  
		}

		for(int i=0;i<c;i++)
		{
			for(int j=0;j<code.length;j++)
			{
				int d = 0;
				if(b[i].length()<=code[j].length())
				{
					d = b[i].length();
				}
				else{
					d = code[j].length();
				}
				int count = 0;
				for(int k=0;k<d;k++)
				{
					if(b[i].charAt(k) == code[j].charAt(k))
					{
						count++;


					}

				}

				if(count == b[i].length() && code[j].length()==d)
				{
					out = out + english[j];
				}
			}
		}

		System.out.println(out);
		System.out.println("\n23DIT007");		

	}

}