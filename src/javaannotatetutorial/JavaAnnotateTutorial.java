/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaannotatetutorial;

import CustomAnnotated.*;
import CustomAnnotated.inheritance.AnnotatedSubClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author Administrator
 */
public class JavaAnnotateTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstTuorial FT = new FirstTuorial();
        Class<FirstTuorial> FirstToturialClass = FirstTuorial.class;
        // Retrieve all annotations from the class
        Annotation[] annotations = FirstToturialClass.getAnnotations();
        for( Annotation annot : annotations ){
            System.out.println( annot );
        }
        if( FirstToturialClass.isAnnotationPresent( AnnotationForClass.class) ){
            // Gets the desired annotation
            Annotation annotation = FirstToturialClass.getAnnotation( AnnotationForClass.class);
            System.out.println( annotation );
        }
        // the same for all methods of the class
        for( Method method : FirstToturialClass.getDeclaredMethods() ){
            if( method.isAnnotationPresent( AnnotationForFunction.class ) ){
                Annotation annotation = method.getAnnotation(AnnotationForFunction.class );
                System.out.println( annotation );
            }
        }
        for( Field field : FirstToturialClass.getDeclaredFields() ){
            if( field.isAnnotationPresent( AnnotationForField.class ) ){
                Annotation annotation = field.getAnnotation(AnnotationForField.class );
                System.out.println( annotation );
            }
        }
        Class<AnnotatedSubClass> annotatedSubClass = AnnotatedSubClass.class;
        Annotation[] annotationsList2 = annotatedSubClass.getAnnotations();
        System.out.println("The start of annotations of Annotated Subclass");
        for( Annotation annot : annotationsList2 ){
            System.out.println( annot );
        }
        System.out.println("END");
    }
    
}
