
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
class Point {
    private double x;
    private double y;
    //tao doi tuong mac dinh
    public Point(){
        x=0;
        y=0;
    }
    // tao doi tuong co toa do trong tham so
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    // tao doi tuong la ban sao cua doi tuong trong tham so
    public Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    //tra ve toa do X
    public double getX(){
        return x;
    }
    //tra ve toa do Y
    public double getY(){
        return y;
    }
    // tra ve khoang cach tu diem nay toi diem thu 2
    double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
    //tra ve khoang cach giua 2 diem
    double distance(Point a,Point b){
        return Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
    }
    // chuyen mot doi tuong ve dang xau ky tu, ghi de phuong thuc toString()
    @Override
    public String toString(){
        return x+" "+y;
    }
}
public class KhaiBaoLopPoint {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            Point a=new Point(x,y);
            x=sc.nextDouble();
            y=sc.nextDouble();
            Point b=new Point(x,y);
            System.out.printf("%.4f\n",a.distance(b));
        }
    }
}