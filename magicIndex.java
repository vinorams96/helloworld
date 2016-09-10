import java.util.Scanner;
public class magicIndex {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		if(size<0)
			System.out.print("Error");
		int[] arr=new int[siz];
		for(int i=0;i<size;i++)
			arr[i]=input.nextInt();
		for(int i=0;i<size;i++)
			if(i==arr[i])
			System.out.print(i );
	}
}
