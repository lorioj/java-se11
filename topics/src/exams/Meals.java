package exams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@interface Meals{
	Meal[] values();
}

