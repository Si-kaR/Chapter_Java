public class MyClassTest {
	public static void main(String[] args){
		MyClass obj1 = new MyClass(35);  
		MyClass obj2 = new MyClass();

		System.out.println("After initilization...");
		System.out.println("obj1 -> " + obj1); 
		System.out.println("obj2 -> " + obj2);

		System.out.println("\nEXPERIMENT 1: ");
		for (int i=0; i<3; i++){
			System.out.printf("\nIteration %d...\n",i);
			obj1.incMyValue();
			MyClass.incOurValue();
			// .incOurValue();			   // LINE 14 static method should referenced with the class name
			System.out.println("obj1 -> " + obj1);

			obj2.incMyValue();
			MyClass.incOurValue();
			// obj2.incOurValue();				// LINE 18 static method should referenced with the class name
			System.out.println("obj2 -> " + obj2);
		}
		MyClass.incOurValue();
		System.out.println("After experiment 1, our value is "
							+ MyClass.getOurValue());

		System.out.println("\nEXPERIMENT 2: ");
		for (int i=0; i<3; i++){
			System.out.printf("\nIteration %d...\n",i);
			obj1.incMyValue();
			MyClass.incOurValue();
			// obj1.incOurValue();				// LINE 29 static method should referenced with the class name

			obj2.incMyValue();
			MyClass.incOurValue();
			// obj2.incOurValue();				// LINE 32 static method should referenced with the class name

			System.out.println("obj1 -> " + obj1);
			System.out.println("obj2 -> " + obj2);
		}
		MyClass.incOurValue();
		System.out.println("After experiment 2, our value is "
							+ MyClass.getOurValue());
	}
}








// (a) Static Variable:

// In the MyClass class, ourValue is declared as a static variable using the static keyword. 
// This means that ourValue is shared among all instances of the MyClass class. 
// There is only one copy of this variable regardless of how many objects of MyClass are created.

// In this program, ourValue is used to keep track of a value that is common to all instances of the class. 
// It is accessed using the class name (MyClass) rather than through any particular instance.




// (b) Static Method:

// In the MyClass class, incOurValue() is declared as a static method using the static keyword. 
// Static methods belong to the class rather than to any particular instance of the class.
// Static methods can be called using the class name (MyClass.incOurValue()) rather than 
// through a specific object of the class.

// Static methods cannot access instance variables directly; they can only access static variables.
// In summary, static variables and methods are associated with the class itself rather than with 
// individual instances of the class. They are accessed using the class name and are shared among all instances of the class.