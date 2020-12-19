package com.mycompany;

/**
 * This class provides methods to work with triangles
 *
 * @author Mikhail Kurakin
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    private enum TriangleTypes {
        ISOSCELES("Isosceles"),
        SCALENE("Scalene");
        private String type;

        TriangleTypes(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MytTriangle[" +
                "v1=" + v1.toString() +
                "v2=" + v2.toString() +
                "v3=" + v3.toString() + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double edge1 = v1.distance(v2);
        double edge2 = v1.distance(v3);
        double edge3 = v2.distance(v3);
        boolean edge1Eq2 = Double.compare(edge1, edge2) == 0;
        boolean edge1Eq3 = Double.compare(edge1, edge3) == 0;
        boolean edge2Eq3 = Double.compare(edge2, edge3) == 0;

        if ((edge1Eq2 && edge1Eq3) || (edge1Eq2 && edge2Eq3)
                || (edge1Eq3 && edge2Eq3)) {
            return TriangleTypes.ISOSCELES.getType();
        }
        return TriangleTypes.SCALENE.getType();
    }
}
