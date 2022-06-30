/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ammar
 */
import java.util.*;

public class Asignment {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose your number \n");
        System.out.println("1 for circle  \n");
        System.out.println("2 for square  \n");
        System.out.println("3 for rectangle  \n");
        System.out.println("4 for rhombus  \n");
        System.out.println("5 for triangle  \n");
        int choice = sc.nextInt();
        if (choice == 1) {
            //////////////////////////////////////////////////////////////////
            System.out.println("please enter your desired  radius of the first circle  \n");
            int a = sc.nextInt();
            circle c1;
            c1 = new circle();
            c1.radius = a;
            double x = c1.getarea();
            double xp = c1.getprtimeter();
            System.out.println("area =" + x);
            System.out.println("your perimter = " + xp);
            //////////////////////////////////
            System.out.println("please enter your desired  radius  of the second circle \n");
            int a1 = sc.nextInt();
            circle c11;
            c11 = new circle();
            c11.radius = a1;
            double xa = c11.getarea();
            double xp1 = c11.getprtimeter();
            System.out.println("area =" + xa);
            System.out.println("your perimter = " + xp1);
            //////////////////////////////////////////////////////////////////
            System.out.println("\n");
            //////////////////////////////////////////////////////////////////
        } else {
            if (choice == 2) {

                System.out.println("please enter your desired  side lenght  of the first square  \n");
                int b = sc.nextInt();
                square s1;
                s1 = new square();
                s1.l = b;
                double x1 = s1.getperimeter();
                double y1 = s1.getarea();
                System.out.println("perimeter of ur suqare is = " + x1);
                System.out.println("your area is = " + y1);
                //////////////////////////////////////////////////////////
                System.out.println("please enter your desired  side lenght  of the second square  \n");
                int b1 = sc.nextInt();
                square s11;
                s11 = new square();
                s11.l = b1;
                double x11 = s11.getperimeter();
                double y11 = s11.getarea();
                System.out.println("perimeter of ur suqare is = " + x11);
                System.out.println("your area is = " + y11);
                //////////////////////////////////////////////////////////////////
                System.out.println("\n");
                //////////////////////////////////////////////////////////////////
            } else {
                if (choice == 3) {
                    System.out.println("please enter your desired side lenght of the  first rectangle \n ");
                    int c = sc.nextInt();
                    System.out.println("please enter youir desired width of the  first rectangle \n ");
                    int d = sc.nextInt();
                    rectangle r1;
                    r1 = new rectangle();
                    r1.length = c;
                    r1.width = d;
                    double x2 = r1.getperimeter();
                    double y2 = r1.getarea();
                    System.out.println("your rectangle preimeter is = " + x2);
                    System.out.println("your rectangle area is = " + y2);
                    ////////////////////////////////////////////////////////
                    System.out.println("please enter your desired side lenght of the second rectangle \n ");
                    int c1 = sc.nextInt();
                    System.out.println("please enter youir desired width of the second  rectangle \n ");
                    int d1 = sc.nextInt();
                    rectangle r11;
                    r11 = new rectangle();
                    r11.length = c1;
                    r11.width = d1;
                    double x21 = r11.getperimeter();
                    double y21 = r11.getarea();
                    System.out.println("your rectangle preimeter is = " + x21);
                    System.out.println("your rectangle area is = " + y21);
                    //////////////////////////////////////////////////////////////////
                    System.out.println("\n");
                    //////////////////////////////////////////////////////////////////
                } else {
                    if (choice == 4) {
                        System.out.println("please enter your desired diagonal 1  of the  first rhombus \n ");
                        int diag1 = sc.nextInt();
                        System.out.println("please enter your desired diagonal 2  of the first  rhombus \n ");
                        int diag2 = sc.nextInt();
                        System.out.println("please enter your desired side lenght of the  first rhombus \n ");
                        int side_lenght = sc.nextInt();
                        rhombus rhombus1;
                        rhombus1 = new rhombus();
                        rhombus1.d1 = diag1;
                        rhombus1.d2 = diag2;
                        rhombus1.l = side_lenght;
                        double x3 = rhombus1.getperimeter();
                        double y3 = rhombus1.getarea();
                        System.out.println("your rhombus's perimeter is = " + x3);
                        System.out.println("your rhombus's area is = " + y3);
                        /////////////////////////////////////////////////////////////
                        System.out.println("please enter your desired diagonal 1  of the  second rhombus \n ");
                        int diag11 = sc.nextInt();
                        System.out.println("please enter your desired diagonal 2  of the  second rhombus \n ");
                        int diag21 = sc.nextInt();
                        System.out.println("please enter your desired side lenght of the second  rhombus \n ");
                        int side_lenght1 = sc.nextInt();
                        rhombus rhombus11;
                        rhombus11 = new rhombus();
                        rhombus11.d1 = diag11;
                        rhombus11.d2 = diag21;
                        rhombus11.l = side_lenght1;
                        double x31 = rhombus11.getperimeter();
                        double y31 = rhombus11.getarea();
                        System.out.println("your rhombus's perimeter is = " + x31);
                        System.out.println("your rhombus's area is = " + y31);
                        //////////////////////////////////////////////////////////////////
                        System.out.println("\n");
                        //////////////////////////////////////////////////////////////////
                    } else {
                        if (choice == 5) {

                            System.out.println("please enter the first traingle  1st side \n");
                            int side1 = sc.nextInt();
                            System.out.println("please enter he first traingle  2nd side  \n");
                            int side2 = sc.nextInt();
                            System.out.println("please enter he first traingle  3rd side  \n");
                            int side3 = sc.nextInt();
                            System.out.println("please enter he first traingle  height  \n");
                            int height = sc.nextInt();
                            System.out.println("please enter yhe first traingle  base \n");
                            int base = sc.nextInt();
                            traingle t1;
                            t1 = new traingle();
                            t1.side1 = side1;
                            t1.side2 = side2;
                            t1.side3 = side3;
                            t1.base = base;
                            t1.height = height;
                            double x4 = t1.getperimeter();
                            double y4 = t1.getarea();
                            System.out.println("your traingle's perimeter is = " + x4);
                            System.out.println("your traingle's area is = " + y4);
                            ///////////////////////////////////////////////////////////////
                            System.out.println("please enter the second traingle  1st side \n");
                            int side11 = sc.nextInt();
                            System.out.println("please enter the second traingle side  \n");
                            int side21 = sc.nextInt();
                            System.out.println("please enter the second traingle side  \n");
                            int side31 = sc.nextInt();
                            System.out.println("please enter the second traingle height  \n");
                            int height1 = sc.nextInt();
                            System.out.println("please enter the second traingle1 base \n");
                            int base1 = sc.nextInt();
                            traingle t11;
                            t11 = new traingle();
                            t11.side1 = side11;
                            t11.side2 = side21;
                            t11.side3 = side31;
                            t11.base = base1;
                            t11.height = height1;
                            double x41 = t11.getperimeter();
                            double y41 = t11.getarea();
                            System.out.println("your traingle's perimeter is = " + x41);
                            System.out.println("your traingle's area is = " + y41);
                            //////////////////////////////////////////////////////////////////
                            System.out.println("\n");
                            //////////////////////////////////////////////////////////////////
                        }
                    }
                }
            }
        }

    }

}

class circle {
    double radius;

    double getarea() {
        return (radius * radius) * 3.14;
    }

    double getprtimeter() {
        return (radius * 2 * 3.14);
    }
}

class square {
    double l;

    double getperimeter() {
        return l * 4;
    }

    double getarea() {
        return l * l;
    }
}

class rectangle {
    double length;
    double width;

    double getperimeter() {
        return ((length + width) * 2);
    }

    double getarea() {
        return (length * width);
    }
}

class rhombus {
    double d1;
    double d2;
    double l;

    double getperimeter() {
        return (l * 4);
    }

    double getarea() {
        return (((d1 * d2)) / 2);
    }
}

class traingle {
    double side1;
    double side2;
    double side3;
    double base;
    double height;

    double getperimeter() {
        return side1 + side2 + side3;

    }

    double getarea() {
        return (base * height) / 2;
    }

}
