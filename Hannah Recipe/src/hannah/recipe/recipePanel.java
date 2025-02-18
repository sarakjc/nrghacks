/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hannah.recipe;

import static hannah.recipe.HannahRecipe.readFile;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author sarak
 */
public class recipePanel extends JPanel{
    public static ArrayList<String> titles;
    public static ArrayList<String> ingredients;
    public static ArrayList<String> steps;
    
    public recipePanel(){
        super();
        ArrayList<ArrayList<String>> array = HannahRecipe.readFile();
        titles = array.get(0);
        ingredients = array.get(1);
        steps = array.get(2);
        
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // sets background colour
        g.setColor(Const.BG);
        g.fillRect(0, 0, Const.panelWIDTH, Const.panelHEIGHT);
        
    }
}
