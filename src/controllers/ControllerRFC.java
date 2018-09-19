/**
 *
 * @author Carina Amairani Díaz Ramírez
 */
package controllers;

import model.ModelRFC;
import view.ViewRFC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRFC implements ActionListener{
    
    private ModelRFC modelRFC;
     private ViewRFC viewRFC;

    public ControllerRFC(ModelRFC modelRFC, ViewRFC viewRFC) {
        this.modelRFC = modelRFC;
        this.viewRFC = viewRFC;
        
        this.viewRFC.jB_Calcular.addActionListener(this);
    }

    public void iniciar_vista(){
        viewRFC.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelRFC.setNombre(viewRFC.jTF_Nombre.getText());
        modelRFC.setAPaterno(viewRFC.jTF_APaterno.getText());
        modelRFC.setAMaterno(viewRFC.jTF_AMaterno.getText());
        
        modelRFC.setDia(String.valueOf(viewRFC.jCB_Dia.getSelectedItem()));
        modelRFC.setMes(String.valueOf(viewRFC.jCB_Mes.getSelectedItem()));
        modelRFC.setAnio(String.valueOf(viewRFC.jCB_Anio.getSelectedItem()));
        
   if(e.getSource()==viewRFC.jB_Calcular) modelRFC.datosRfc();
 
    viewRFC.jL_RFC.setText(modelRFC.getRFC());
    
    }
  
   
}


