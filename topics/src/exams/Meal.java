package exams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
//@Repeatable(Meals.class)
@interface Meal{
	String starter() default "";
	String mainCourse();
	String desert() default "";
}