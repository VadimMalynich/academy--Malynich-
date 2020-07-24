package by.academy.deal;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface ProducerInfo {
    String name();

    String company();

    int number();

    String[] productTypes() default {};

}