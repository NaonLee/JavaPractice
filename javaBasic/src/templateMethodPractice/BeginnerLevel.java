package templateMethodPractice;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("run slowly");
		
	}

	@Override
	public void jump() {
		System.out.println("unable to jump");
	}

	@Override
	public void turn() {

		System.out.println("unable to turn");
	}

	@Override
	public void showLevelMsg() {

		System.out.println("Beginner Level");
	}

}
