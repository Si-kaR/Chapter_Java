
public class MyClass {
	
	private int myValue;
	private static int ourValue; // ourValue is declared as a static variable using the static keyword

	// This means that ourValue is shared among all instances of the MyClass class.

	// 	Specifically, two instances are created:

	// obj1: Created using the constructor MyClass(35). 
	// This instance is initialized with a value of 35 for its myValue instance variable.

	// obj2: Created using the default constructor MyClass(). 
	// This instance is initialized with a default value of 0 for its myValue instance variable.

	public MyClass(){
		myValue = 0;
	}

	public MyClass(int value){
		myValue = value;
	}

	public int getMyValue(){
		return myValue;
	}

	public static int getOurValue(){
		return ourValue;
	}

	public void incMyValue(){
		myValue++;
	}

	public static void incOurValue(){ // incOurValue() is declared as a static method using the static keyword. 
		ourValue++;
	}

	// Static methods belong to the class rather than to any particular instance of the class.

	// Static methods can be called using the class name (MyClass.incOurValue()) rather than 
	
	// through a specific object of the class.






	// myValue is an instance variable because it is declared without the static keyword. 
	
	// Therefore, incOurValue(), being a static method, cannot directly access or modify myValue.
	public String toString(){
		return ("Mine: " + myValue + ". Ours: " + ourValue);
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