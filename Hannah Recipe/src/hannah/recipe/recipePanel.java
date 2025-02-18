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
    static ArrayList<String> titles;
    static ArrayList<String> ingredients;
    static ArrayList<String> steps;
    
    public recipePanel(){
    ArrayList array = readFile();
    titles = (ArrayList) array.get(0);
    ingredients = (ArrayList) array.get(1);
    steps = (ArrayList) array.get(2);
}
    @Override
    public void paintComponent(Graphics g) {
        // sets background colour
        g.setColor(Const.BG);
        g.fillRect(0, 0, Const.panelWIDTH, Const.panelHEIGHT);
        
    }
}
