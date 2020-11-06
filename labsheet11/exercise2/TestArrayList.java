package labsheet11.exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList{
    public static void main(String[] args) {
        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));

        String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                                            "\n5. Quit\n\nPlease enter your choice");
        int input = Integer.parseInt(inputAsString);

        while(input<1 || input>5){
            input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                    "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
        }

        if(input==1)
            addProduct(allProducts);

        if(input==2)
            amendProduct(allProducts);

        if(input==3)
            removeProduct(allProducts);

        if(input==4)
            viewProducts(allProducts);

        if(input==5){
            JOptionPane.showMessageDialog(null,"Thanks for using the system!");
            System.exit(0);
        }



    }

    public static void addProduct(ArrayList<Product> allProducts){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String name = JOptionPane.showInputDialog("Please enter the product name");
        String desc = JOptionPane.showInputDialog("Please enter the product description");

        allProducts.add(new Product(id,name,desc));

        JOptionPane.showMessageDialog(null,"Product created and added to array list");

        String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                "\n5. Quit\n\nPlease enter your choice");
        int input = Integer.parseInt(inputAsString);

        while(input<1 || input>5){
            input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                    "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
        }

        if(input==1)
            addProduct(allProducts);

        if(input==2)
            amendProduct(allProducts);

        if(input==3)
            removeProduct(allProducts);

        if(input==4)
            viewProducts(allProducts);

        if(input==5){
            JOptionPane.showMessageDialog(null,"Thanks for using the system!");
            System.exit(0);
        }
    }

    public static void amendProduct(ArrayList<Product> allProducts){
        String productName = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");
        String relatedItems="";
        ArrayList<Product> matchedProducts = new ArrayList<Product>();

        for(Product p : allProducts){
            if(p!=null && p.getName().toLowerCase().contains(productName)){
                matchedProducts.add(p);
            }
        }

        for(Product p : matchedProducts){
            if(p!=null){
                relatedItems+=p.toString()+"\n";
            }
        }

        int amend = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n"+relatedItems+"\n\n\n" +
                                                "Enter the id of the one you want to amend"));

        for(Product p : matchedProducts){
            if(p!=null && p.getId()==amend){
                int choice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n"+p.toString()+"\n\n"+
                                        "1.Amend Name\n2.Amend description\n3.Cancel Amendment\n\nPlease enter your choice"));

                while(choice<1 || choice>3){
                    choice=Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n"+p.toString()+"\n\n"+
                            "1.Amend Name\n2.Amend description\n3.Cancel Amendment\n\nInvalid choice entered, must be between 1-3 inclusive!"));
                }

                if(choice==1) {
                    p.setName(JOptionPane.showInputDialog("Please enter the new name for the product"));
                    JOptionPane.showMessageDialog(null,"Product details now amended!");

                    String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                            "\n5. Quit\n\nPlease enter your choice");
                    int input = Integer.parseInt(inputAsString);

                    while(input<1 || input>5){
                        input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
                    }

                    if(input==1)
                        addProduct(allProducts);

                    if(input==2)
                        amendProduct(allProducts);

                    if(input==3)
                        removeProduct(allProducts);

                    if(input==4)
                        viewProducts(allProducts);

                    if(input==5){
                        JOptionPane.showMessageDialog(null,"Thanks for using the system!");
                        System.exit(0);
                    }

                }


                if(choice==2) {
                    p.setDescription(JOptionPane.showInputDialog("Please enter the new description for the product"));
                    JOptionPane.showMessageDialog(null,"Product details now amended!");

                    String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                            "\n5. Quit\n\nPlease enter your choice");
                    int input = Integer.parseInt(inputAsString);

                    while(input<1 || input>5){
                        input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
                    }

                    if(input==1)
                        addProduct(allProducts);

                    if(input==2)
                        amendProduct(allProducts);

                    if(input==3)
                        removeProduct(allProducts);

                    if(input==4)
                        viewProducts(allProducts);

                    if(input==5){
                        JOptionPane.showMessageDialog(null,"Thanks for using the system!");
                        System.exit(0);
                    }
                }

                if(choice==3){
                    String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                            "\n5. Quit\n\nPlease enter your choice");
                    int input = Integer.parseInt(inputAsString);

                    while(input<1 || input>5){
                        input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
                    }

                    if(input==1)
                        addProduct(allProducts);

                    if(input==2)
                        amendProduct(allProducts);

                    if(input==3)
                        removeProduct(allProducts);

                    if(input==4)
                        viewProducts(allProducts);

                    if(input==5){
                        JOptionPane.showMessageDialog(null,"Thanks for using the system!");
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void viewProducts(ArrayList<Product> allProducts){
        String str="";

        for(Product p:allProducts){
            if(p!=null){
                str+=p+"\n";
            }
        }

        JOptionPane.showMessageDialog(null,str,"List of all Products",JOptionPane.INFORMATION_MESSAGE);

        String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                "\n5. Quit\n\nPlease enter your choice");
        int input = Integer.parseInt(inputAsString);

        while(input<1 || input>5){
            input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                    "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
        }

        if(input==1)
            addProduct(allProducts);

        if(input==2)
            amendProduct(allProducts);

        if(input==3)
            removeProduct(allProducts);

        if(input==4)
            viewProducts(allProducts);

        if(input==5){
            JOptionPane.showMessageDialog(null,"Thanks for using the system!");
            System.exit(0);
        }
    }

    public static void removeProduct(ArrayList<Product> allProducts){
        String productName = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");
        String relatedItems="";
        ArrayList<Product> matchedProducts = new ArrayList<Product>();

        for(Product p : allProducts){
            if(p!=null && p.getName().toLowerCase().contains(productName)){
                matchedProducts.add(p);
            }
        }

        for(Product p : matchedProducts){
            if(p!=null){
                relatedItems+=p.toString()+"\n";
            }
        }

        int remove = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n"+relatedItems+"\n\n\n" +
                "Enter the id of the one you want to remove"));

        for(Product p : matchedProducts){
            if(p.getId()==remove){
                int confirmChoice = JOptionPane.showConfirmDialog(null,"The details of the product you wish to remove are:\n\n"+p.toString()+
                                            "\n\nAre you sure you wish to remove this product?");

                if(confirmChoice==JOptionPane.YES_OPTION){
                    allProducts.remove(p);
                    JOptionPane.showMessageDialog(null,"Product now removed from array list!");

                    String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                            "\n5. Quit\n\nPlease enter your choice");
                    int input = Integer.parseInt(inputAsString);

                    while(input<1 || input>5){
                        input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
                    }

                    if(input==1)
                        addProduct(allProducts);

                    if(input==2)
                        amendProduct(allProducts);

                    if(input==3)
                        removeProduct(allProducts);

                    if(input==4)
                        viewProducts(allProducts);

                    if(input==5){
                        JOptionPane.showMessageDialog(null,"Thanks for using the system!");
                        System.exit(0);
                    }
                }

                if(confirmChoice==JOptionPane.NO_OPTION || confirmChoice==JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(null,"Product removal cancelled");

                    String inputAsString = JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                            "\n5. Quit\n\nPlease enter your choice");
                    int input = Integer.parseInt(inputAsString);

                    while(input<1 || input>5){
                        input=Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product\n2. Amend a Product\n3. Remove a Product\n4. View all Products" +
                                "\n5. Quit\n\nInvalid choice entered! Must be between 1-5 inclusive!"));
                    }

                    if(input==1)
                        addProduct(allProducts);

                    if(input==2)
                        amendProduct(allProducts);

                    if(input==3)
                        removeProduct(allProducts);

                    if(input==4)
                        viewProducts(allProducts);

                    if(input==5){
                        JOptionPane.showMessageDialog(null,"Thanks for using the system!");
                        System.exit(0);
                    }

                }

            }
        }


    }
}
