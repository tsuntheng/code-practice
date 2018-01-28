
public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	public String toString() {
		return "Rectangle: { (" + this.x + ", " + this.y + "), " + this.width + "x" + this.height + " }";
	}
	
	public boolean contains(int x, int y) {
	    return this.x <= x && x <= this.x + width && this.y <= y && y <= this.y + height;
	}
}
