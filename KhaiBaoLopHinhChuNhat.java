
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author NGUYEN VAN CANH
 */
class Rectange {

    private double width;
    private double height;
    private String color;

    //tao hcn co chieu dai=1,chieu rong =1
    public Rectange() {
        width = 1;
        height = 1;
    }

    //tao hcn cos chieu dai,chieu rong xac dinh qua tham so
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //tra ve chieu rong
    public double getWidth() {
        return width;
    }

    //thiet lap chieu rong moi
    public void setWidth(double width) {
        this.width = width;
    }

    //tra ve chieu dai
    public double getHeight() {
        return height;
    }

    //thiet lap chieu dai moi
    public void setHeight(double height) {
        this.height = height;
    }

    // tra ve mau cua hcn
    public String getColor() {
        return color.substring(0, 1).toUpperCase()+color.substring(1).toLowerCase();
    }

    //thiet lap mau moi cho hcn
    public void setColor(String color) {
        this.color = color;
    }

    // tinh va tra ve dien tich hcn
    public double findArea() {
        return width * height;
    }

    //tinh va tra ve chu vi hcn
    public double findPerimeter() {
        return 2 * (width + height);
    }
}

public class KhaiBaoLopHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        Rectange Obj = new Rectange(width, height, color);
        if (width > 0 && height > 0) {
            System.out.println((int) Obj.findPerimeter() + " " + (int) Obj.findArea() + " " + Obj.getColor());
        } else {
            System.out.println("INVALID");
        }
    }
}
