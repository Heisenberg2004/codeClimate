import java.util.ArrayList;
import java.util.List;

public class Example {
    
    public static void main(String[] args) {
        Example example = new Example();
        example.runExample();
    }

    public void runExample() {
        List<String> list = new ArrayList<>();
        
        // Adding elements to the list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 2"); // Duplicate item
        list.add("Item 3");
        
        // Print the list
        for (String item : list) {
            System.out.println(item);
        }
        
        // Long method
        longMethod();
    }

    // A method with high cyclomatic complexity
    public void longMethod() {
        int x = 5;
        int y = 10;
        
        if (x < y) {
            if (x == 5) {
                System.out.println("x is 5");
            } else {
                System.out.println("x is not 5");
            }
        } else if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is equal to y");
        }
        
        // Nested loops
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
