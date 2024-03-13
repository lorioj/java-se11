package object.oriented.approach;

/**
 * method cycles compile but trow runtime error
 * @author Admin
 *
 */
public interface Tree {
	
	public static void produceSap() {
		growLeaves();
	}
	
	private static void growLeaves() {
		produceSap();
	}

}
