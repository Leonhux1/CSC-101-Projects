/* Name = Faizan Rafieuddin.
   Description = "In this program, I have defined a class named 
                  Box, along with all of its contents which will
                  be tested by the Driver program "BoxTester.java".
                  This program deals with the dimensions of a box". */
                  
// Defining the class "Box"
class Box {
   
   // "Defining all of the data members to be used throughtout the process.
   private double width;
   private double length;
   private double height;
   
   // Defining and creating a static constant.
   public final static double BIG = 20.0;
   
   /* Defining the constructors for each case of default values being passed
      in during the object creation. */
   public Box() {
      this(1, 1, 1);
   }
   
   public Box(double widthSub, double lengthSub) {
      this(widthSub, lengthSub, 1);
   }
   
   public Box(double widthSub2, double lengthSub2, double heightSub2) {
      setWidth(widthSub2);
      setLength(lengthSub2);
      setHeight(heightSub2);
   }
   
   // Creating the getters (Accessors) for each of the data members.
   public double getWidth() {
      return width;
   }
   
   public double getLength() {
      return length;
   }
   
   public double getHeight() {
      return height;
   }
   
   // Creating the setters (Modifiers) for each of the data members.
   public void setWidth(double dim1) {
      this.width = dim1;
   }
   
   public void setLength(double dim2) {
      this.length = dim2;
   }
   
   public void setHeight(double dim3) {
      this.height = dim3;
   }
   
   // Creating the toString() method to quickly access the information of an object.
   public String toString() {
      return this.width + "W x " + this.length + "L x " + this.height + "H";
   }
   
   /* Creating an instance method with an object as return type. This method will add the 
      contents of the members of both the calling object and the object in the parameter
      together, then return a new object that has the combined data values of both the objects. */
   public Box add(Box b2) {
      double width1, length1, height1;
      
      width1 = this.getWidth() + b2.getWidth();
      length1 = this.getLength() + b2.getLength();
      height1 = this.getHeight() + b2.getHeight();
      
      Box newObj = new Box(width1, length1, height1);
      
      return newObj;
   }
   
   /* Creating an instance method with an object as return type. This method will accept
      a double in the parameters and that double would be added to all of the data members
      of the calling object. Then, a new object will be returned having the modified data members. */
   public Box add(double number) {
      double attribute1, attribute2, attribute3;
      
      attribute1 = this.getWidth() + number;
      attribute2 = this.getLength() + number;
      attribute3 = this.getHeight() + number;
      
      Box newObj2 = new Box(attribute1, attribute2, attribute3);
      
      return newObj2;
   }
   
   /* Creating an instance method with the return type boolean. This method will accept 
      an object in the parameter, then will compare all of the data members of the calling
      object and the object passed in. If all of the members are equal, this will return
      a true to the call site. Otherwise, it will return a false. */
   public boolean equals(Box incoming) {
      if (this.getWidth() == incoming.getWidth() && this.getLength() == incoming.getLength() && this.getHeight() == incoming.getHeight()) {
         return true;
      }
      return false;
   }
   
   /* Creating an instance method with the return type boolean. This method will add
      all of the current data members of the calling object and compare the result
      to the static constant "BIG" (defined above). If the result comes out to be 
      greater than the constant, a true is returned to the call site. Otherwise, a 
      false is returned. */
   public boolean isBig() {
      if (this.getWidth() + this.getLength() + this.getHeight() > BIG) {
         return true;
      }
      return false;
   }
}