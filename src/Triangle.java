import java.util.ArrayList;

public class Triangle {
    Point a;
    Point b;
    Point c;
    public Triangle (Point a, Point b, Point c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    static double countPerim(Triangle triangle)
    {
        double a1 = Point.distanceBetweenPoints(triangle.a, triangle.b);
        double a2 = Point.distanceBetweenPoints(triangle.c, triangle.b);
        double a3 = Point.distanceBetweenPoints(triangle.a, triangle.c);
        double p = a1+a2+a3;
        return p;
    }
    static double averagePerim(Triangle triangle1, Triangle triangle2)
    {
        double a1 = Triangle.countPerim(triangle1);
        double a2 = Triangle.countPerim(triangle2);
        double av = (a1+a2) / 2;
        return av;
    }
    static double summaSq(Triangle triangle1, Triangle triangle2) {
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            double a1 = Point.distanceBetweenPoints(triangle1.a, triangle1.b);
            double a2 = Point.distanceBetweenPoints(triangle1.c, triangle1.b);
            double a3 = Point.distanceBetweenPoints(triangle1.a, triangle1.c);
            double p = (a1 + a2 + a3) / 2;
            double sq = Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));
            sum += sq;
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "" + a +
                ", " + b +
                ", " + c +
                '}';
    }
}