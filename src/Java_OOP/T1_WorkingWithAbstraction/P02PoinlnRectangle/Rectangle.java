package Java_OOP.T1_WorkingWithAbstraction.P02PoinlnRectangle;

public class Rectangle {

    private Point A;
    private  Point C;

    public Rectangle(Point A,Point C){
        this.A=A;
        this.C=C;
    }
    public boolean contains(Point x){
        return  x.greaterOrEqual(A)&&x.lessOrEqual(C);
    }
}
