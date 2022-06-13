import java.lang.*;
import java.util.*;

class Bank implements Converter{

	  public int convertRs(int num){
			return num;
	  }

	  public int convertDl(int num){
			return num*70;
	  }

	  public int convertPd(int num){
			return num*100;
	  }
}
