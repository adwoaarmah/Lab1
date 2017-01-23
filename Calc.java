
public class Calc;
{
public static void main(String[]args)
{
	double input1, input2;
	if (args[0].equals("add")){
		input1=Double.parseDouble(args[1]);
		input2=Double.parseDouble(args[2]);


	System.out.println(input1+input2);
	}
	
	else if (args[0].equals("multiply")){
		input1=Double.parseDouble(args[1]);
		input2=Double.parseDouble(args[2]);

		System.out.println(input1*input2);
	}
}
}