package helloworld;

import org.springframework.stereotype.Component;

@Component
public class B4 implements Ix{
	
	private int x=1;
	private int y=2;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}

}
