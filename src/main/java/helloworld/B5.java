package helloworld;

import org.springframework.stereotype.Component;

@Component
public class B5 implements Ix {
	
	private int x=10;
	private int y=20;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
