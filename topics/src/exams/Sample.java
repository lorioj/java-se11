package exams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Sample {
	
	//all primitive type, enum, class, defaul null not allowed, calling in a method not allowed
	
	
	
	int x() default 3;
	
	String n() default "sdf";
	
	
	int[] s() default 3;
	

 
}
