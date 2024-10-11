/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package realsteal;

import robocode.*;

/**
 *
 * @author marc
 */
public class RealSteal extends TeamRobot {
    @Override
    public void run(){
        while(true) {
            this.setAhead(100);
            this.setTurnRight(90);
            execute();
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        // hacer algo cuando un robot es escaneado
    }
    
}
