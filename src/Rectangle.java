public class Rectangle {
    int x;
    int y;
   /* int x = 5;
    int y = 10;*/

    public Rectangle() {

    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int returnArea() {
        return x * y;
    }
    @Override
    public String toString() {
        return "Мой прямоугольник: " + x + ", " + y;
    }
}
