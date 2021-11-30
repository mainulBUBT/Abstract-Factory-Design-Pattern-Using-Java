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
public class AnstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractDeviceFactory factory = FactoryGenerator.deviceFactory("mobile");
        Devices deviceMobile = factory.getGadget("nokia");
        System.out.println(deviceMobile.getDetails());
        
        System.out.println();
        
        AbstractDeviceFactory factory1 = FactoryGenerator.deviceFactory("laptop");
        Devices laptopDevice = factory1.getGadget("dell");
        System.out.println(laptopDevice.getDetails());
        
    }
    
}
