package tryCatch;

public class problem3 {

	public static void main(String[] args) throws myException {
		// TODO Auto-generated method stub
		Building b = new Building();
		b.show();
	}
}

class myException extends Exception {
	
}

class Building {
	public void show() throws myException {
		int numberAccess = 0;
		if (numberAccess > 100) {
			throw new myException();
		}else {
			System.out.println("good device");
		}
	}

	public void go() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println();
	}
}
