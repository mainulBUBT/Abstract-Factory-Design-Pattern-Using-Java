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
public class Dell implements Devices{
    
    String modelName;
    String ram;
    String ssd;

    public Dell(String modelName, String ram, String ssd) {
        this.modelName = modelName;
        this.ram = ram;
        this.ssd = ssd;
    }

   
    @Override
    public String getDetails() {
        return "Laptop Name: "+modelName +" and Ram: "+ram+ " SSD: "+ssd;
    }
    
}
