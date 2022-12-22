package Ex1;

public class Vector2D {

    private double x;
    private double y;
    private double length;

    private final String INFORMATION = "Vector in 2D-coordinate system";

    public Vector2D(double a, double b) {
        this.x = a;
        this.y = b;
        setLength();
    }

    private void setLength() {
        length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply (Vector2D vector) {
        return x * vector.getX() + y * vector.getY();
    }

    public Vector2D addition (Vector2D vector) {
        x += vector.getX();
        y += vector.getY();
        return this;
    }

    public Vector2D difference (Vector2D vector) {
        x -= vector.getX();
        y -= vector.getY();
        return this;
    }

    public static Vector2D[] getRandomVectors (int number) {
        Vector2D[] randomVector = new Vector2D[number];
        int randomX;
        int randomY;

        for (int i = 0; i < number; i++) {
            randomX = (int) (Math.random() * 10);
            randomY = (int) (Math.random() * 10);
            randomVector[i] = new Vector2D(randomX, randomY);
        }
        return randomVector;
    }

    public boolean equals (Vector2D vector) {
        return x == vector.getX() && y == vector.getY();
    }

    public void getINFORMATION() {
        System.out.println(this);;
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                ", length=" + length +
                ", INFORMATION='" + INFORMATION + '\'' +
                '}';
    }
}
