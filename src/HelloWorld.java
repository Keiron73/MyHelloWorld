public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World - edited");
		
		HelloWorldTest hwt = new HelloWorldTest();
		Integer doubleValue = hwt.DoubleMe(3);
		String value = doubleValue.toString();
		System.out.println("Double von 3 = ".concat(value));
	}

}
