package tryCatch;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "ExceptionHanding";
		try {
			System.out.println("Before: ");
			// 50 --> Error
			System.out.println(test.substring(50));
			int a = 5, b = 0;
			System.out.println("a/b: " + a / b);
		}
//			catch (StringIndexOutOfBoundsException e) {
//			// TODO: handle exception
//			System.out.println("Error: " + e.toString());
//		} catch (ArithmeticException e) {
//			System.out.println("Error: "+e.toString());
//		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e.toString());
		}
		finally {
			System.out.println("Always run");
		}
		// continue display on screen
		System.out.println("After");
	}

}
