import org.code.theater.*;
import org.code.media.*;

/*
*Represents a image that contains multiple filters
*/
public class ImageFilter extends ImagePlus {

  /*
  * Calls the superclass constructor to initialize the 2D
  */
  public ImageFilter(String filename){
    super(filename);
  }

/** IMAGE FILTERS FRO LESSON 8 */

// Colorize Filter
public void colorize() {
  Pixel[][] arr = getImagePixels();

    for (int row = 0; row < arr.length; row++){
      for (int col = 0; col < arr[0].length; col++){
        Pixel currentPixel = arr[row][col];

        int currentRed = currentPixel.getRed();
        int currentBlue = currentPixel.getBlue();
        int currentGreen = currentPixel.getGreen();

        int avg = (currentRed + currentBlue + currentGreen) / 3;

        if (avg < 85){
          currentPixel.setRed(255);
          currentPixel.setBlue(0);
          currentPixel.setGreen(0);
        }
        else if (avg <170){
          currentPixel.setRed(0);
          currentPixel.setBlue(0);
          currentPixel.setGreen(255);
        }
        else {
          currentPixel.setRed(0);
          currentPixel.setBlue(255);
          currentPixel.setGreen(0);
        }
      }
    }
    
  }

// Emboss Filter
public void emboss() {
  Pixel [][] pixels = getImagePixels();

// Traverse through the pixels
    for(int row = 1; row < pixels.length; row++){
      for(int col = 1; col < pixels[0].length; col++){
        Pixel currentPixel = pixels[row][col];
        Pixel topLeftPixel = pixels[row-1][col-1];

        int diffRed = currentPixel.getRed() - topLeftPixel.getRed();
        int diffGreen = currentPixel.getGreen() - topLeftPixel.getGreen();
        int diffBlue = currentPixel.getBlue() - topLeftPixel.getBlue();

        int maxDiff = 0;
      
      if (Math.abs(diffRed) > Math.abs(diffGreen) && Math.abs(diffRed) > Math.abs(diffBlue)){
        maxDiff = Math.abs(diffRed);
      }
      else if (Math.abs(diffGreen) > Math.abs(diffBlue) && Math.abs(diffGreen) > Math.abs(diffRed)){
        maxDiff = Math.abs(diffGreen);
      }
       else{
        maxDiff = Math.abs(diffBlue);
      }
      int newColor = 128 + maxDiff;
      currentPixel.setRed(newColor);
      currentPixel.setBlue(newColor);
      currentPixel.setGreen(newColor);
    }    
  }
}

public void motionBlur(int length, String direction) {
Pixel[][] pixels = getImagePixels();
for (int row = 0; row < pixels.length; row++) {
  for (int col = 0; col < pixels[0].length; col++) {
        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        int x = col;
        int y = row;
        int count = 0;

        while (count < length && x < pixels[0].length && y < pixels.length) {
          Pixel currentPixel = pixels[y][x];
          totalRed += currentPixel.getRed();
          totalGreen += currentPixel.getGreen();
          totalBlue += currentPixel.getBlue();
          count++;

          if (direction.equals("horizontal")) {
            x++;
          }
          else if (direction.equals("vertical")) {
            y++;
          }
          else if (direction.equals("diagonal")) {
            x++;
            y++;
          }
        }

        int avgRed = totalRed / count;
        int avgGreen = totalGreen / count;
        int avgBlue = totalBlue / count;

        Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(avgRed);
        currentPixel.setGreen(avgGreen);
        currentPixel.setBlue(avgBlue);
      }
    }

   
  }


}