package Olive3;

public class Liguria extends Olive {


    Liguria() {
        this.oil = 4;
        this.expirency = 2;
        this.taste = "Grassy";
    }


    public void fridgeOut() {

        if (expirency < 1) {

            this.setEatable(" Non-comestible");
            System.out.println("The expire date for the Olive has been surpassed" + " and it is " + this.getEatable());



        } else {
            this.expirency --;
        }
    }
}

