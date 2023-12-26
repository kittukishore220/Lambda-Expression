package FunctionInterface;

public class Normal {
	private static Normal n=null;
	private Normal() {
		
	}
public static Normal get() {
	if(n==null) {
		n=new Normal();
	}
	return n;
}
	public static void main(String[] args) {
	
		Normal v=new Normal();
		Normal.get();
		System.out.println(v);
		
		Normal v1=new Normal().get();
		System.out.println(v1);


}
}