/**
 *
 */
package carrot2.util.attribute;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Input
{
    boolean required() default false;
}
