import java.lang.*;
import java.util.*;

class Square extends Rectangle {
	  public Square(int side){
			super(side,side);
	  }

	  public void getPerimeter(){
			System.out.println("Square Perimeter "+super.Perimeter());
	  }

	  public void getArea(){
			System.out.println("Squrae Area "+super.Area());
	  }
}
