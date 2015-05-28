/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaannotatetutorial;

import java.lang.annotation.*;

/**
 *
 * @author Administrator
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.METHOD )
public @interface AnnotationForFunction{
    public String author() default "Hassan";
    public String date();
    public String description();
}
