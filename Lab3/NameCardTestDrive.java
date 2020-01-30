package Labwork3.ex2;

public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard card = new NameCard("Polly Morfism", "555-0343", "pm@wickedlysmart");
        System.out.println("Name : " + card.name);
        System.out.println("Phone: " + card.phone);
        System.out.println("eMail: " + card.email);
    }
}
