package FunctionInterface;

import java.util.function.Function;

public abstract class Number {

	public static void main(String[] args) {
Function<Integer,Integer>p=a->a*a;
System.out.println(p.apply(50));
	}

}
