import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
// Adding elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
// Accessing elements by index
        System.out.println(fruits.get(0)); // Output: Apple

// Iterating over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
