package Ex1;

public class Vector3D {
    private double x;
    private double y;

    private double z;
    private double length;

    private final String INFORMATION = "Vector in 3D-coordinate system";

    public Vector3D(double a, double b, double z) {
        this.x = a;
        this.y = b;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply (Vector3D vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public Vector3D addition (Vector3D vector) {
        x += vector.getX();
        y += vector.getY();
        z += vector.getZ();
        return this;
    }

    public Vector3D difference (Vector3D vector) {
        x -= vector.getX();
        y -= vector.getY();
        z -= vector.getZ();
        return this;
    }

    public static Vector3D[] getRandomVectors (int number) {
        Vector3D[] randomVector = new Vector3D[number];
        int randomX;
        int randomY;
        int randomZ;

        for (int i = 0; i < number; i++) {
            randomX = (int) (Math.random() * 10);
            randomY = (int) (Math.random() * 10);
            randomZ = (int) (Math.random() * 10);
            randomVector[i] = new Vector3D(randomX, randomY, randomZ);
        }
        return randomVector;
    }

    public boolean equals (Vector3D vector) {
        return x == vector.getX() && y == vector.getY() && z == vector.getZ();
    }

    public void getINFORMATION() {
        System.out.println(this);;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + length +
                ", INFORMATION='" + INFORMATION + '\'' +
                '}';
    }
}
