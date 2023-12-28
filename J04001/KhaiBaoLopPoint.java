/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04001;

import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN CANH
 */
class Point{
    private double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point o){
        double kc=Math.sqrt(Math.pow(this.x-o.x, 2)+Math.pow(this.y-o.y, 2));
        return kc;
    }
    
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
            System.out.println(String.format("%.4f", a.distance(b)));
        }
    }
}
