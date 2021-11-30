/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anstractfactory;

/**
 *
 * @author MIHAN
 */
public class MobileFactory extends AbstractDeviceFactory{

    @Override
    Devices getGadget(String Modelname) {
        
        if (Modelname.equalsIgnoreCase("nokia")) {
            return new Nokia("Nokia Lumia", "4GB");
        } 
        return null;
    }
    
}
