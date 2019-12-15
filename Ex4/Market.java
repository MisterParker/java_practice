// A super market has various products for sale. Design an abstract class to have methods like billing, 
// stock availability for a specific product, printSaleReport. Create the subclasses according to category 
// of products like, cosmetics, groceries, kitchenTools, snacks & chocolates. Redefine the methods in abstract 
// class. Apply the dynamic polymorphism concept and override the printSaleReport method of the abstract class.      

abstract class SuperMarket{
    abstract void billing();
    abstract void stock();
    abstract void printSaleReport();
}

class Cosmetics extends SuperMarket{
    int count_c = 25;
    void billing(){ 
        System.out.println("The per-piece price of cosmetics is 100");
        // return 100; 
    }
    void stock(){
        count_c--;
        System.out.println("The current stock is"+count_c);
    }
    void printSaleReport(){
        System.out.println("Products Sold: 1");
        System.out.println("Price: 100");
    }
}

class Groceries extends SuperMarket{
    int count_g = 100;
    void billing(){ 
        System.out.println("The cost of groceries is 500");
        // return 100; 
    }
    void stock(){
        count_g = count_g-5;
        System.out.println("The current stock is"+count_g);
    }
    void printSaleReport(){
        System.out.println("Products Sold: 5");
        System.out.println("Price: 500");
    }
}

class KitchenTools extends SuperMarket{
    int count_k = 40;
    void billing(){ 
        System.out.println("The cost of groceries is 200");
        // return 100; 
    }
    void stock(){
        count_k = count_k--;
        System.out.println("The current stock is"+count_k);
    }
    void printSaleReport(){
        System.out.println("Products Sold: 1");
        System.out.println("Price: 200");
    }
}

class SnacksAndChocolate extends SuperMarket{
    int count_snc = 500;
    void billing(){ 
        System.out.println("The cost of groceries is 20");
        // return 100; 
    }
    void stock(){
        count_snc = count_snc--;
        System.out.println("The current stock is"+count_snc);
    }
    void printSaleReport(){
        System.out.println("Products Sold: 1");
        System.out.println("Price: 20");
    }
}

class Market{
    public static void main(String[] args) {
        SuperMarket c = new Cosmetics();
        SuperMarket g = new Groceries();
        SuperMarket k = new KitchenTools();
        SuperMarket s = new SnacksAndChocolate();

        // Cosmetics
        c.billing();
        c.printSaleReport();
        c.stock();

        // Groceries
        g.billing();
        g.printSaleReport();
        g.stock();

        // Kitchen Tools
        k.billing();
        k.printSaleReport();
        k.stock();

        // Snacks And Choclates
        c.billing();
        c.printSaleReport();
        c.stock();
    }
}