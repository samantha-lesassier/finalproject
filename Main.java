package com.company;
import java.util.Scanner;

public class Main {
    double[] Prices = {0.99, 2.99, 3.99, 120.0, 50.0};
    double grand_total = 0.00;
    String Final_receipt = "\n********CLOSING********\n";
    String all_receipts = "[All Receipts]\n";
    int Red = 0;
    int Coo = 0;
    int Cok = 0;
    int Die = 0;
    int Pep = 0;
    int Fiv = 0;
    int Sun = 0;
    int Pea = 0;
    int Mac = 0;
    int Del = 0;

    String inventory_Sold = "";

    public void run() {
        double user_Total = 0.00;
        String user_receipt = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        user_receipt += name+":\n";
        System.out.println("Please enter the name of the item you would like to purchase,\n" +
                "or enter 'Quit' to stop shopping:");
        System.out.println();
        System.out.println("Available Items:");
        System.out.println("Red-Hot Spicy Doritos   $2.99");
        System.out.println("Cool Ranch Doritos      $2.99");
        System.out.println("Coke                    $0.99");
        System.out.println("Diet Coke               $0.99");
        System.out.println("Pepsi                   $0.99");
        System.out.println("Five hour energy        $3.99");
        System.out.println("Sunflower Seeds         $0.99");
        System.out.println("Peanuts                 $0.99");
        System.out.println("Mac Book Chargers       $120.0");
        System.out.println("Dell Chargers           $50.0");
        System.out.println("Quit");
        System.out.println();
        System.out.print("Your Choice: ");
        String user_item = scan.nextLine();
        if (!(user_item.equals("Quit"))) {
            while (!user_item.equals("Quit")) {
                user_receipt += ("   "+user_item+"\n");
                if ((user_item.substring(0, 3).equals("Red")) || (user_item.substring(0, 3).equals("Coo"))) {
                    user_Total += Prices[1];
                    if (user_item.substring(0, 3).equals("Red")) {
                        Red += 1;
                    } else {
                        Coo += 1;
                    }
                }
                if ((user_item.substring(0, 3).equals("Cok")) || (user_item.substring(0, 3).equals("Die")) || (user_item.substring(0, 3).equals("Pep")) || (user_item.substring(0, 3).equals("Sun")) || (user_item.substring(0, 3).equals("Pea"))) {
                    user_Total += Prices[0];
                    if (user_item.substring(0, 3).equals("Cok")) {
                        Cok += 1;
                    } else if (user_item.substring(0, 3).equals("Die")) {
                        Die += 1;
                    } else if (user_item.substring(0, 3).equals("Pep")) {
                        Pep += 1;
                    } else if (user_item.substring(0, 3).equals("Sun")) {
                        Sun += 1;
                    } else if (user_item.substring(0, 3).equals("Pea")) {
                        Pea += 1;
                    }
                }
                if (user_item.substring(0, 3).equals("Fiv")) {
                    user_Total += Prices[2];
                    Fiv += 1;
                }

                if (user_item.substring(0, 3).equals("Mac")) {
                    user_Total += Prices[3];
                    Mac += 1;
                }
                if (user_item.substring(0, 3).equals("Del")) {
                    user_Total += Prices[4];
                    Del += 1;
                }
                System.out.print("Enter the name of your next item, or 'Quit' if you want to stop: ");
                user_item = scan.nextLine();
            }
            user_Total = Math.round(user_Total * 100.0) / 100.0;
            grand_total += user_Total;
            user_receipt += "   Total: $"+(user_Total);
            user_receipt += "\n\n";
            all_receipts += user_receipt;
            System.out.println("Thank you for shopping "+name+". Here is your receipt:\n");
            System.out.print(user_receipt);
        }
        System.out.println("Is there another costumer? Please enter yes or no: ");
        String question = scan.nextLine();
        while (question.charAt(0) == 'y' || question.charAt(0) == 'Y') {
            double user_Total1 = 0.0;
            System.out.print("Please enter your name: ");
            String name1 = scan.nextLine();
            String user_receipt1 = name1+":\n";
            System.out.println("Please enter the name of the item you would like to purchase,\n" +
                    "or enter 'Quit' to stop shopping:");
            System.out.println();
            System.out.println("Available Items:");
            System.out.println("Red-Hot Spicy Doritos   $2.99");
            System.out.println("Cool Ranch Doritos      $2.99");
            System.out.println("Coke                    $0.99");
            System.out.println("Diet Coke               $0.99");
            System.out.println("Pepsi                   $0.99");
            System.out.println("Five hour energy        $3.99");
            System.out.println("Sunflower Seeds         $0.99");
            System.out.println("Peanuts                 $0.99");
            System.out.println("Mac Book Chargers       $120.0");
            System.out.println("Dell Chargers           $50.0");
            System.out.println("Quit");
            System.out.println();
            System.out.print("Your Choice: ");
            String user_item1 = scan.nextLine();

            if (!(user_item1.equals("Quit"))) {
                while (!user_item1.equals("Quit")) {
                    user_receipt1 += ("   "+user_item1+"\n");
                    if ((user_item1.substring(0, 3).equals("Red")) || (user_item1.substring(0, 3).equals("Coo"))) {
                        user_Total1 += Prices[1];
                        if (user_item.substring(0, 3).equals("Red")) {
                            Red += 1;
                        } else {
                            Coo += 1;
                        }
                    }
                    if ((user_item1.substring(0, 3).equals("Cok")) || (user_item1.substring(0, 3).equals("Die")) || (user_item1.substring(0, 3).equals("Pep")) || (user_item1.substring(0, 3).equals("Sun")) || (user_item1.substring(0, 3).equals("Pea"))) {
                        user_Total1 += Prices[0];
                        if (user_item1.substring(0, 3).equals("Cok")) {
                            Cok += 1;
                        } else if (user_item1.substring(0, 3).equals("Die")) {
                            Die += 1;
                        } else if (user_item1.substring(0, 3).equals("Pep")) {
                            Pep += 1;
                        } else if (user_item1.substring(0, 3).equals("Sun")) {
                            Sun += 1;
                        } else if (user_item1.substring(0, 3).equals("Pea")) {
                            Pea += 1;
                        }
                    }
                    if (user_item1.substring(0, 3).equals("Fiv")) {
                        user_Total1 += Prices[2];
                        Fiv += 1;
                    }
                    if (user_item1.substring(0, 3).equals("Mac")) {
                        user_Total1 += Prices[3];
                        Mac += 1;
                    }
                    if (user_item1.substring(0, 3).equals("Del")) {
                        user_Total1 += Prices[4];
                        Del += 1;
                    }
                    System.out.print("Enter the name of your next item, or 'Quit' if you want to stop: ");
                    user_item1 = scan.nextLine();
                }
                user_Total1 = Math.round(user_Total1 * 100.0) / 100.0;
                grand_total += user_Total1;
                user_receipt1 += "   Total: $"+(user_Total1);
                user_receipt1 += "\n\n";
                all_receipts += user_receipt1;
                System.out.println("Thank you for shopping "+name1+". Here is your receipt:\n");
                System.out.println(user_receipt1);
                System.out.println("Is there another costumer? Please enter yes or no: ");
                question = scan.nextLine();
            }
        }

        inventory_Sold = "[Inventory Sold]\nRed-Hot Spicy Doritos ("+Red+")\n" +
                "Cool Ranch Doritos ("+Coo+")\n" +
                "Coke ("+Cok+")\n" +
                "Diet Coke ("+Die+")\n" +
                "Pepsi ("+Pep+")\n" +
                "Five hour energy ("+Fiv+")\n" +
                "Sunflower Seed ("+Sun+")\n" +
                "Peanuts ("+Pea+")\n" +
                "Mac Book Chargers ("+Mac+")\n" +
                "Dell Chargers ("+Del+")\n";
        Final_receipt += all_receipts;
        Final_receipt += inventory_Sold;
        Final_receipt += "\nGrand Total: $"+grand_total;
        System.out.println(Final_receipt);
    }

    public static void main(String args[]) {
        Main Store = new Main();
        Store.run();
    }
}
