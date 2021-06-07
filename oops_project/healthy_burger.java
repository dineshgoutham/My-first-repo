package oops_project;

import java.util.ArrayList;

public class healthy_burger extends hamburger {
    private String additonal1,additonal2;
    private int price1=80,price2=40,price;
    healthy_burger(String meat,int price,String name){
        super("brown rye",meat,price);
        super.setname(name);
    }
    public void additems(ArrayList<String> additonal){
     int temp=additonal.size()-2;
     this.additonal1=additonal.get(temp);
     this.additonal2=additonal.get(temp+1);
     additonal.remove(temp);
     additonal.remove(temp);
     super.additems(additonal);
    }
    public int getprice(){
        return this.price;
    }
    public int get_total_price(){
        this.price=super.get_total_price();
        System.out.println(this.additonal1+" and Its price is "+this.price1);
        System.out.println(this.additonal2+" and Its price is "+this.price2);
        this.price+=this.price1+this.price2;
        return this.getprice();
    }
}
