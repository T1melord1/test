
public class Robot {
    int x;
    int y;

    public void move(int x, int y) {
        this.x = print(this.x, x, "x");
        this.y = print(this.y, y, "y");
    }

    public int print(int start, int end, String axisName) {
        while (start < end) {
            System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
        }
        return start;
    }
}

