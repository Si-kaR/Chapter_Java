/**
 * --------------------------------------------------------------
 * Project: Creating Circles
 * Author:  [ Robert  Sika ]
 * Student ID: [ 89212025 ]
 * Date of Commencement: [ Tuesday, February 27, 2024]
 * Time of Commencement: [ 11 : 00 am]
 * Date of Completion: [February 27, 2024 - Tuesday]
 * Time of Completion: [ - - - - - - ]
 * University: [ Ashesi University ]
 * Faculty: [ Dr.Ayorkor Korsah ]
 * Faculty Intern: [ Elijah Boateng  &  Gideon - - - - ]
 * --------------------------------------------------------------
 * Description:
 * This Java program computes the radius of a circle. 
 * With this, as well as the Java Object oriented programming making use of CLASSES AND OBJECTS, 
 * 
 * We will be creating a class that will serve as a blueprint for creating multiple Circles (Objects). 
 * --------------------------------------------------------------
 */




 /**
  * The first snippet declares a PUBLIC CLASS

  * Which means it can be accessed from other classes in the same package or from other packages.

  * This is achieved by using the public keyword before the class declaration.
  */

class Circle {

    /**
     * This class will compute the radius, area and perimeter
     * , providing a framework / blueprint that will be used
     * in the creation of circles of different dimensions
     * 
     * @param
     */

     double radius;

     double existingRadius = radius;
    

    Circle () {  // Constructor - - - - -no args

    }


    Circle (double newRadius) {    // Constructor  - - - - args

      existingRadius = newRadius;

    }
    


    // = = = = = = = = = = == = =      M E T H O D        = = = = = = = = = = = = = = = = = = = = = = 

    double getArea () {
      return existingRadius * existingRadius * math.PI;
    }

    // = = = = = = = = = = == = =      M E T H O D        = = = = = = = = = = = = = = = = = = = = = = 


    double getPerimeter () {
      return 2 * math.PI * existingRadius;
    }

    // = = = = = = = = = = == = =      M E T H O D        = = = = = = = = = = = = = = = = = = = = = = 
    double setRadius () {
      existingRadius = newRadius;
    }

    
}
