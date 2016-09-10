import java.util.Scanner;

public class CheckForWorkingDay {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        String str=input.next();
        if(str.equalsIgnoreCase("sunday"))
        	System.out.println("false");
        else
        	System.out.println("true");
        input.close();
	}
}
