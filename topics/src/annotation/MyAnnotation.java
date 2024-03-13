package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * not prohibited are the primitive datatype, String, Enum, Class
 * defaul in null is not permitted
 * @author Admin
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String[] names() default ""; // can be
	public static final int age = 0; //final field should initialized first
	MyEnum[] enu() default {MyEnum.EXAM, MyEnum.PRACTICE}; // enum can be
	Class clazz(); // this is can be
}
