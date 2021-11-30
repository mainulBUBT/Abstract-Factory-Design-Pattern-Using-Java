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
public class FactoryGenerator {
    public static AbstractDeviceFactory deviceFactory(String factoryName){
        if (factoryName.equalsIgnoreCase("mobile")) {
            return new MobileFactory();
            
        } else if (factoryName.equalsIgnoreCase("laptop")) {
            return new LaptopFactory();
        }
 {
            
        }
        return null;
    }
}
