//Write a program for swapping and find a factorial value. Perform swapping without 
using third variable in java 
 
import java.util.Scanner; 
 
public class SwapAndFactorial { 
 
    // Method to swap two numbers without using a third variable 
    public static void swap(int a, int b) { 
        System.out.println("Before swapping: a = " + a + ", b = " + b); 
         
        // Swapping logic 
        a = a + b; // a now contains the sum of both 
        b = a - b; // b is now the original value of a 
        a = a - b; // a is now the original value of b 
 
        System.out.println("After swapping: a = " + a + ", b = " + b); 
    } 
 
    // Method to calculate factorial 
    public static int factorial(int n) { 
        if (n == 0) { 
            return 1; 
        } 
        return n * factorial(n - 1); 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        // Input for swapping 
        System.out.print("Enter first number (a): "); 
        int a = scanner.nextInt(); 
        System.out.print("Enter second number (b): "); 
        int b = scanner.nextInt(); 
         
        // Perform swapping 
        swap(a, b); 
         
        // Input for factorial calculation 
        System.out.print("Enter a number to calculate factorial: "); 
        int number = scanner.nextInt(); 
         
        // Calculate and print factorial 
        int fact = factorial(number); 
        System.out.println("Factorial of " + number + " is: " + fact); 
         
        scanner.close(); 
    } 
}













//Write a program to accept a number from the user through command line and display 
whether the given number is palindrome or not. in java 
 
import java.util.Scanner; 
 
public class PalindromeCheck { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user to enter a number 
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
 
        // Check if the number is a palindrome 
        if (isPalindrome(number)) { 
            System.out.println(number + " is a palindrome."); 
        } else { 
            System.out.println(number + " is not a palindrome."); 
        } 
 
        scanner.close(); 
    } 
 
    public static boolean isPalindrome(int num) { 
        int originalNumber = num; 
        int reversedNumber = 0; 
 
        while (num != 0) { 
            int digit = num % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            num /= 10; 
        } 
 
        return originalNumber == reversedNumber; 
    } 
} 














//Write a program to accept an array of integer from the user through command line and 
find prime numbers from the array in java  
 
import java.util.Scanner; 
 
public class PrimeNumbersInArray { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user to enter the size of the array 
        System.out.print("Enter the size of the array: "); 
        int size = scanner.nextInt(); 
         
        int[] numbers = new int[size]; 
         
        // Prompt the user to enter the elements of the array 
        System.out.println("Enter the elements of the array:"); 
        for (int i = 0; i < size; i++) { 
            numbers[i] = scanner.nextInt(); 
        } 
 
        // Find and display prime numbers in the array 
        System.out.println("Prime numbers in the array:"); 
        for (int num : numbers) { 
            if (isPrime(num)) { 
                System.out.print(num + " "); 
            } 
        } 
 
        scanner.close(); 
    } 
 
    // Method to check if a number is prime 
    public static boolean isPrime(int num) { 
        if (num <= 1) { 
            return false; // 1 and numbers less than 1 are not prime 
        } 
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) { 
                return false; // If divisible by any number other than 1 and itself, it's not prime 
            } 
        } 
        return true; 
    } 
}













// Create a class Stack that defines an integer stack that can hold 10 values. Perform 
push and pop actions in a stack in java 
 
class Stack { 
    private int[] stackArray; 
    private int top; 
    private static final int MAX_SIZE = 10; 
 
    // Constructor to initialize the stack 
    public Stack() { 
        stackArray = new int[MAX_SIZE]; 
        top = -1; // Stack is initially empty 
    } 
 
    // Method to push an element onto the stack 
    public void push(int value) { 
        if (top >= MAX_SIZE - 1) { 
            System.out.println("Stack Overflow! Unable to push " + value); 
        } else { 
            stackArray[++top] = value; 
            System.out.println("Pushed " + value + " onto the stack."); 
        } 
    } 
 
    // Method to pop an element from the stack 
    public int pop() { 
        if (top < 0) { 
            System.out.println("Stack Underflow! No elements to pop."); 
            return -1; // Returning -1 to indicate stack underflow 
        } else { 
            int poppedValue = stackArray[top--]; 
            System.out.println("Popped " + poppedValue + " from the stack."); 
            return poppedValue; 
        } 
    } 
 
    // Method to check if the stack is empty 
    public boolean isEmpty() { 
        return (top < 0); 
    } 
 
    // Method to check if the stack is full 
    public boolean isFull() { 
        return (top >= MAX_SIZE - 1); 
    } 
     
    // Method to display the stack elements 
    public void display() { 
        if (top < 0) { 
            System.out.println("Stack is empty."); 
        } else { 
            System.out.print("Stack elements: "); 
            for (int i = 0; i <= top; i++) { 
                System.out.print(stackArray[i] + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 
 
public class StackDemo { 
    public static void main(String[] args) { 
        Stack stack = new Stack(); 
 
        // Perform stack operations 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.display(); 
 
        stack.pop(); 
        stack.display(); 
 
        stack.push(40); 
        stack.push(50); 
        stack.push(60); 
        stack.push(70); 
        stack.push(80); 
        stack.push(90); 
        stack.push(100); 
        stack.push(110); // This should cause a stack overflow 
 
        stack.display(); 
 
        stack.pop(); 
        stack.pop(); 
        stack.display(); 
    } 
}

















//Write a program to create a class Publisher with attributes publisher name and 
publisher id. Derive a subclass Book with attributes bookname, bookid and author name. 
All these data should be entered by the user. Create two methods getdata() and 
showdata() to display the details of book and publisher. in java 
 
import java.util.Scanner; 
 
// Publisher class 
class Publisher { 
    String publisherName; 
    int publisherId; 
 
    // Method to get publisher data 
    void getData() { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Publisher Name: "); 
        publisherName = scanner.nextLine(); 
        System.out.print("Enter Publisher ID: "); 
        publisherId = scanner.nextInt(); 
        scanner.nextLine(); // consume the newline 
    } 
 
    // Method to display publisher data 
    void showData() { 
        System.out.println("Publisher Name: " + publisherName); 
        System.out.println("Publisher ID: " + publisherId); 
    } 
} 
 
// Book class derived from Publisher 
class Book extends Publisher { 
    String bookName; 
    int bookId; 
    String authorName; 
 
    // Method to get book data 
    @Override 
    void getData() { 
        super.getData(); 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter Book Name: "); 
        bookName = scanner.nextLine(); 
        System.out.print("Enter Book ID: "); 
        bookId = scanner.nextInt(); 
        scanner.nextLine(); // consume the newline 
        System.out.print("Enter Author Name: "); 
        authorName = scanner.nextLine(); 
    } 
 
    // Method to display book data 
    @Override 
    void showData() { 
        super.showData(); 
        System.out.println("Book Name: " + bookName); 
        System.out.println("Book ID: " + bookId); 
        System.out.println("Author Name: " + authorName); 
    } 
} 
 
// Main class to test the functionality 
public class Main { 
    public static void main(String[] args) { 
        Book book = new Book(); 
        book.getData(); 
        System.out.println("\nDisplaying Book and Publisher Details:"); 
        book.showData(); 
    }
}













// Write a program to create a class with two methods with same name addfunc(), one 
accepting two integer parameters and other accepting two double parameters. When 
method is called, the appropriate method should be selected depending on parameters 
passed(method overloading).  
class Calculator { 
// Method to add two integers 
public int addfunc(int a, int b) { 
return a + b; 
} 
// Method to add two doubles 
public double addfunc(double a, double b) { 
return a + b; 
} 
public static void main(String[] args) { 
        Calculator calc = new Calculator(); 
 
        // Calling the method with integer parameters 
        int sumInt = calc.addfunc(10, 20); 
        System.out.println("Sum of integers: " + sumInt); 
 
        // Calling the method with double parameters 
        double sumDouble = calc.addfunc(10.5, 20.5); 
        System.out.println("Sum of doubles: " + sumDouble); 
    } 
} 
 







//Write a program to create a class with two methods with same name addfunc(), one 
accepting two integer parameters and other accepting two double parameters. When 
method is called, the appropriate method should be selected depending on parameters 
passed(method overloading).  
class Calculator { 
// Method to add two integers 
public int addfunc(int a, int b) { 
return a + b; 
} 
// Method to add two doubles 
public double addfunc(double a, double b) { 
return a + b; 
} 
public static void main(String[] args) { 
        Calculator calc = new Calculator(); 
 
        // Calling the method with integer parameters 
        int sumInt = calc.addfunc(10, 20); 
        System.out.println("Sum of integers: " + sumInt); 
 
        // Calling the method with double parameters 
        double sumDouble = calc.addfunc(10.5, 20.5); 
        System.out.println("Sum of doubles: " + sumDouble); 
    } 
} 
 







// Declare a variable called x with integer as the data type in base class and subclass. 
Make a method named as show() which displays the value of x in the superclass and 
subclass 
 
// Base class (Superclass) 
class SuperClass { 
    // Declare an integer variable x in the superclass 
    int x = 10; 
 
    // Method to display the value of x in the superclass 
    void show() { 
        System.out.println("Value of x in SuperClass: " + x); 
    } 
} 
 
// Subclass that extends the SuperClass 
class SubClass extends SuperClass { 
    // Declare an integer variable x in the subclass 
    int x = 20; 
 
    // Method to display the value of x in the subclass 
    @Override 
    void show() { 
        // Display value of x in SuperClass 
        super.show(); 
 
        // Display value of x in SubClass 
        System.out.println("Value of x in SubClass: " + x); 
    } 
} 
 
// Main class to test the program 
public class Main { 
    public static void main(String[] args) { 
        // Create an object of SubClass 
        SubClass obj = new SubClass(); 
 
        // Call the show() method to display values of x 
        obj.show(); 
    } 
}








//Write a program to calculate the area, circumference and volume for all shapes. 
// Interface defining common methods for all shapes 
interface Shape { 
double calculateArea(); 
double calculateCircumference(); 
double calculateVolume(); 
} 
// Abstract class for two-dimensional shapes 
abstract class TwoDimensionalShape implements Shape { 
@Override 
public double calculateVolume() { 
// Two-dimensional shapes do not have volume 
return 0; 
} 
} 
// Final class for Circle (2D shape) 
final class Circle extends TwoDimensionalShape { 
private double radius; 
public Circle(double radius) { 
this.radius = radius; 
} 
@Override 
public double calculateArea() { 
return Math.PI * radius * radius; 
} 
@Override 
public double calculateCircumference() { 
return 2 * Math.PI * radius; 
} 
} 
// Final class for Sphere (3D shape) 
final class Sphere implements Shape { 
private double radius; 
 
    public Sphere(double radius) { 
        this.radius = radius; 
    } 
 
    @Override 
    public double calculateArea() { 
        return 4 * Math.PI * radius * radius; 
    } 
 
    @Override 
    public double calculateCircumference() { 
        // Circumference is usually not defined for 3D shapes 
        // Returning the circumference of a great circle (circle on the sphere's surface) 
        return 2 * Math.PI * radius; 
    } 
 
    @Override 
    public double calculateVolume() { 
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3); 
    } 
} 
 
// Final class for Rectangle (2D shape) 
final class Rectangle extends TwoDimensionalShape { 
    private double length, width; 
 
    public Rectangle(double length, double width) { 
        this.length = length; 
        this.width = width; 
    } 
 
    @Override 
    public double calculateArea() { 
        return length * width; 
    } 
 
    @Override 
    public double calculateCircumference() { 
        return 2 * (length + width); 
    } 
} 
 
// Main class to test the application 
public class Main { 
    public static void main(String[] args) { 
        // Creating objects for Circle, Sphere, and Rectangle 
        Circle circle = new Circle(5); 
        Sphere sphere = new Sphere(5); 
        Rectangle rectangle = new Rectangle(4, 6); 
 
        // Displaying results for Circle 
        System.out.println("Circle:"); 
        System.out.println("Area: " + circle.calculateArea()); 
        System.out.println("Circumference: " + circle.calculateCircumference()); 
        System.out.println("Volume: " + circle.calculateVolume()); 
 
        // Displaying results for Sphere 
        System.out.println("\nSphere:"); 
        System.out.println("Area: " + sphere.calculateArea()); 
        System.out.println("Circumference: " + sphere.calculateCircumference()); 
        System.out.println("Volume: " + sphere.calculateVolume()); 
 
        // Displaying results for Rectangle 
        System.out.println("\nRectangle:"); 
        System.out.println("Area: " + rectangle.calculateArea()); 
        System.out.println("Circumference: " + rectangle.calculateCircumference()); 
        System.out.println("Volume: " + rectangle.calculateVolume()); 
    } 
} 
 
 








//Write a program to enter two integers from the command line and display the division 
of those two numbers. Handle all the exceptions (i.e. ArrayIndexOutOfBoundsException, 
NumberFormatException, ArithmeticException) for invalid arguments passed. 
 
import java.util.Scanner; 
 
public class DivisionCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try { 
            // Prompt user to enter two integers 
            System.out.print("Enter the first integer: "); 
            String input1 = scanner.nextLine(); 
            System.out.print("Enter the second integer: "); 
            String input2 = scanner.nextLine(); 
 
            // Convert the inputs to integers 
            int num1 = Integer.parseInt(input1); 
            int num2 = Integer.parseInt(input2); 
 
            // Perform the division 
            int result = num1 / num2; 
 
            // Display the result 
            System.out.println("Result: " + result); 
 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: Not enough input arguments."); 
        } catch (NumberFormatException e) { 
            System.out.println("Error: Invalid number format. Please enter valid integers."); 
        } catch (ArithmeticException e) { 
            System.out.println("Error: Division by zero is not allowed."); 
        } catch (Exception e) { 
            System.out.println("Error: An unexpected exception occurred."); 
        } finally { 
            scanner.close(); 
        } 
    } 
} 
 











//Write a program to perform following actions and store output in file:  
1. Accept strings from user, convert it into uppercase and store it in a file. 
2. Write double value to a text file and also display the date on which the application was 
run inside the file. 
3. Delete a given file or directory and display appropriate message 

1 code 

import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 

public class UppercaseToFile { 
   public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in); 
        
       try { 
           // Open a FileWriter to write to a file (output.txt) 
           FileWriter writer = new FileWriter("output.txt", true); // 'true' allows appending to the file 
            
           String input; 
           System.out.println("Enter strings to convert to uppercase (type 'exit' to stop):"); 

           // Keep accepting strings until 'exit' is entered 
           while (true) { 
               System.out.print("Enter a string: "); 
               input = scanner.nextLine(); 
                
               // Check for exit condition 
               if (input.equalsIgnoreCase("exit")) { 
                   break; 
               } 
                
               // Convert the string to uppercase and write to the file 
               writer.write(input.toUpperCase() + "\n"); 
           } 

           // Close the file writer 
           writer.close(); 
           System.out.println("Strings have been written to output.txt."); 
            
       } catch (IOException e) { 
           System.out.println("An error occurred while writing to the file."); 
           e.printStackTrace(); 
       } finally { 
           scanner.close(); 
       } 
   } 
}












//File Handling Write a program to perform following actions and store output in file:  
 
1. Accept strings from user, convert it into uppercase and store it in a file.  
2. Write double value to a text file and also display the date on which the application was run      
inside the file.  
3. Delete a given file or directory and display appropriate message 
 
 
import java.io.*; 
import java.util.Date; 
import java.util.Scanner; 
 
public class FileHandlingDemo { 
     
    // Method to write user input strings in uppercase to a file 
    public static void writeUppercaseToFile(String filename) { 
        try (Scanner scanner = new Scanner(System.in); 
             FileWriter writer = new FileWriter(filename)) { 
             
            System.out.println("Enter strings to store in file (type 'exit' to stop):"); 
            while (true) { 
                String input = scanner.nextLine(); 
                if ("exit".equalsIgnoreCase(input)) { 
                    break; 
                } 
                writer.write(input.toUpperCase() + System.lineSeparator()); 
            } 
            System.out.println("Strings written in uppercase to file: " + filename); 
             
        } catch (IOException e) { 
            System.out.println("Error writing to file: " + e.getMessage()); 
        } 
    } 
 
    // Method to write a double value and date to a file 
    public static void writeDoubleAndDateToFile(String filename, double value) { 
        try (FileWriter writer = new FileWriter(filename, true)) { 
             
            Date date = new Date(); 
            writer.write("Double Value: " + value + System.lineSeparator()); 
            writer.write("Date of Execution: " + date.toString() + System.lineSeparator()); 
            System.out.println("Double value and date written to file: " + filename); 
             
        } catch (IOException e) { 
            System.out.println("Error writing to file: " + e.getMessage()); 
        } 
    } 
 
    // Method to delete a file or directory 
    public static void deleteFileOrDirectory(String path) { 
        File file = new File(path); 
        if (file.exists()) { 
            if (file.isDirectory()) { 
                File[] files = file.listFiles(); 
                if (files != null) { 
                    for (File f : files) { 
                        f.delete(); 
                    } 
                } 
            } 
            if (file.delete()) { 
                System.out.println("File/Directory deleted successfully: " + path); 
            } else { 
                System.out.println("Failed to delete file/directory: " + path); 
            } 
        } else { 
            System.out.println("File/Directory does not exist: " + path); 
        } 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Task 1: Write uppercase strings to file 
        System.out.print("Enter the filename to store uppercase strings: "); 
        String upperFilename = scanner.nextLine(); 
        writeUppercaseToFile(upperFilename); 
 
        // Task 2: Write double and date to file 
        System.out.print("Enter the filename to store double value and date: "); 
        String doubleFilename = scanner.nextLine(); 
        System.out.print("Enter a double value to write to the file: "); 
        double value = scanner.nextDouble(); 
        writeDoubleAndDateToFile(doubleFilename, value); 
 
        // Task 3: Delete a file or directory 
        scanner.nextLine();  // Consume newline 
        System.out.print("Enter the path of the file/directory to delete: "); 
        String deletePath = scanner.nextLine(); 
        deleteFileOrDirectory(deletePath); 
 
        scanner.close(); 
    } 
}









//Write a program for creating an ArrayList, add the elements in array list and then 
obtain an array from ArrayList and display the contents and sum of those numbers. 
 
import java.util.ArrayList; 
import java.util.Scanner; 
 
public class ArrayListToArrayExample { 
 
    public static void main(String[] args) { 
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in); 
 
        // Add elements to the ArrayList 
        System.out.println("Enter numbers to add to the ArrayList (type 'done' to finish):"); 
        while (true) { 
            String input = scanner.nextLine(); 
            if (input.equalsIgnoreCase("done")) { 
                break; 
            } 
            try { 
                int number = Integer.parseInt(input); 
                arrayList.add(number); 
            } catch (NumberFormatException e) { 
                System.out.println("Invalid input, please enter a number."); 
            } 
        } 
 
        // Convert ArrayList to an array 
        Integer[] array = arrayList.toArray(new Integer[0]); 
 
        // Display contents and calculate sum 
        int sum = 0; 
        System.out.print("Array contents: "); 
        for (int num : array) { 
            System.out.print(num + " "); 
            sum += num; 
        } 
        System.out.println("\nSum of elements: " + sum); 
 
        scanner.close(); 
    } 
}







//12  Create a class named Address and define name, city and state as the data members 
of this class. Create another class named Maillist and add the elements to the linked list 
and display the contents using Iterator interface. 
 
import java.util.Iterator; 
import java.util.LinkedList; 
 
class Address { 
    private String name; 
    private String city; 
    private String state; 
 
    // Constructor 
    public Address(String name, String city, String state) { 
        this.name = name; 
        this.city = city; 
        this.state = state; 
    } 
 
    // toString method to display address information 
    @Override 
    public String toString() { 
        return "Name: " + name + ", City: " + city + ", State: " + state; 
    } 
} 
 
class Maillist { 
    private LinkedList<Address> addressList; 
 
    // Constructor 
    public Maillist() { 
        addressList = new LinkedList<>(); 
    } 
 
    // Method to add address to the list 
    public void addAddress(Address address) { 
        addressList.add(address); 
    } 
 
    // Method to display all addresses using Iterator 
    public void displayAddresses() { 
        Iterator<Address> iterator = addressList.iterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next()); 
        } 
    } 
} 
 
public class Main { 
    public static void main(String[] args) { 
        // Create a Maillist instance 
        Maillist mailList = new Maillist(); 
 
        // Add Address objects to the Maillist 
        mailList.addAddress(new Address("Alice Johnson", "New York", "NY")); 
        mailList.addAddress(new Address("Bob Smith", "Los Angeles", "CA")); 
        mailList.addAddress(new Address("Carol White", "Chicago", "IL")); 
 
        // Display all addresses in the Maillist 
        System.out.println("Mailing List:"); 
        mailList.displayAddresses(); 
    } 
} 
 












//13 Create a Gregorian Calendar. Display current date and time in default locale and time 
zone. Find out whether the current year is a leap year or not. 
 
import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.text.SimpleDateFormat; 
 
public class GregorianCalendarExample { 
 
    public static void main(String[] args) { 
        // Create a GregorianCalendar instance with the current date and time 
        GregorianCalendar calendar = new GregorianCalendar(); 
 
        // Display current date and time in default locale and time zone 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        System.out.println("Current Date and Time: " + dateFormat.format(calendar.getTime())); 
 
        // Check if the current year is a leap year 
        int year = calendar.get(Calendar.YEAR); 
        boolean isLeapYear = calendar.isLeapYear(year); 
 
        System.out.println("Current Year: " + year); 
        if (isLeapYear) { 
            System.out.println("The year " + year + " is a leap year."); 
        } else { 
            System.out.println("The year " + year + " is not a leap year."); 
        } 
    } 
}












//14 Write a program to find integers and decimal value from the string by using a pattern 
of regular expression 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
 
public class NumberExtractor { 
 
    public static void main(String[] args) { 
        // Example input string 
        String input = "The total cost is 1200 and the tax rate is 15.75. Another value is -35 
and discount is 3.50."; 
 
        // Regular expression patterns for integers and decimal values 
        String integerPattern = "-?\\b\\d+\\b"; 
        String decimalPattern = "-?\\b\\d+\\.\\d+\\b"; 
 
        // Compile patterns 
        Pattern intPattern = Pattern.compile(integerPattern); 
        Pattern decPattern = Pattern.compile(decimalPattern); 
 
        // Match and find integers 
        System.out.println("Integers found:"); 
        Matcher intMatcher = intPattern.matcher(input); 
        while (intMatcher.find()) { 
            System.out.println(intMatcher.group()); 
        } 
 
        // Match and find decimal values 
        System.out.println("\nDecimal values found:"); 
        Matcher decMatcher = decPattern.matcher(input); 
        while (decMatcher.find()) { 
            System.out.println(decMatcher.group()); 
        } 
    } 
}





15  Write a multi-threaded program which sets the priority of threads and gets the name 
of threads 
class CustomThread extends Thread { 
public CustomThread(String name) { 
super(name); // Set thread name 
} 
@Override 
public void run() { 
// Print the name and priority of the current thread 
        System.out.println("Thread Name: " + getName() + ", Priority: " + getPriority()); 
    } 
} 
 
public class MultiThreadExample { 
    public static void main(String[] args) { 
        // Create threads 
        CustomThread thread1 = new CustomThread("Thread-1"); 
        CustomThread thread2 = new CustomThread("Thread-2"); 
        CustomThread thread3 = new CustomThread("Thread-3"); 
 
        // Set thread priorities 
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority (1) 
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (5) 
        thread3.setPriority(Thread.MAX_PRIORITY); // Highest priority (10) 
 
        // Start the threads 
        thread1.start(); 
        thread2.start(); 
        thread3.start(); 
    } 
}

















//16 Write a program to calculate sum and factorial of numbers using sleep 
method. 
class SumThread extends Thread { 
    private int number; 
    private int sum = 0; 
 
    public SumThread(int number) { 
        this.number = number; 
    } 
 
    @Override 
    public void run() { 
        for (int i = 1; i <= number; i++) { 
            sum += i; 
            try { 
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate delay 
            } catch (InterruptedException e) { 
                System.out.println(e.getMessage()); 
            } 
        } 
        System.out.println("Sum of numbers up to " + number + " is: " + sum); 
    } 
} 
 
class FactorialThread extends Thread { 
    private int number; 
    private long factorial = 1; 
 
    public FactorialThread(int number) { 
        this.number = number; 
    } 
 
    @Override 
    public void run() { 
        for (int i = 1; i <= number; i++) { 
            factorial *= i; 
            try { 
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate delay 
            } catch (InterruptedException e) { 
                System.out.println(e.getMessage()); 
            } 
        } 
        System.out.println("Factorial of " + number + " is: " + factorial); 
    } 
} 
 
public class SumAndFactorial { 
    public static void main(String[] args) { 
        int number = 5; // Example number for calculation 
 
        // Create and start threads 
        SumThread sumThread = new SumThread(number); 
        FactorialThread factorialThread = new FactorialThread(number); 
 
        sumThread.start(); 
        factorialThread.start(); 
 
        try { 
            // Wait for both threads to finish 
            sumThread.join(); 
            factorialThread.join(); 
        } catch (InterruptedException e) { 
            System.out.println(e.getMessage()); 
        } 
 
        System.out.println("Calculations completed."); 
    } 
}

















//17  Write a program to create multi-threaded application to perform banking tasks. [For 
Example: Withdrawal and Deposit from Joint account.] 
 
class JointAccount { 
    private double balance; 
 
    public JointAccount(double initialBalance) { 
        this.balance = initialBalance; 
    } 
 
    // Synchronized method to deposit money 
    public synchronized void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println(Thread.currentThread().getName() + " deposited: $" + amount); 
            System.out.println("New Balance after deposit: $" + balance); 
            notify(); // Notify any waiting threads 
        } else { 
            System.out.println("Invalid deposit amount by " + Thread.currentThread().getName()); 
        } 
    } 
 
    // Synchronized method to withdraw money 
    public synchronized void withdraw(double amount) { 
        while (amount > balance) { 
            System.out.println(Thread.currentThread().getName() + " tried to withdraw: $" + amount 
+ " (Insufficient balance)"); 
            try { 
                wait(); // Wait until enough balance is available 
            } catch (InterruptedException e) { 
                System.out.println(e.getMessage()); 
            } 
        } 
        if (amount > 0) { 
            balance -= amount; 
            System.out.println(Thread.currentThread().getName() + " withdrew: $" + amount); 
            System.out.println("New Balance after withdrawal: $" + balance); 
        } else { 
            System.out.println("Invalid withdrawal amount by " + 
Thread.currentThread().getName()); 
        } 
    } 
 
    public double getBalance() { 
        return balance; 
    } 
} 
 
// Runnable for performing deposit tasks 
class DepositTask implements Runnable { 
    private JointAccount account; 
    private double amount; 
 
    public DepositTask(JointAccount account, double amount) { 
        this.account = account; 
        this.amount = amount; 
    } 
 
    @Override 
    public void run() { 
        account.deposit(amount); 
    } 
} 
 
// Runnable for performing withdrawal tasks 
class WithdrawalTask implements Runnable { 
    private JointAccount account; 
    private double amount; 
 
    public WithdrawalTask(JointAccount account, double amount) { 
        this.account = account; 
        this.amount = amount; 
    } 
 
    @Override 
    public void run() { 
        account.withdraw(amount); 
    } 
} 
 
public class BankingApplication { 
    public static void main(String[] args) { 
        JointAccount jointAccount = new JointAccount(1000); // Starting balance of $1000 
 
        // Create deposit and withdrawal tasks 
        Thread depositThread1 = new Thread(new DepositTask(jointAccount, 500), 
"DepositThread-1"); 
        Thread withdrawThread1 = new Thread(new WithdrawalTask(jointAccount, 700), 
"WithdrawThread-1"); 
        Thread withdrawThread2 = new Thread(new WithdrawalTask(jointAccount, 900), 
"WithdrawThread-2"); 
        Thread depositThread2 = new Thread(new DepositTask(jointAccount, 300), 
"DepositThread-2"); 
 
        // Start the threads 
        depositThread1.start(); 
        withdrawThread1.start(); 
        withdrawThread2.start(); 
        depositThread2.start(); 
    } 
}












//18 Write a program to create a Menubar and create 2 Menus File and Edit. Involve 
New, Open, Close as items in the File menu and then add a separator, then further 
add Save, Save As and again add separator and add another menu item named 
Print.  
Add all these items in File menu. Add Line, Rectangle and Circle as the menu 
items and add Radio Button before these menu  
items and add a separator. Then add Red, Green and Blue as menu items and add 
Check Box before these menu items.  
import javax.swing.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
public class MenuBarExample extends JFrame { 
public MenuBarExample() { 
setTitle("Menu Bar Example"); 
setSize(400, 300); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
// Create the menu bar 
JMenuBar menuBar = new JMenuBar(); 
// File Menu 
JMenu fileMenu = new JMenu("File"); 
// File menu items 
JMenuItem newItem = new JMenuItem("New"); 
JMenuItem openItem = new JMenuItem("Open"); 
JMenuItem closeItem = new JMenuItem("Close"); 
JMenuItem saveItem = new JMenuItem("Save"); 
JMenuItem saveAsItem = new JMenuItem("Save As"); 
JMenuItem printItem = new JMenuItem("Print"); 
// Adding items to File menu 
fileMenu.add(newItem); 
fileMenu.add(openItem); 
fileMenu.add(closeItem); 
fileMenu.addSeparator(); // Separator 
fileMenu.add(saveItem); 
fileMenu.add(saveAsItem); 
fileMenu.addSeparator(); // Another Separator 
fileMenu.add(printItem); 
// Add File menu to the menu bar 
menuBar.add(fileMenu); 
// Edit Menu 
JMenu editMenu = new JMenu("Edit"); 
// Radio button menu items for Edit menu 
JRadioButtonMenuItem lineItem = new JRadioButtonMenuItem("Line"); 
JRadioButtonMenuItem rectangleItem = new JRadioButtonMenuItem("Rectangle"); 
JRadioButtonMenuItem circleItem = new JRadioButtonMenuItem("Circle"); 
// Group radio buttons so only one can be selected at a time 
ButtonGroup shapesGroup = new ButtonGroup(); 
shapesGroup.add(lineItem); 
shapesGroup.add(rectangleItem); 
shapesGroup.add(circleItem); 
// Add radio button items to Edit menu 
editMenu.add(lineItem); 
editMenu.add(rectangleItem); 
editMenu.add(circleItem); 
editMenu.addSeparator(); // Separator 
// Checkbox menu items for colors 
JCheckBoxMenuItem redItem = new JCheckBoxMenuItem("Red"); 
JCheckBoxMenuItem greenItem = new JCheckBoxMenuItem("Green"); 
JCheckBoxMenuItem blueItem = new JCheckBoxMenuItem("Blue"); 
// Add checkbox items to Edit menu 
editMenu.add(redItem); 
editMenu.add(greenItem); 
editMenu.add(blueItem); 
// Add Edit menu to the menu bar 
menuBar.add(editMenu); 
// Set the menu bar for the frame 
setJMenuBar(menuBar); 
// Action listeners for menu items 
newItem.addActionListener(new MenuActionListener("New selected")); 
openItem.addActionListener(new MenuActionListener("Open selected")); 
closeItem.addActionListener(new MenuActionListener("Close selected")); 
saveItem.addActionListener(new MenuActionListener("Save selected")); 
saveAsItem.addActionListener(new MenuActionListener("Save As selected")); 
printItem.addActionListener(new MenuActionListener("Print selected")); 
lineItem.addActionListener(new MenuActionListener("Line selected")); 
rectangleItem.addActionListener(new MenuActionListener("Rectangle selected")); 
circleItem.addActionListener(new MenuActionListener("Circle selected")); 
redItem.addActionListener(new MenuActionListener("Red color selected")); 
greenItem.addActionListener(new MenuActionListener("Green color selected")); 
blueItem.addActionListener(new MenuActionListener("Blue color selected")); 
} 
// Inner class for handling menu actions 
private class MenuActionListener implements ActionListener { 
private String message; 
public MenuActionListener(String message) { 
this.message = message; 
} 
@Override 
public void actionPerformed(ActionEvent e) { 
System.out.println(message); 
} 
} 
public static void main(String[] args) { 
SwingUtilities.invokeLater(() -> { 
MenuBarExample example = new MenuBarExample(); 
example.setVisible(true); 
}); 
} 
} 









//19 Create Java Applets to perform following tasks:  
1. To display simple calculator 
import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
 
public class CalculatorApplet extends Applet implements ActionListener { 
    // Components 
    private TextField display; 
    private double operand1, operand2, result; 
    private String operator; 
 
    @Override 
    public void init() { 
        // Set layout 
        setLayout(new BorderLayout()); 
 
        // Display field 
        display = new TextField(); 
        display.setEditable(false); 
        add(display, BorderLayout.NORTH); 
 
        // Panel for buttons 
        Panel buttonPanel = new Panel(); 
        buttonPanel.setLayout(new GridLayout(4, 4)); 
 
        // Button labels 
        String[] buttonLabels = { 
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "0", ".", "=", "+" 
        }; 
 
        // Create and add buttons 
        for (String label : butt 
 
 
2. To write the content of the text area in the file, whose name is given in the text box using Frame 
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
 
public class FileWriterApp extends JFrame implements ActionListener { 
    private JTextField fileNameField; 
    private JTextArea textArea; 
    private JButton saveButton; 
 
    public FileWriterApp() { 
        // Set up the frame 
        setTitle("Text Area to File"); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
 
        // Top panel for file name input 
        JPanel topPanel = new JPanel(new BorderLayout()); 
        topPanel.add(new JLabel("File Name: "), BorderLayout.WEST); 
        fileNameField = new JTextField(); 
        topPanel.add(fileNameField, BorderLayout.CENTER); 
        add(topPanel, BorderLayout.NORTH); 
 
        // Text area for content input 
        textArea = new JTextArea(); 
        JScrollPane scrollPane = new JScrollPane(textArea); 
        add(scrollPane, BorderLayout.CENTER); 
 
        // Bottom panel for save button 
        JPanel bottomPanel = new JPanel(); 
        saveButton = new JButton("Save to File"); 
        saveButton.addActionListener(this); 
        bottomPanel.add(saveButton); 
        add(bottomPanel, BorderLayout.SOUTH); 
    } 
 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == saveButton) { 
            String fileName = fileNameField.getText().trim(); 
            String content = textArea.getText(); 
 
            if (fileName.isEmpty()) { 
                JOptionPane.showMessageDialog(this, "Please enter a file name.", "Error", 
JOptionPane.ERROR_MESSAGE); 
                return; 
            } 
 
            try (FileWriter writer = new FileWriter(fileName)) { 
                writer.write(content); 
                JOptionPane.showMessageDialog(this, "File saved successfully.", "Success", 
JOptionPane.INFORMATION_MESSAGE); 
            } catch (IOException ex) { 
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage(), "Error", 
JOptionPane.ERROR_MESSAGE); 
            } 
        } 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            FileWriterApp app = new FileWriterApp(); 
            app.setVisible(true); 
        }); 
    } 
} 
2. To draw rectangle to the applet when mouse is dragged. 
import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
public class RectangleDrawApplet extends Applet implements MouseListener, MouseMotionListener { 
private int startX, startY, currentX, currentY; 
private boolean dragging; 
@Override 
public void init() { 
        // Set background color 
        setBackground(Color.WHITE); 
 
        // Add mouse listeners 
        addMouseListener(this); 
        addMouseMotionListener(this); 
    } 
 
    @Override 
    public void paint(Graphics g) { 
        // Draw the rectangle only when dragging 
        if (dragging) { 
            int x = Math.min(startX, currentX); 
            int y = Math.min(startY, currentY); 
            int width = Math.abs(currentX - startX); 
            int height = Math.abs(currentY - startY); 
            g.setColor(Color.BLUE); 
            g.drawRect(x, y, width, height); 
        } 
    } 
 
    // MouseListener methods 
    @Override 
    public void mousePressed(MouseEvent e) { 
        startX = e.getX(); 
        startY = e.getY(); 
        dragging = true; 
    } 
 
    @Override 
    public void mouseReleased(MouseEvent e) { 
        dragging = false; 
        repaint(); 
    } 
 
    @Override 
    public void mouseClicked(MouseEvent e) {} 
 
    @Override 
    public void mouseEntered(MouseEvent e) {} 
 
    @Override 
    public void mouseExited(MouseEvent e) {} 
 
    // MouseMotionListener methods 
    @Override 
    public void mouseDragged(MouseEvent e) { 
        currentX = e.getX(); 
        currentY = e.getY(); 
        repaint(); 
    } 
 
    @Override 
    public void mouseMoved(MouseEvent e) {} 
} 
Html file  
<html> 
    <body> 
<applet code="RectangleDrawApplet.class" width="500" height="500"> 
</applet> 
</body> 
</html>















//20 Write a program to create 3 radio buttons named C++, Java and Pascal and add on JPanel. The user is 
asked to identify which of them is not an OOP language. When the user selects on choice, the program 
responds by displaying whether the selection is correct or wrong. 
 
 
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
public class LanguageQuiz extends JFrame implements ActionListener { 
    private JRadioButton cPlusPlusButton, javaButton, pascalButton; 
    private ButtonGroup buttonGroup; 
    private JLabel resultLabel; 
 
    public LanguageQuiz() { 
        // Set up the frame 
        setTitle("OOP Language Quiz"); 
        setSize(400, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
 
        // Create the question label 
        JLabel questionLabel = new JLabel("Which of the following is NOT an OOP language?"); 
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        add(questionLabel, BorderLayout.NORTH); 
 
        // Create the radio buttons 
        cPlusPlusButton = new JRadioButton("C++"); 
        javaButton = new JRadioButton("Java"); 
        pascalButton = new JRadioButton("Pascal"); 
 
        // Group the radio buttons 
        buttonGroup = new ButtonGroup(); 
        buttonGroup.add(cPlusPlusButton); 
        buttonGroup.add(javaButton); 
        buttonGroup.add(pascalButton); 
 
        // Add the buttons to a panel 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.setLayout(new GridLayout(3, 1)); 
        buttonPanel.add(cPlusPlusButton); 
        buttonPanel.add(javaButton); 
        buttonPanel.add(pascalButton); 
 
        add(buttonPanel, BorderLayout.CENTER); 
 
        // Add action listeners to the buttons 
        cPlusPlusButton.addActionListener(this); 
        javaButton.addActionListener(this); 
        pascalButton.addActionListener(this); 
 
        // Create the result label 
        resultLabel = new JLabel("", SwingConstants.CENTER); 
        add(resultLabel, BorderLayout.SOUTH); 
    } 
 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        String message = ""; 
        if (e.getSource() == cPlusPlusButton) { 
            message = "Incorrect! C++ is an OOP language."; 
        } else if (e.getSource() == javaButton) { 
            message = "Incorrect! Java is an OOP language."; 
        } else if (e.getSource() == pascalButton) { 
            message = "Correct! Pascal is not an OOP language."; 
        } 
        resultLabel.setText(message); 
    } 
 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            LanguageQuiz quiz = new LanguageQuiz(); 
            quiz.setVisible(true); 
        }); 
    } 
}
















//



