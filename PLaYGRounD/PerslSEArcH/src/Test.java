public class Test {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before calling method: " + person.name); // Output: Before calling method: Alice
        changeName(person);
        System.out.println("After calling method: " + person.name);  // Output: After calling method: Bob
    }

    public static void changeName(Person p) {
        p.name = "Bob"; // Changes made here are reflected outside the method
    }
}
