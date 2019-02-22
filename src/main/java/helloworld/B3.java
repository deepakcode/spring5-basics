package helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class B3 {

	@Autowired
	@Qualifier("b4")
	private Ix i4;


	@Autowired
	@Qualifier("b5")
	private Ix i5;

	public Ix getI4() {
		return i4;
	}

	public void setI4(Ix i4) {
		this.i4 = i4;
	}

	public Ix getI5() {
		return i5;
	}

	public void setI5(Ix i5) {
		this.i5 = i5;
	}

	
		
}
