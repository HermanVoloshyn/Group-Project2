package GroupProject2;

public class ShapeTester {
        public static void main(String[] args) {
            Circle c = new Circle();
            double ar = c.calculateArea(10);
            double pr = c.calculatePerimeter(10);
            System.out.println("The Area of the Circle is : "+ ar);
            System.out.println("The circumference of the circle is : "+ pr);

            Square sq= new Square();
            double sar= sq.calculateArea(20);
            double spr=sq.calculatePerimeter(20);
            System.out.println("The Area of a Square is : "+sar);
            System.out.println("The perimeter of a square is : "+spr);
        }
        }
