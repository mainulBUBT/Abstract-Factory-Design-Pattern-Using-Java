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
public abstract class AbstractDeviceFactory {
    abstract Devices getGadget(String Modelname);
}
