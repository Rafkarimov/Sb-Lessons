package main.home043.IsLike;

/*
Создать аннотацию @IsLike, применимую к классу во время выполнения
программы. Аннотация может хранить boolean значение.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface IsLike {
    boolean count() default true;
}
