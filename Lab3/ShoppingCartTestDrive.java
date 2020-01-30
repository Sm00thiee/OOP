package Labwork3.ex4;

public class ShoppingCartTestDrive {
    public static void main(String[] args) {
        String[] itemList = {"1", "2", "3", "4"};
        ShoppingCart cart = new ShoppingCart(itemList);

        cart.addToCart("5");
        System.out.print("Add item to cart, now in the cart you have: ");
        cart.checkOut();

        cart.removeFromCart("3");
        System.out.print("Remove item from cart, now in the cart you have: ");
        cart.checkOut();
    }
}
