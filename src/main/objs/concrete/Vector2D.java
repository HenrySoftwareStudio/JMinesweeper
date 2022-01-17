package main.objs.concrete;

public class Vector2D {
	protected int x;
	protected int y;
	public Vector2D(final int X, final int Y) {
		this.x = X;
		this.y = Y;
	}
	
	public Vector2D add(final Vector2D v) {
		return new Vector2D(v.x + this.x, v.y + this.y);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
}
