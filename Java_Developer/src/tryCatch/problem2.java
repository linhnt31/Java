package tryCatch;

import java.io.File;
import java.io.IOException;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			File file = new File("test.txt");
			file.createNewFile();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error: "+e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Error: "+e.toString());
		}finally {
			System.out.println("Always run");
		}
	}

}
