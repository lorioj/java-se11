package exception.handling;

public class Driver {
	public static void main(String[] args) throws Exception {
		var g = new Garden();
		try(g;
				var h = new Garden();){
			var i = new Garden();
		}finally {
			System.out.println(9);
		}
//		g = null;
//		h = null;
	}

}
