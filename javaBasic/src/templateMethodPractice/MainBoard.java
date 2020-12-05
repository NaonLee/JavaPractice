package templateMethodPractice;

public class MainBoard {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SupperLevel bLevel = new SupperLevel();
		player.upgradeLevel(bLevel);
		player.play(3);

	}

}
