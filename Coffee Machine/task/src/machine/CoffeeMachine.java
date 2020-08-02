package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int disposableCups = 9;
    public static int money = 550;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean flag=false;
        while (true) {
            String action = scanner.next();
            switch (action) {
                case "buy": {
                    buy();
                    break;
                }
                case "fill": {
                    fill();
                    break;
                }
                case "take": {
                    take();
                    break;
                }
                case "remaining":{
                    remaining();
                    break;
                }
                case "exit":{
                    flag=true;
                    break;
                }
            }
            if (flag==true) break;
        }
    }
    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String typeCoffee = scanner.next();
        switch (typeCoffee){
            case "1":{
                if (water>=250 && beans>=16 && disposableCups>0) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    disposableCups--;
                } else System.out.println("I have enough resources, making you a coffee");
                break;
            }
            case "2":{
                if (water>=350 && beans>=20 && milk>=75 && disposableCups>0) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    disposableCups--;
                } else System.out.println("I have enough resources, making you a coffee");
                break;
            }
            case "3":{
                if (water>=200 && beans>=12 && milk>=100 && disposableCups>0) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    disposableCups--;
                } else System.out.println("I have enough resources, making you a coffee");
                break;
            }
            case "back":
                break;
        }
    }
    public static void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }
    public static void take(){
        System.out.println("I gave you " + money);
        money=0;
    }
    public static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        water+=addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        milk+=addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addBeans = scanner.nextInt();
        beans+=addBeans;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        disposableCups+=addCups;
    }
}
