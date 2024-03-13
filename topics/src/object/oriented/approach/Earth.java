package object.oriented.approach;

public class Earth {

	private abstract class Sky {
		abstract void fly();

		void fall() {

			var e = new Sky() {

				@Override
				void fly() {
				}

			};
		}

	}
}
