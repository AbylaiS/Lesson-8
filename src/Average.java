public class Average {
    int a;
    int b;
    int c;
    public int findTheSecondNumber() {
        if (a > b && a < c) {
            return a;
        } else if (b > a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
