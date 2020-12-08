package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		//AutoCloseObj obj = new AutoCloseObj();
		//try(obj)										//can be defined outside
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();						//force to create an exception
		}catch(Exception e) {
			System.out.println("exception");
		}
	}
}
