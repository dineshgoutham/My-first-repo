package oops_project;
import java.util.*;
public class delux_burger extends hamburger {
    private int chip_price,drink_price,price;
    delux_burger(String breadroll,String meat,int price,String name){
        super(breadroll,meat,price);
        super.setname(name);
        this.chip_price=120;
        this.drink_price=150;
    }
    public int getprice(){
       return this.price;
    }
    public void additems(ArrayList<String> additonal){
       System.out.println("Additional items are cannot be added");
    }
    public int get_total_price(){
        this.price=super.get_total_price();
   // System.out.println(this.getname()+" on a "+this.breadroll+" Base price is "+this.price);
     System.out.println("Added additonal items are");
     System.out.println("Chips and its price is "+this.chip_price);
     System.out.println("drinks and its price is "+this.drink_price);
     this.price+=this.chip_price+this.drink_price;
     return this.getprice();

    }
    
}
