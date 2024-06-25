package string_program;

public class Rev_string_staatement 
{
	
	public static void main(String[] args)
	{
		
	 
    String a = "my name is ravi";

    String b [] = a.split(" ");
    for(int i=b.length-1; i>=0;  i--)
{
     System.out.print(b[i] + " ");	
}
}
}