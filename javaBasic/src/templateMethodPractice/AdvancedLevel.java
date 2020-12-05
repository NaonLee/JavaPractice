package templateMethodPractice;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("run fast");
		
	}

	@Override
	public void jump() {

		System.out.println("jump");
	}

	@Override
	public void turn() {

		System.out.println("unable to turn");
	}

	@Override
	public void showLevelMsg() {

		System.out.println("Advanced Level");
	}

}
