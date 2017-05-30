package canady_vendingmachine;

import java.util.*;

public class Canady_VendingMachine {

    static ArrayList<Candy>[][] c = new ArrayList[3][3];
    static Scanner s;

    public static void main(String[] args) {
        init();
        input();
    }

    static void init() {
        for (int k = 0; k < c.length; k++) {
            for (int i = 0; i < c[0].length; i++) {
                Random rand = new Random();
                int candies = rand.nextInt(9) + 1;
                c[k][i] = new ArrayList<>();
                for (int j = 0; j < candies; j++) {
                    Candy e = null;
                    if (k == 0) {
                        if (i == 0) {
                            e = new Candy("Hershey's", "Chocolate", 40, 1.50);
                        } else if (i == 1) {
                            e = new Candy("M&Ms", "Chocolate", 50, 1.00);
                        } else {
                            e = new Candy("Reese's", "Chocolate", 55, 1.25);
                        }
                    } else if (k == 1) {
                        if (i == 0) {
                            e = new Candy("Skittles", "Fruity", 60, 1.50);
                        } else if (i == 1) {
                            e = new Candy("Starburst", "Fruity", 50, 1.50);
                        } else {
                            e = new Candy("Jolly Ranchers", "Fruity", 35, 1.00);
                        }
                    } else if (k == 2) {
                        if (i == 0) {
                            e = new Candy("Generic Caramel", "Misc.", 40, 0.75);
                        } else if (i == 1) {
                            e = new Candy("Heath", "Misc.", 45, 1.00);
                        } else {
                            e = new Candy("Bubble Gum", "Misc.", 30, 0.50);
                        }
                    }
                    c[k][i].add(e);
                }
            }
        }
    }

    static void input() {
        boolean play = true;
        int row, col;
        String a;
        while (play) {
            Scanner s = new Scanner(System.in);
            System.out.println("Want to buy something?");
            a = s.nextLine();
            if (!a.contains("y")) {
                System.out.println("Goodbye");
                play = false;
            } else {
                System.out.println("Enter the row (1-3): ");
                int e = s.nextInt();
                if (e > 0 && e < 4) {
                    row = e;
                } else {
                    row = 0;
                }
                System.out.println("Enter the column (1-3): ");
                int x = s.nextInt();
                if (x > 0 && x < 4) {
                    col = x;
                } else {
                    col = 0;
                }
                System.out.println("You bought a:");
                System.out.println(c[row - 1][col - 1].get(0));
            }
        }
    }

}
