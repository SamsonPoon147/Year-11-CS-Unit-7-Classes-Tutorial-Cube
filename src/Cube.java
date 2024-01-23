public class Cube {
    private int side;

    public Cube() {
        side = 1;
    }
    public Cube(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            side = i;
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } else {
            this.side = side;
        }
    }

    public int calculateSurfaceArea() {
        return side * side * 6;
    }

    public int calculateVolume() {
        return side * side * side;
    }


    public String toString() {
        return "Cube{side=" + side + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setSide(1);
        int volume = cube.calculateVolume();
        System.out.println(cube.toString());
    }
}

