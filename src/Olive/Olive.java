package Olive;

public class Olive {


    public String name = "Kalamata";
    public String flavor = "Grassy";
    public long color = 0x000000;
    public int oil = 3;



    public int crush() {

        return oil;

    }
    public String name(){
        return name;
    }

    public Olive() {

        System.out.println("Constructor of " + this.name);

    }

    public Olive(int oil) {

        this.oil = oil;
    }

    public Olive(int i, String s){
        this.oil = i;
        this.name = s;
    }


}
