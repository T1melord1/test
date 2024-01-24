
    public class Robot {
        int x;
        int y;

        public void move(int x, int y) {
            print(this.x, x, "x");
            print(this.y, y, "y");
        }
        public void print(int start, int end, String axisName){
            while(start < end){
                System.out.println("Двигаемся по оси " + axisName + " от " + start + " до " + (++start));
            }
        }
    }

