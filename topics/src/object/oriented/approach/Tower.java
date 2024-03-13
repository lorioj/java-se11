package object.oriented.approach;


interface Building{
	default Double getHeight() {
		return 1.0;
	}
}

interface Office{
	public default String getHeight() {
		return null;
	}
}

//Override getHeight
//public abstract class Tower implements Building, Office {
//
//}
