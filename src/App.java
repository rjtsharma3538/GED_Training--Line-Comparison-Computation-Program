import java.util.*;

class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double get_x() {
        return this.x;
    }

    public double get_y() {
        return this.y;
    }

}

class Line {

    private Point begin;
    private Point end;

    Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    double getLength() {

        double dx = begin.get_x() - end.get_x();
        double dy = begin.get_y() - end.get_y();

        double length = Math.sqrt(dx * dx + dy * dy);

        return length;
    }


}

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Line comparison computation program");

        Scanner sc = new Scanner(System.in);

        double x1, x2, y1, y2;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        Point p1 = new Point(x1, x2);
        Point p2 = new Point(x2, y2);

        Line L1 = new Line(p1, p2);

        String len_1 = String.valueOf(L1.getLength());

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        p1 = new Point(x1, x2);
        p2 = new Point(x2, y2);

        Line L2 = new Line(p1, p2);

        String len_2 = String.valueOf(L2.getLength());

        if(len_1.equals(len_2))
            System.out.println("Lines are equal and their length is " + len_1);
        else 
            System.out.println("Lines are not equal");

        
    }
}
