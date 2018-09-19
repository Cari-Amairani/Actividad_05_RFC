
/**
 *
 * @author Carina Amairani Díaz Ramírez
 */
package main;

import model.ModelRFC;
import view.ViewRFC;
import controllers.ControllerRFC;

public class Main {

    
    public static void main(String[] args) {
       
         ModelRFC modelRfc = new ModelRFC();
        ViewRFC viewRfc = new ViewRFC();
        ControllerRFC controllerRfc = new ControllerRFC(modelRfc, viewRfc);
        
        controllerRfc.iniciar_vista();
        viewRfc.setVisible(true);
        
    }
    
}
