import java.util.Scanner;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    static double distanceBetweenPoints(Point a, Point b)
    {
        double d = Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    return d;
    }

}
