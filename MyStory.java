import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

// Instance variables
private String[][] names;
private String[][] ratings;
  
// Constructor
  public MyStory(String[][] names, String[][] ratings){
    this.names = names;
    this.ratings = ratings;
  }
  
// Main drawScene method
  public void drawScene(){
    drawJanuraryScene();
    // drawFeburaryScene();
    // drawMarchScene();
    // drawAprilScene();
    // drawMayScene();
    // drawJuneScene();
    // drawJulyScene();
    // drawAugustScene();
    // drawSeptemberScene();
    // drawOctoberScene();
    // drawNovemberScene();
    // drawDecemberScene();
  }

  public void drawJanuraryScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Two Foods I Ate in Janurary", 20, 40);
    int x = 20;
    int y = 70;
 for (int i = 0; i < 4; i++) {
   }
    ImageFilter lengua = new ImageFilter ("Tacos-de-Lengua(1).jpg");
    drawImage(lengua, x, y, 170);
    pause(.5);
    // drawImage(lengua, x, y, 170);
    drawText(names[0][0], x, y);
    drawText(ratings[0][0], x, 330);
    pause(0.5);
    pause(0.5);
   x += 180;
   ImageFilter Oreo = new ImageFilter ("OreoMilkShake.jpg");
    drawImage(Oreo, x, y, 170);
    pause(.5);
    drawImage(Oreo, x, y, 170);
   if (x >= 220) {
     x = 20;
    ImageFilter toast = new ImageFilter ("ToastPizza.jpg");
    drawImage(toast, x, y, 170);
    pause(.5);
    drawImage(toast, x, y, 170);
     y += 200;
     ImageFilter dr = new ImageFilter ("DrPepper.jpg");
    drawImage(dr, x, y, 170);
    pause(.5);
    drawImage(dr, x, y, 170);
 }

}

public void drawFeburaryScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in Feburary", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("FightOn.jpg");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawMarchScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in March", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawAprilScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in April", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawMayScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in May", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawJuneScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in June", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawJulyScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in July", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawAugustScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in August", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawSeptemberScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in September", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

  public void drawOctoberScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in October", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawNovemberScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in November", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}

public void drawDecemberScene(){
  // 1. clear the scene / draw background
  clear("gray");

  setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.SERIF, FontStyle.BOLD_ITALIC);

  drawText("Foods I ate in December", 20, 40);
    int x = 20;
    int y = 60;
 for (int i = 0; i < 4; i++) {
    ImageFilter thrall = new ImageFilter ("flag.png");
    drawImage(thrall, x, y, 170);
    pause(.5);
    drawImage(thrall, x, y, 170);
   x += 180;
   if (x >= 220) {
     x = 20;
     y += 200;
   }
 }

}


}