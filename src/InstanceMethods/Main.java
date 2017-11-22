package InstanceMethods;

public class Main {

    public static void main(String[] args) {


        Olive[] olives = {new Olive(),new Olive(),new Olive()};

        OlivePress press = new OlivePress();

        press.getOil(olives);


    }
}
