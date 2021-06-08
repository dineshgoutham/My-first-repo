interface playerinterface{
    void losehealth(int health);
    }
interface skills{
    void addmoreweapons(String[] weapons);
}
    class player implements playerinterface{
        private String name;
        private int health;
        protected int level=1;
        private String weapon;
        player(String name,int health,String weapon){
            this.name=name;
            this.health=health;
            this.weapon=weapon;
        }
        player(String name,String weapon){
            this.name=name;
            this.health=100;
            this.weapon=weapon;
        }
        public int gethealth(){
                return this.health;
        }
        public void losehealth(int health){
            this.health-=health;
            if (this.health<=0)
             System.out.println("Player knocked out...");
        }
        public int getlevel(){
            return this.level;
        }
        public void increaselevel(int level){
            if (this.level<level)
            this.level=level;
            else
            System.out.println("Input should be higher than current level");
        }
    }
    class skilledplayer extends player implements skills{
        protected String[] weapons=new String[3];
        skilledplayer(String name,int health,String weapon){
            super(name,health,weapon);
        }
        public void addmoreweapons(String[] weapons){
            if (this.level>=4){
               for(int i=0;i<weapons.length;i++)
                  this.weapons[i]=weapons[i];
            }
            else 
             System.out.println("Required atleast level4");
        }
        public void showskills(){
            for(int i=0;i<weapons.length;i++)
            System.out.println(this.weapons[i]);
        }
        
    }
    
    public class oops {
        public static void main(String args[]){
            skilledplayer sk1=new skilledplayer("Goutham", 100, "sword");
            sk1.losehealth(10);
            String[] weapons ={"gun","pan","granede"};  
            sk1.increaselevel(5);
            System.out.println("Health : "+sk1.gethealth());
            System.out.println("level : "+sk1.getlevel());
            sk1.addmoreweapons(weapons);
            sk1.showskills();
        }
    }