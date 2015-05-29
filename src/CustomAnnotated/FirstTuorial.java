/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CustomAnnotated;



/**
 *
 * @author Administrator
 */

@AnnotationForClass(date = "123456")
public class FirstTuorial {
    
    @AnnotationForField(fieldTypeInString = "String")
    public String field;
    
    @AnnotationForFunction(date = "Emrooz",description = "nothing")
    public void theFirstAnnotedMethod(){
        
    }
        // Checks if an annotation is present
    
    
}
