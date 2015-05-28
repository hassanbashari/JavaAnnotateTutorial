/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaannotatetutorial;

import CustomAnnotated.AnnotationForClass;
import CustomAnnotated.FirstTuorial;
import java.lang.annotation.Annotation;
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
        
    }
    
}
