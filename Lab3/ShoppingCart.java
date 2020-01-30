package Labwork3.ex4;

public class ShoppingCart {
    String[] itemList;
    String[] newList;

    public ShoppingCart(String[] items) {
        itemList = items;
        this.newList = itemList;
    }

    void addToCart(String item) {
        int len = itemList.length;
        String[] newList = new String[len + 1];
        System.arraycopy(itemList, 0 , newList, 0, len);
        newList[len] = item;
        this.newList = newList;
    }

    void removeFromCart(String item) {
        for (int i = 0; i < itemList.length; i++) {
            if (itemList[i] == item) {
                int len = itemList.length;
                int remainingElements = len - (i + 1);
                String[] newList = new String[len - 1];
                System.arraycopy(itemList,0, newList, 0, i);
                System.arraycopy(itemList, i + 1, newList, i, remainingElements);
                this.newList = newList;
            }
        }
    }

    void checkOut() {
        for (int i = 0; i < newList.length; i++) {
            System.out.print(newList[i] + " ");
        }
        System.out.println();
    }
}
