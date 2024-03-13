package practice;

import java.util.Map;

public class Entity {
	private String name;
	
	private Map<String, EntityType> map;
	
	public Entity(B b) {
		this.name = b.name;
		this.map = b.map;
	}
	
	
	public Map<String, EntityType> getMap(){
		return this.map;
	}
	
	
	static class B{
		private String name;
		private Map<String, EntityType> map;
		
		public B setName(String name) {
			this.name = name;
			return this;
		}
		
		public B setMap(Map<String, EntityType> map) {
			this.map = map;
			return this;
		}
		
		public Entity build() {
			return new Entity(this);
		}
		
	}


	@Override
	public String toString() {
		return "Entity [name=" + name + ", map=" + map + "]";
	}
	
	
	
	
	
	
	
}
