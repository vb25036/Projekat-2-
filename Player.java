package hellyeah;
import java.util.Scanner;

public class Player extends GameObjesct {
	
	public Player(int x, int y, int width, int height, int hp) {
		
		super(x, y, width, height);
		
		this.hp = hp;
		
	}
	public Player(String ime, int x, int y, int width, int height, int hp) {
	    super(x, y, width, height);
	    setName(ime);
	    setHp(hp);
	}
		private String name;
		
		private int hp;

	
	
	public String getName() {
			return name;
		}
	public void setName(String name) {
	    if (name != null && !name.trim().isEmpty()) {
	        String[] rijeci = name.trim().split("\\s+");
	        String novoIme = "";

	        for (String rijec : rijeci) {
	            rijec = rijec.toLowerCase();
	            novoIme += rijec.substring(0, 1).toUpperCase()
	                    + rijec.substring(1) + " ";
	        }

	        this.name = novoIme.trim();
	    }
	}
		
		
		
	
	
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			if(hp >= 0 && hp<= 100) {
				this.hp = hp;
			}
		}
		@Override
		public String toString() {
			return "Player [name=" + name + ", hp=" + hp + "]";
		}
		
		
}