package exams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface AuthorInfo {
	String[] comments() default {};
	String date();
}
