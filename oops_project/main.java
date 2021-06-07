package oops_project;
import java.util.*;
public class main {
    public static void main(String args[]){
        hamburger.additional_items();
        hamburger h1=new hamburger("brown breadroll", "red meat", 80);
        h1.setname("maharaja burger");
        ArrayList<String> additonal_item = new ArrayList<>();
        additonal_item.add("lettuce");
        additonal_item.add("tomato");
        h1.additems(additonal_item);
        System.out.println("Total price is "+h1.get_total_price());
        healthy_burger h2=new healthy_burger("healthymeat", 120, "cabbage burger");
        ArrayList<String> additonal_item1 = new ArrayList<>(additonal_item);
        additonal_item1.add("Cabbage");
        additonal_item1.add("chicken");
        h2.additems(additonal_item1); 
        System.out.println("Total price is "+h2.get_total_price());
        delux_burger h3=new delux_burger("delux_bread", " delux_meat", 150, "Delux_burger");
        h3.additems(additonal_item1);
        System.out.println("Total price is "+h3.get_total_price());
    }  
}
