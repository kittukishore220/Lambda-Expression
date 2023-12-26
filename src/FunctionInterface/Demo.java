package FunctionInterface;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function<Integer,Integer>signal=i->i*i;
		System.out.println(signal.apply(20));
	}

}
