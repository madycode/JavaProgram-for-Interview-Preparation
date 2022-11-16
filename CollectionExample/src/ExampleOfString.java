import java.util.Arrays;

public class ExampleOfString {

	
	public static void main(String[] args) {
		
		String s1="home";
		String s2="mohe";
		
		//boolean result = new String(Arrays.sort(s1.toCharArray()))
          //      .equals(new String(Arrays.sort(s2.toCharArray())));
		
		System.out.println("reverse = " + new StringBuilder(s1).reverse());
	}
}
