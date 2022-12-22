import Ex1.*;
import Ex2.*;

public class Main {
    public static void main (String[] args) {
        Vector2D vector1 = new Vector2D(4, 6);
        Vector2D vector11 = new Vector2D(5,7);
        Vector3D vector2 = new Vector3D(4,6,8);
        Vector3D vector22 = new Vector3D(2,6,10);
        Vector vectorMult = new Vector(4, 5, 5, 6);

        System.out.println(vector1.addition(vector11));
        System.out.println(vector1.difference(vector11));
        System.out.println(vector1.equals(vector11));
        System.out.println(vector1.scalarMultiply(vector11));

        System.out.println(vector2.addition(vector22));
        System.out.println(vector2.difference(vector22));
        System.out.println(vector2.equals(vector22));
        System.out.println(vector2.scalarMultiply(vector22));

        vector1.getINFORMATION();
    }

}
