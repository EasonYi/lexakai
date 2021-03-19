package com.telenav.lexakai.annotations.repeaters;

import com.telenav.lexakai.annotations.UmlMethodGroup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated type should be included in a diagram with the given name
 *
 * @author jonathanl (shibo)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface UmlMethodGroupRepeater
{
    UmlMethodGroup[] value();
}
