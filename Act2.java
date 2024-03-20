import java.util.Scanner;
import java.util.Stack;

public class Act2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack Operations:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Search");
        System.out.println("5. Check if empty");
        System.out.println("6. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println("Element " + element + " pushed onto the stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Element " + poppedElement + " popped from the stack.");
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        int peekedElement = stack.peek();
                        System.out.println("Top element of the stack: " + peekedElement);
                    } else {
                        System.out.println("Stack is empty. No elements to peek.");
                    }
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int searchElement = scanner.nextInt();
                    int position = stack.search(searchElement);
                    if (position != -1) {
                        System.out.println("Element " + searchElement + " found at position " + position + " from the top of the stack.");
                    } else {
                        System.out.println("Element " + searchElement + " not found in the stack.");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
