package hellyeah;

public class BossEnemy extends Enemy{

	public BossEnemy(String type, int x2, int y2, int width2, int height2, int dmg) {
		super(type, x2, y2, width2, height2, dmg);
		// TODO Auto-generated constructor stub
	}
@Override
public int getDmg() {
	return super.getDmg() * 2;
}
}
