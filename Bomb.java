
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Bomb {
  public int x, y, vx, vy, height, width;
  private final int strength;
  private Rectangle bounds;
  
  Bomb (Cave cave) {
      this.x = (int)(Math.random() * cave.getWidth());
      this.y = (int)(Math.random() * cave.getHeight());
      this.height = 15;
      this.width = 15;
      this.strength = (int)(Math.random() * 100);
  }
  
  public int getX(){
      return x;
  }
  
  public int getY() {
      return y;
  }
  
  public int getStrength() {
      return strength;
  }
  
  public void update() {
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
}
