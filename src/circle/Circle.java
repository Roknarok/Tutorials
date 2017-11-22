package circle;


public class Circle {

    private double radius;
    private String color;

        public Circle() {
            radius = 1.0;
            color = "Red";

        }

        public Circle(double r){
            radius = r;
            color = "Red";


        }

        public double getRadius(){
            return radius;
        }

        public double getArea(){
            return radius*radius*Math.PI;
        }

        public final void speak(){
            System.out.println("eu sunt un cerc");
        }

}




