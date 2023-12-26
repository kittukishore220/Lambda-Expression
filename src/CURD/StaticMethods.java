package CURD;

public interface StaticMethods {
	default void display() {
		System.out.println("this is default 1");
	}
	static void view() {
		System.out.println("this is static  1");
	
	}
	class Static implements StaticMethods {
		public void display() {
			System.out.println("this is default xxx 1");
		}
		static void view() {
			System.out.println("this is static  2");
	}

		
		public static void main(String[] args) {
			Static ss=new Static();
			ss.display();
			StaticMethods.view();
		}
	
}}