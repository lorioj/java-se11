package object.oriented.approach;

/**
 * enum lesson
 * @author Admin
 *
 */
public class Egg {
	enum Animal{
		CHICKEN(20),PENGUIN(75);
		private int numDays;
		private Animal(int numDays) {
			this.numDays = numDays;
		}
		
		public int getNumDays() {
			return numDays;
		}
		
		public void setNumDays(int numDays) {
			this.numDays = numDays;
		}
	}
	
	public static void main(String[] args) {
		Animal a = Animal.CHICKEN;
		a.setNumDays(23);
		
		System.out.println(a.getNumDays()); //print 20
		System.out.println(Animal.CHICKEN.getNumDays()); //print 20
		System.out.println(Animal.PENGUIN.getNumDays()); //print 75
		
	}
}
