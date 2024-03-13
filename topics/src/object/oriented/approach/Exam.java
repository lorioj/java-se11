package object.oriented.approach;

public class Exam {

	class P extends Exam {
	}

	public void roar() {

		var dino = new Exam();
		dino.new P();
		new Exam.P();
	}
}
