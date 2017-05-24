import java.awt.*;

abstract class sprite {
   // x and y positions
   int xpos;
   int ypos;
   // an int of 0-3 used to orient the sprite
   int direction;
   // an int 0-3 that shows where the sprite wants to turn
   int push; 
   // pixles of motion before refresh
   int speed = 5;
   // variables that dictate where a sprite can turn
   boolean turningPoint;
   boolean turnUp;
   boolean turnDown;
   boolean turnLeft;
   boolean turnRight; 
   
   //creates the graphic for the player's icon
   public void drawPlayer (Graphics g) {
      g.setColor(Color.YELLOW);
      g.fillOval(xpos - 10, ypos - 10, 20, 20); //g.fillOval(0, 0, 20, 20);
      g.setColor(Color.BLACK);
      g.fillRect(xpos - 10, ypos - 5, 20, 5); //g.fillRect(0, 5, 20, 5);
      g.setColor(Color.YELLOW);
      g.drawOval(xpos - 10, ypos - 10, 20, 20);  //g.drawOval(0, 0, 20, 20);
      g.fillOval(11, 11, 3, 3); //g.fillOval(6, 6, 3, 3);
      g.fillOval(18, 11, 3, 3); //g.fillOval(13, 6, 3, 3);
   }
   // updates a sprites position based on its direction
   public void updatePos() {
      if(direction == 0) {
         xpos += speed;
      }
      if(direction == 2) {
         xpos -= speed;
      }
      if(direction == 1) {
         ypos += speed;
      }
      if(direction == 3) {
         ypos -= speed;
      }
   }
   // turns a sprite based on push and location
   public void turn() {
      if(push == 0 && turnRight == true) {
         direction = 0;
      }
      if(push == 1 && turnUp == true) {
         direction = 1;
      }
      if(push == 2 && turnLeft == true) {
         direction = 2;
      }
      if(push == 3 && turnDown == true) {
         direction = 3;
      }
   }
   
   // checks for where the sprite has space to turn
   public void turnCheck() {
      turnRight = false;
      turnLeft = false;
      turnUp = false;
      turnDown = false;
      if (xpos == 25) {
         if (ypos == 25) {
            turnRight = true;
            turnDown = true; 
         }
         if (ypos == 275) {
            turnRight = true;
            turnDown = true; 
            turn   
         }
         if (ypos == 475) {
            turnUp = true;
            turnRight = true;
         }
      }
      if (xpos == 225) {
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
         if () {
         
         } 
      }
      if (xpos == 425) {
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
      }
      if (xpos == 575) {
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
      }
      if (xpos == 825) {
         if () {
         
         }
         if () {
         
         }
         if () {
         
         }
      }
      if (xpos == 975) {
         if () {
         
         }
         if () {
         
         }
      }
      
   }
}