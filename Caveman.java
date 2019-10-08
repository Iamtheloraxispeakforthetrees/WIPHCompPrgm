
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Caveman {
    private final String name;
    private int x, y, height, width, vx, vy;
    private int health;
    private Rectangle bounds;
    private Color color;
    private final int SPEED = 10;
            
    public Caveman(String name, Cave cave) {
        this.name = name;
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
        this.health = (int)(Math.random() * 100);
        this.width = 25;
        this.height = 25;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public int getX() {
       return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void move(int dx, int dy) {
        
        x += dx;
        y += dy;
    }
    
    public void drink(Potion p) {
        health += p.getStrength();
        System.out.println("drank potion");
    }
    
    public void enter(Door d) {
        System.out.println("You managed to get out!");
    }
    
    public void detonate(Bomb b) {
        health -= b.getStrength();
        System.out.println("detonated bomb");
        if (this.health <= 0) {
            System.out.println("Goodbye cruel world.");
            //exit(0) indicates successful, exit(1) unsuccessful
            System.exit(0);
        }
    }
    
    public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    
    public void stop() {
        this.vx = 0;
        this.vy = 0;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fill(bounds);
    }
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Caveman.move("right");
            System.out.println("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Caveman.move("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            Caveman.move("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Caveman.move("down");
        }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Caveman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Caveman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Caveman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
           Caveman.stop();
        }
            
    }
    
    public void moveback(BackToStart bts) {
        System.out.println("You're at the center of the cave!");
    }
    
    public void killwall(KillWall wall) {
        health -= wall.getStrength();
        System.out.println("You went outside the boundaries.");
        if (this.health <= 0) {
            System.out.println ("You died.");
            System.exit(0);
        }
    }
}
