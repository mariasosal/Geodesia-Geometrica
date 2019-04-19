/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geodesia.geometrica;

import java.awt.BorderLayout;

/**
 *
 * @author LENOVO
 */
public class GeodesiaGeometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame miFrame=new Frame();
       Panel miPanel = new Panel();
       
       
       miFrame.setLayout(new BorderLayout());
       miFrame.add(miPanel, BorderLayout.CENTER);
       
       miFrame.setVisible(true);
    }
    
}
