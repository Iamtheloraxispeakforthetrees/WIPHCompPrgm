
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;



/**
 *
 * @author 801420
 */
public class CaveDweller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame("Cave Dweller");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800, 600);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your caveman's name?");
        String username = kb.nextLine();
        Cave cave = new Cave(username);
        String prompt = "";
        }
    }
