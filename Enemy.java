package hellyeah;

public class Enemy extends GameObjesct {

				public int getDmg() {
					return dmg;
				}

				public void setDmg(int dmg) {
					if(dmg>=0 && dmg<=100) {
						this.dmg = dmg;
					}
				}
				private String type;
				private int health;
				private int dmg;
				
				
			

			
			public Enemy(String type, int x2, int y2, int width2,
		             int height2, int dmg) {
				super(x2, y2, width2, height2);
				
		    this.type = "";
		    setType(type);
		    
		    setDmg(dmg);
		}

			public String getType() {
				return type;
			}
			
			private void setType(String type2) {
			    if (type2 != null && !type2.trim().isEmpty()) {
			        this.type = type2.trim();
			    }
			}

			@Override
			public String toString() {
				return "Enemy [type=" + type + ", dmg=" + dmg + "]";
			}

			
			

			
				
		}
			
			



	


