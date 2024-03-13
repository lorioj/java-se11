package object.oriented.approach;


/**
 * hidding if the same instance name of child and parent
 * 
 * @author Admin
 *
 */
public class HiddingChild extends HiddingParent{
	public String name = "child";
	
	public String getName() {
		return name;
	}
	public static String hidding() {
		return "static method hidding child";
	}
	
	public void play() {
		
	}
}
