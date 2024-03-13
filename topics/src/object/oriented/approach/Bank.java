package object.oriented.approach;

public class Bank {
	private String name;

	private Bank(Builder b) {
		this.name = b.name;
	}
	
	public String getName() {
		return name;
	}

	static class Builder {
		private String name;

	
		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Bank build() {
			return new Bank(this);
		}
	}

	public static void withdrwa(int amount) {

	}

	public static void deposit(int amount) {
	}
}
