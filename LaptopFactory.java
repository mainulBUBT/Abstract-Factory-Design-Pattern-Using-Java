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
public class LaptopFactory extends AbstractDeviceFactory{

    @Override
    Devices getGadget(String Modelname) {
        
        if (Modelname.equalsIgnoreCase("dell")) {
            return new Dell("Dell Inspiron", "4GB","240GB");
        } 
        return null;
    }
    
}
