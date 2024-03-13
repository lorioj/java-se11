package object.oriented.approach;

enum Proposiiton{
	TRUE(1) {
		@Override
		protected String getNickName() {
			return null;
		}
	};
	
	int value;
	Proposiiton(int value){
		this.value = value;
	}
	protected abstract String getNickName();
}

public abstract class ChildFinalClazz{

}
