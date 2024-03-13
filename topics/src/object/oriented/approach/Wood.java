package object.oriented.approach;

public class Wood {
	static class Tree{}
	public static void main(String[] args) {
		int heat = 2;
		int water = 10 - heat;
		final class Oak extends Tree{
			public int getWater() {
				return water; // it is not work if line 14 is uncomment
			}
		}
		System.out.println(new Oak().getWater());
//		water = 0;
	}
	

}
