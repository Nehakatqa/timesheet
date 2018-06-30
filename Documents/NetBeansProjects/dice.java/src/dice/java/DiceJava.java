/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice.java;

import java.util.Random;

/**
 *
 * @author Neha Kathuria
 */
public class DiceJava {
int faces;
    DiceJava(int face)
    {
        face=faces;
    }
    public String roll()
    {
        Random r=new Random();
        String[] faces_2={"one","two"};
        String[] faces_4={"one","two","three","four"};
        String[] faces_6={"one","two","three","four","five","six"};
         int outcome=r.nextInt(faces);
        if(faces==2)
        {        
        return faces_2[outcome];
        }
        else if(faces==4)
        {
               return faces_4[outcome];
        }
        else
            return faces_6[outcome];
            
    }
    public static void main(String[] args) {
        for(int i=2;i<=6;i+=2)
            {
        DiceJava d1=new DiceJava(i);
        System.out.println("Faces of die"+d1.roll());
            }
    }
}
    

