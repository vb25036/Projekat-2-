package hellyeah;
import java.util.ArrayList;
public class Game {
	private Player player;
	private ArrayList<Enemy> neprijatelji;
	private ArrayList<String> eventLog;
	
	public Game(Player player, Enemy[] enemy) {
	    this.player = player;
	    this.neprijatelji = new ArrayList<Enemy>();
	    this.eventLog = new ArrayList<String>();

	    for (Enemy e : enemy) {
	        if (e != null) {
	            neprijatelji.add(e);
	        }
	    }
	}
	  
	public void addEnemy(Enemy e) {
		if(e != null) {
			neprijatelji.add(e);
			eventLog.add("Dodat neprijatelj: "+e.getType());
		}
	}

	public boolean checkCollision(Player p, Enemy e) {
		return p.Intersect(e);
    }
	  public void decreaseHealth(Player p, Enemy e) {
		  	int stariHp = p.getHp();
	        int noviHp = p.getHp() - e.getDmg();

	        if (noviHp < 0) {
	            noviHp = 0;
	        }

	        p.setHp(noviHp);

	        eventLog.add("Udaren igrac: " + p.getName() + " od " + e.getType()
	        + " za " + e.getDmg() + " ->HP " + stariHp + " -> " + noviHp);
	    }
	  
	  public ArrayList<Enemy> findByType(String upit){
		  ArrayList<Enemy> rezultat = new ArrayList<Enemy>();
		  
		  if(upit == null || upit.trim().isEmpty()) {
			  return rezultat;
		  }
		  
		  upit = upit.trim().toLowerCase();
		  
		  for(Enemy e: neprijatelji) {
			  if (e.getType().toLowerCase().contains(upit)) {
		            rezultat.add(e);
		  }
	  }
	  return rezultat;
	  
	  
	  }
	  
	  public ArrayList<Enemy> collidingWithPlayer() {
		    ArrayList<Enemy> rezultat = new ArrayList<Enemy>();

		    for (Enemy e : neprijatelji) {
		        if (checkCollision(player, e)) {
		            rezultat.add(e);
		        }
		    }

		    return rezultat;
		}
	  
	  public void resolveCollisions() {
		    ArrayList<Enemy> sudari = collidingWithPlayer();

		    for (Enemy e : sudari) {
		        decreaseHealth(player, e);
		    }
		}

	  public Player getPlayer() {
		  return player;
	  }

	  public void setPlayer(Player player) {
		  this.player = player;
	  }

	  public ArrayList<Enemy> getNeprijatelji() {
		  return neprijatelji;
	  }

	  public void setNeprijatelji(ArrayList<Enemy> neprijatelji) {
		  this.neprijatelji = neprijatelji;
	  }

	  public ArrayList<String> getEventLog() {
		  return eventLog;
	  }

	  public void setEventLog(ArrayList<String> eventLog) {
		  this.eventLog = eventLog;
	  }
	  
	  
}
	
	

