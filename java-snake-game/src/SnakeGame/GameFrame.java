/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakeGame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class GameFrame extends JFrame{
    GameFrame(){
        setAppIcon();
        setFrame();
    }
    public void setFrame(){
        
        GamePanel panel = new GamePanel();
        
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    public void setAppIcon()
    {
        ImageIcon logo = new ImageIcon(this.getClass().getResource("/SnakeGame/snake2.png"));
        this.setIconImage(logo.getImage());
    }
    
     /*public static void main(String [] args){
        GameFrame frame = new GameFrame();
    }*/
     
}
