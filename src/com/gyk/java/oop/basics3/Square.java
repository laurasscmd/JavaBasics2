package com.gyk.java.oop.basics3;

public class Square {
    Double length;
    Double width;

    public Square(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public boolean validator() {
        if (length > 0 && width > 0) {
            return true;
        } else {
            return false;
        }
    }
   public double areaCalculator(){
            double area;
            area=this.length*this.width;
            return area;
        }
   public double perimeterCalculator(){
        double perimeter;
        perimeter=(this.width*2)+(this.length*2);
        return perimeter;
   }

}


