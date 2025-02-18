/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hannah.recipe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hannahblack
 */
public class HannahRecipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        writeFile("Title:\nTomato and Egg\nIngredients:\n5 tomatoes\n2 eggs\nSteps:\nmix eggs\ncook eggs\ncut tomatoes\nadd tomatoes");
        ArrayList array = readFile();
        for (int i = 0; i < array.size(); i++) {
            ArrayList al = (ArrayList) array.get(i);
            System.out.println("hi");
            for (int j = 0; j < al.size(); j++) {
                System.out.println("hii");
                System.out.println(al.get(j));
            }
        }
    }

    public static ArrayList readFile() {
        File f = new File("myRecipeBook.txt");
        try {
            Scanner s = new Scanner(f);
            ArrayList threeD = new ArrayList();
            ArrayList<String> titles = new ArrayList(0);
            ArrayList<String> ingredients = new ArrayList(0);
            ArrayList<String> steps = new ArrayList(0);
            while (s.hasNextLine()) {
                String words = s.nextLine();
                if (words.equals("Title:")) {
                    titles.add(s.nextLine());
                } else if (words.equals("Ingredients:")) {
                    words = s.nextLine();
                    String line = s.nextLine();
                    while (!line.equals("Steps:")) {
                        words = words + "\n" + line;
                        line = s.nextLine();
                    }
                    ingredients.add(words);
                    line = s.nextLine();
                    words = line;
                    while (s.hasNextLine()) {
                        line = s.nextLine();
                        if (line.equals("{}")) {
                            break;
                        }
                        words = words + "\n" + line;
                    }
                    steps.add(words);
                }
            }
            threeD.add(titles);
            threeD.add(ingredients);
            threeD.add(steps);
            return threeD;
        } catch (IOException e) {
            ArrayList<String> array = new ArrayList(0);
            array.add("Recipes could not be loaded");
            return array;
        }
    }

    public static String writeFile(String text) {
        final boolean APPEND = true;
        File f = new File("myRecipeBook.txt");
        try {
            FileWriter fw = new FileWriter(f, APPEND);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("{}\n" + text);
            pw.close();
            return "Recipe successfully saved";
        } catch (IOException e) {
            return "Recipe could not save, please try again";
        }
    }

}
