package templateMethodPractice;

public class SupperLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("run fast");
	}

	@Override
	public void jump() {

		System.out.println("jump high");
	}

	@Override
	public void turn() {

		System.out.println("turn");
	}

	@Override
	public void showLevelMsg() {

		System.out.println("Super Level");
	}
	

}
