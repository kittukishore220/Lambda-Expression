package FunctionInterface;

import java.util.HashSet;
import java.util.Set;

public class GetClassMethodExample {
	int a=10;
	int b=20;
	public  void add() {
	int c=a+b;
	System.out.println(a+b);
	}

	public static void main(String[] args) {
		GetClassMethodExample g=new GetClassMethodExample();
		Set< String> s = new HashSet<>();
		g.add();
	    Class a = s.getClass();   
        System.out.println("Class of Object obj is : " + a.getName());   
	}

}
