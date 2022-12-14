package com.gyk.java.oop.basics3;

public class ShapeApplications {
    public static void main(String[] args) {
        Square square0= new Square(10.0,12.0);
        Square square1= new Square(0.5,0.0);
        Square square2= new Square(-1.5,2.0);
        Square square3= new Square(3.0,14.1);



        System.out.println(square0);

        Square[] squares= new Square[4];
        squares[0]=square0;
        squares[1]=square1;
        squares[2]=square2;
        squares[3]=square3;


        for (int i = 0; i < squares.length ; i++) {
            if (squares[i].validator()){
                double area = squares[i].areaCalculator();
                double perimeter = squares[i].perimeterCalculator();
                System.out.println("Square: "+ squares[i] + "Area= "+area +" Perimeter= "+ perimeter);
            }
            else {
               System.out.println("Square not possible" + squares[i]);
            }

        }
    }
}


