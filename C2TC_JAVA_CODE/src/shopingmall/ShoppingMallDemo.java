package shopingmall;

public class ShoppingMallDemo {
    public static void main(String[] args) {
        
        // Create objects of Electronics and Cloths
        Shopping electronics = new Electronics(); // polymorphism
        Shopping cloths = new Cloths();

        // Call their methods
        electronics.shopping();  // Calls Electronics' shopping() method
        cloths.shopping();       // Calls Cloths' shopping() method

        // If you want to call purchase() specifically (only in Electronics)
        Electronics e = new Electronics();
        e.purchase();
    }
}
