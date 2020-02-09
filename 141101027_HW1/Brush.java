public class Brush {
	private int height, width;
	public String name;
	public Brush(String n) {name = n; height = 1; width = 1;}
	public Brush(String n,int h, int w) {name = n; height = h; width = w;}
	public String toString() {return height + " " + width;}
	public void setHeight(int h) {height = h;}
	public void setWidth(int w) {width = w;}
	public int getHeight() {return height;}
	public int getWidth() {return width;}
}
