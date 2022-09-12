import java.lang.*;
import java.util.*;

class Rectangle{
	  private int length;
	  private int breadth;

	  public Rectangle(int length,int breadth){
			this.length = length;
			this.breadth = breadth;
	  }

	  public int  Perimeter(){
			return 2*length+2*breadth;
	  }

	  public int Area(){
			return length*breadth;
	  }

	  public void getArea(){
			System.out.println("Rectangle Area "+Area());
	  }

	  public void getPerimeter(){
			System.out.println("Rectangle Perimeter "+Perimeter());
	  }
}
