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
public class Nokia implements Devices{
    
    String modelName;
    String ram;

    public Nokia(String modelName, String ram) {
        this.modelName = modelName;
        this.ram = ram;
    }

  
    @Override
    public String getDetails() {
        return "Mobile Name: "+modelName +" and Ram: "+ram;
    }
    
}
