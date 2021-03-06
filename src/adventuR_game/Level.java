package adventuR_game;

import java.awt.Graphics;

public class Level {

	private int[] obs;
	Obstacles[] obstacles = new Obstacles[8];
	int num;
	int start;
	int count;

	public Level(int start, int num, int[] obs) {
		this.num = num;
		this.obs = obs;

		this.start = start;

		count = 0;
		for (int i = 0; i < 8; i++) {
			if (obs[i] != -1) {
				obstacles[count] = new Obstacles(start + i * 512, 475, obs[i]);
				count++;
			}
		}
	}

	public void draw(Graphics g) {
		for (int i = 0; i < count; i++)
			obstacles[i].draw(g);
	}

	public boolean contains(int pos) {
		return start > pos && pos <= (start + 4096);
	}

	// public boolean detectCollision(Sarah s) {
	// for (int i = 0; i < 8; i++) {
	// if (obstacles[i].collidedWith(s)) {
	// return true;
	// }
	// }
	// return false;
	// }

	// public boolean detectCollision(Sarah s) {
	// for (int i = 0; i < 8; i++) {
	// if (obstacles[i].collidedWith(s)) {
	// return true;
	// }
	// }
	// return false;
	// }

}
