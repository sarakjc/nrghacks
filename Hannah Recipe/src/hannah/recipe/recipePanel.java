/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hannah.recipe;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author sarak
 */
public class recipePanel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
        // sets background colour
        g.setColor(Const.BG);
        g.fillRect(0, 0, Const.panelWIDTH, Const.panelHEIGHT);
        
    }
}
