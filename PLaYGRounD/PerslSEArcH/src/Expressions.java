public class Expressions {

    public static void main(String[] args) {
        // 📚 This section delves into understanding Expressions, Operands, and Operators.
        // ➡️ Expressions combine operands with operations.
        // 📌 Operands encompass values like variables, numbers, and quantities.
        // ➕➖ Operators include symbols such as addition (+) and subtraction (-).
        
        // 🌟 For a practical example: 
        // 🧑‍🤝‍🧑 Imagine we have a count of friends, and we increase this count by 1.
        
        int friends = 10;


        System.out.println("I have "+friends+" friends !");
        System.out.println("You are a new friend !");
        friends = friends + 1;
        System.out.println("Adding you up means I now have "+friends+" friends !");

        System.out.println();
        System.out.println("Craps, I learned three of my friends died SkyDiving ");
        friends = friends - 3;
        System.out.println("Meaning, Now I have "+friends+" friends !");
        System.out.println();

        System.out.println("Damn, Someone said they'll no longer be friends ");
        friends = friends - 1;
        System.out.println("Meaning, Now I have "+friends+" friends !");
        System.out.println();

        int skateboards_num = 6;
        System.out.println("Okay I have "+skateboards_num+" skateboards to share equally among my "+friends+" friends");
        System.out.println("But a friend has moved out of the country");
        friends = friends - 1;
        System.out.println("Meaning I can only share the boards among "+friends+" friends currently in the country !");
        int each = friends / skateboards_num;
        System.out.println("No problem, meaning each friend will get "+each+" board!");
        System.out.println();



    }
    
}
