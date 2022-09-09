package JavaProgram;

public class ReverseString {
	public static void main(String args[]) {
		String st = "Helo good Morning India";
		int len = st.length();
		System.out.println(len);
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(st.charAt(i));
		}
	}
}
