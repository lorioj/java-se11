package practice;

public class EntityType {
	
	private int qnty;
	
	private double price;
	
	
	private EntityType(Builder b) {
		this.qnty = b.qnty;
		this.price = b.price;
	}
	
	public double getTotal() {
		return qnty * price;
	}
	
	static class Builder{
		
		private int qnty;
		
		private double price;
		
		public Builder setQnty(int qnty) {
			this.qnty = qnty;
			return this;
		}
		
		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public EntityType build() {
			return new EntityType(this);
		}
	}

	@Override
	public String toString() {
		return "EntityType [qnty=" + qnty + ", price=" + price + "]";
	}
	
	
	
	

}
