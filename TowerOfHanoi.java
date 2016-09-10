import java.util.*;

public class TowerOfHanoi {
	
	static int[] A=new int[10];
	static Stack<Integer> B=new Stack<Integer>();
	static Stack<Integer> C=new Stack<Integer>();
	
	public static void move(int n,Stack<Integer> source,Stack<Integer> target,Stack<Integer> auxiliary)
	{
		if(n>0)
		{
			move(n-1,source,auxiliary,target);
			target.add(source.pop());
//			System.out.println(A.peek() + " " + B.peek() + " " + C.peek());
			move(n-1,auxiliary,target,source);
		}
	}
	
	public static void main(String[] args) {
		
//		move(5,A,B,C);
	}
}
