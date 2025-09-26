public class Main {
	public static void main(String[] args) {
		String str = "mausamlodhi";
		subString(str, 0, 6);
	}
	public static void subString(String str, int si, int ci) {
		for (int i = 0 ; i < str.length(); i++) {
			if (i == si || i < ci) {
				System.out.print(str.charAt(i));
			}
		}
	}
}