package hellyeah;
public class GameObjesct {
	private int x;
	private int y;
	private int width;
	private int height;
	public GameObjesct(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public GameObjesct() {
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width > 0) {
		this.width = width;}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height>0) {
		this.height = height;
		}
	}
		
	public boolean Intersect(GameObjesct objekat) {
		if(objekat == null) {
			return false;
		}
		return x < objekat.getX() + objekat.getWidth() && x + width > objekat.getX()
			   && y < objekat.getY() + objekat.getHeight() && y + height > objekat.getY();
			   	}
	@Override
	public String toString() {
		return "GameObjesct [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
		
}
