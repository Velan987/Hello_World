public class HelloWorld{
	public static void main(String[] args) {
		System.out.println("Hello from Git Repo");
		String str = "USD50,000.21";
		String numberStr = str.replaceAll("[^0-9.]","");
		System.out.println(numberStr);
	}
}
