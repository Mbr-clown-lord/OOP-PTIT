
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NGUYEN VAN CANH
 */
public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException{
        File Obj=new File("C:\\Users\\NGUYEN VAN CANH\\DATA.in");
        Scanner sc=new Scanner(Obj);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
