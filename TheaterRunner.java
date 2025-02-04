import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

String[][] foodNames = {
  {"Tacos", "Oreo Milkshake", "Toast Pepperoni Pizza", "Dr. Pepper"},
  {"Sushi", "USC Fight On Cake", "Barnes & Nobles Cookie", "Hot Chocolate"},
  {"Amboy Cheeseburger", "Blaze Pizza", "Chiptole Chicken Sandwich", "Carmel Vanilla Milkshake"},
  {"Sushi Pt. 2", "Chick-Fil-A Sandwich", "Portos Salad", "BJs Pizza"},
  {"Pazookie", "Domino's Pizza", "In N Out Burger", "Steak Burrito"},
  {"Ubatuba Bowl", "Carne Asada", "Portos Salad Pt. 2", "Sushi Pt. 3"},
  {"Oat Chocolate Bar", "USC Salad", "USC Chicken Tenders", "Fried Daisy"},
  {"Banana Chocolate Muffins", "Thai Food Bowl", "Cucumber Salad", "Chicken Alfredo"},
  {"Brookie", "Carne Asada Pt. 2", "Sushi in Greece", "Donuts"},
  {"Bean Dip", "White Chocolate Mocha", "La La Land Lemonade", "Chicken Sliders"},
  {"Vanilla Latte", "Pancakes", "Garlic Bread", "Chocolate Chip Cookies"},
  {"Croffle", "Hot Chocolate", "Tacos", "Canes"},
};

String[][] foodRatings = {
  {"10/10", "9/10", "7/10", "10/10"},
  {"10/10", "7/10", "6/10", "10/10" },
  {"7/10", "6/10", "4/10", "6/10"},
  {"10/10", "10/10", "10/10", "8/10"},
  {"10/10", "6/10", "9/10", "8/10"},
  {"10/10", "10/10", "10/10", "8/10"},
  {"4/10", "3/10", "2/10", "7/10"},
  {"10/10", "10/10", "10/10", "9/10"},
  {"6/10", "10/10", "3/10", "7/10"},
  {"10/10", "8/10", "8/10", "8/10"},
  {"7/10", "8/10", "10/10", "8/10"},
  {"10/10", "10/10", "10/10", "2/10"},
};
  
MyStory scene = new MyStory(foodNames, foodRatings);

// msin drawScene call
    scene.drawScene();

// Play the scene in the Theater
    Theater.playScenes(scene);


    

    
    
  }
}