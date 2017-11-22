package ExtendingCustom;

public class Kalamata extends Olive {

    public Kalamata() {
        super(2);
        this.name = "Kalamata";
        this.flavor = "Grassy";
        this.color = 0x000000;

    }
    public int crush(){
        System.out.println("Crush from subclass");
        return super.getOil();
    }


    public String getOrigin(){
        return "Greece";
    }


}
