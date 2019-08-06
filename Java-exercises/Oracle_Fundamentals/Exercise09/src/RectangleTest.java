public class RectangleTest {
  public static void main(String args[]){
    Rectangle r1= new Rectangle();
    System.out.println("Rectangle area: " + r1.getArea());
    r1.draw();

    System.out.println();

    Rectangle r2 = new Rectangle(10, 5);
    System.out.println("Rectangle area: " + r2.getArea());
    r2.draw();
  }
}
