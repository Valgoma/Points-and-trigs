import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        example1();
        example2();

    }

    private static void example2() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INPUT.TXT"));;
        ArrayList<Triangle> newtrig = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            Triangle t = new Triangle(p1, p2, p3);
            newtrig.add(t);
        }
        System.out.println("Средняя площадь" + Triangle.summaSq(newtrig.get(0), newtrig.get(1)));
    }

    private static void example1() {
        ArrayList<Triangle> trig = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Triangle t = inputTriangle();
            trig.add(t);
        }
        System.out.println("Средний периметр" + Triangle.averagePerim(trig.get(0),trig.get(1)));
    }


    public static Triangle inputTriangle() {
        System.out.println("Начинайте вводить треугольник");
        Point p1 = inputPoint(1);
        Point p2 = inputPoint(2);
        Point p3 = inputPoint(3);
        System.out.println(Point.distanceBetweenPoints(p1, p2));
        System.out.println(Point.distanceBetweenPoints(p2, p3));
        System.out.println(Point.distanceBetweenPoints(p1, p3));
        Triangle t = new  Triangle(p1, p2, p3);
        System.out.println(Triangle.countPerim(t));
        return t;
    }

       public static Point inputPoint(int i) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите координаты точки");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            return new Point(x1, y1);
        }

}