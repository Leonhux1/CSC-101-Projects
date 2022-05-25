// Name = Faizan Rafieuddin.
//Box Tester Class - DO NOT CHANGE THIS CLASS!

class BoxTester {
   public static void main(String args[] ) {
   
      //create numbers testing all three constructors
      Box boxOne = new Box();
      Box boxTwo = new Box(5.5, 3.3);
      Box boxThree = new Box(10, 15.2, 3);
      
      // test toString
      System.out.println("boxOne Dimensions: " + boxOne.toString());
      System.out.println("boxTwo Dimensions: " + boxTwo.toString());
      System.out.println("boxThree Dimensions: " + boxThree.toString());
      
      //test accessors/getters
      System.out.println();
      System.out.println("Using getters:");
      System.out.println("Width of boxThree: "+ boxThree.getWidth());
      System.out.println("Length of boxThree: " + boxThree.getLength());
      System.out.println("Height of boxThree: " + boxThree.getHeight());
      
      //test modifiers/setters
      System.out.println();
      System.out.println("Using setters:");
      System.out.println("Change boxOne width to 12");
      boxOne.setWidth(12);
      System.out.println("Change boxOne length to 13");
      boxOne.setLength(13);
      System.out.println("Change boxOne height to 14");
      boxOne.setHeight(14);

      System.out.println("boxOne new dimensions: " + boxOne.toString());
      System.out.println();
      
      //test two instance add methods
      System.out.println("Creating boxFour by adding boxOne to boxTwo");
      Box boxFour= boxOne.add(boxTwo);
      System.out.println("boxFour dimensions: " + boxFour.toString());
      Box boxFive = boxTwo.add(10);
      System.out.println("Adding to boxTwo height to create boxFive...");
      System.out.println("boxFive dimensions: " + boxFive);
      System.out.println();
      
      //test equals method
      Box boxSix = new Box(12, 13, 14);
      System.out.println("boxOne equal to boxSix: " + boxOne.equals(boxSix));
      System.out.println("boxThree equal to boxFour: " + boxThree.equals(boxFour));   
      
      //testing isBig method   
      System.out.println();
      System.out.println("boxFive big: " + boxFive.isBig());
      System.out.println("boxTwo big: " + boxTwo.isBig());
   }
}
   
   
