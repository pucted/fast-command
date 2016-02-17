package io.github.pucted.fastcommand;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Command {

    String name();
    boolean subcommand() default false;
    String parent();

    String usage();
    String permission();
    String[] aliases();

}
