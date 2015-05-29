/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CustomAnnotated.inheritance;

import java.lang.annotation.*;

/**
 *
 * @author Administrator
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface InheritedAnnotation{
    public String vlaue();
}
