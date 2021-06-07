package oops_project;
import java.util.*;
public class hamburger {
    private String meat,name;
    private int price;
    protected String breadroll;
    private ArrayList<String> additonal_item = new ArrayList<>();
    static HashMap<String, Integer> map = new HashMap<>();
    hamburger(String breadroll,String meat,int price){
        this.breadroll=breadroll;
        this.meat=meat;
        this.price=price;
    }
    public static void additional_items(){
        
        map.put("lettuce",20);
        map.put("tomato",30);
        map.put("carrot",40);
        map.put("sauce", 50);
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return this.name;
    }
    public void additems(ArrayList<String> additonal){
        for(int i=0;i<additonal.size();i++){
            this.additonal_item.add(additonal.get(i));
        }
    }
    public int get_total_price(){
     System.out.println(this.name+" on a "+this.breadroll+" Base price is "+this.price);
     int temp=this.additonal_item.size();
     if (temp>0){
     System.out.println("Added additonal items are");
     for(int i=0;i<temp;i++){
         int temp_price=hamburger.map.get(this.additonal_item.get(i));
         System.out.println(this.additonal_item.get(i)+" and Its price is "+temp_price);
         this.price+=temp_price;
     }}
    return this.price;
    }
}
