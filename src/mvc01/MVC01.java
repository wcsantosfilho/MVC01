/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc01;

import mvc01.controller.ControllerPrincipal;
import mvc01.view.FramePrincipal;

/**
 *
 * @author Gustavo Ferreira
 */
public class MVC01 {

    public static void main(String[] args) {
        FramePrincipal framePrinc = new FramePrincipal();
        ControllerPrincipal controllerPrincipal = new ControllerPrincipal(framePrinc);
        framePrinc.setVisible(true);

    }

}
