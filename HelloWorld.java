public class HelloWorld{
	public static void main(String[] args) {
		String str = "USD50,000.21";
		String numberStr = str.replaceAll("[^0-9.]","");
		System.out.println(numberStr);
	}
}
