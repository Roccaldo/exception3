public class Main {
	public static void main(String[] args) {
		division(7);
	}

	public static void division(int numb) {
		try {
			int division = numb / 0;
		} catch (ArithmeticException e){
			System.out.println(e);
		}
	}
}