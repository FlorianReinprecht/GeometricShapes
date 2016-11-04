package fh.java.geometry;

import com.sun.org.apache.xpath.internal.SourceTree;
import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) { //psvm

        Main main = new Main();
        main.doIt();
        main.fillList(null);


    }

    private void doIt() {
        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle) {
                circleList.add((Circle)shape);
            }
        }

        System.out.println("----------circles---------------");
        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }


    public void fillList(List<GeometricShape> shapeList) {
		shapeList.add(new Circle(1,2,3.0)); //Strg + D Dupliziert
		shapeList.add(new Circle(2,5,6.0));
		shapeList.add(new Circle(2,5,1.0));
		shapeList.add(new Circle(3,2,6.0));
		shapeList.add(new RightTriangle(3,2,6,9));
		shapeList.add(new RightTriangle(5,3,1,2));
		shapeList.add(new RightTriangle(3,2,1,5));
        shapeList.add(new Rectangle(1,2,5,6));
        shapeList.add(new Rectangle(3,3,3,4));
        shapeList.add(new Rectangle(1,5,2,12));

    }


    public void printList(List<GeometricShape> shapeList) {
        System.out.println("----------for loop--------"); //fori
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));
        }

        System.out.println("------for each----------"); //iter
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }
        System.out.println("------forEACH----------");
        shapeList.stream().forEach(shape-> System.out.println(shape));
        System.out.println("-----EEEACH----------");
        shapeList.stream().forEach(System.out::println);
    }

}
