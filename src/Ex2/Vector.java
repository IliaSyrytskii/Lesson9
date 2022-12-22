package Ex2;

import java.util.Arrays;

public class Vector {
    private double[] coords;
    private double length;

    private final String INFORMATION = "Vector in multidimensional system";

    public Vector(double... coords) {
        this.coords = coords;
        setLength();
    }

    private void setLength() {
        double sum = 0;
        for (double coord : coords) {
            sum += Math.pow(coord, 2);
        }
        length = Math.sqrt(sum);
    }

    public double[] getCoords() {
        return coords;
    }

    public double getLength() {
        return length;
    }

    public double scalarMultiply(Vector vector) {
        double result = 0;
        for (int i = 0; i < coords.length; i++) {
            result += coords[i] * vector.getCoords()[i];
        }
        return result;
    }

    public Vector addition(Vector vector) {
        for (int t = 0; t < coords.length; t++) {
            coords[t] += vector.getCoords()[t];
        }
        return this;
    }

    public Vector difference (Vector vector) {
        for (int t = 0; t < coords.length; t++) {
            coords[t] -= vector.getCoords()[t];
        }
        return  this;
    }

    public static Vector[] getRandomVectors (int number) {
        Vector[] randomVector = new Vector[number];
        int randomCoordsNumber;
        double[] randomCoords;

        for (int t = 0; t < number; t++) {
            randomCoordsNumber = (int) (Math.random() * 10);
            randomCoords = new double[randomCoordsNumber];
            for (int i = 0; i < randomCoordsNumber; i++) {
                randomCoords[i] = (int) (Math.random() * 10);
            }
            randomVector[t] = new Vector(randomCoords);
        }
        return randomVector;
    }
    public boolean equals (Vector vector) {
        double[] vectorCoord = vector.getCoords();
        if (coords.length != vectorCoord.length) {
            return false;
        }
        for (int t = 0; t < coords.length; t++) {
            if (coords[t] != vectorCoord[t]) {
                return false;
            }
        }
        return true;
    }

    public void getInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coords=" + Arrays.toString(coords) +
                ", length=" + length +
                ", INFORMATION='" + INFORMATION + '\'' +
                '}';
    }
}
