package figure.quadrilateral;

import figure.Figure;

public class quadrilateral extends Figure {
    public quadrilateral(int x, int x1) {
        super(x, x1);
    }

    @Override
    public String toString() {
        return "четырехугольник с одной из координат" + getX() + ", " + getX1();
    }
}

class parallelogram extends quadrilateral{
    private double str1;
    private double str2;
    private double angle;

    public parallelogram(int x, int x1, double str1, double str2, double angle) {
        super(x, x1);
        this.str1 = str1;
        this.str2 = str2;
        this.angle = angle;
    }

    public double getStr1() {
        return str1;
    }

    public void setStr1(double str1) {
        this.str1 = str1;
    }

    public double getStr2() {
        return str2;
    }

    public void setStr2(double str2) {
        this.str2 = str2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "параллелограмм с одной из координат" + getX() + ", " + getX1() + " и сторонами" + getStr1() + " " + getStr2() + " " + getStr1() + " " + getStr2() + " с одним из углов = " + getAngle();
    }

}
class rectangle extends quadrilateral{
    private double str1;
    private double str2;

    public rectangle(int x, int x1, double str1, double str2) {
        super(x, x1);
        this.str1 = str1;
        this.str2 = str2;
    }

    public double getStr1() {
        return str1;
    }

    public void setStr1(double str1) {
        this.str1 = str1;
    }

    public double getStr2() {
        return str2;
    }

    public void setStr2(double str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "прямоугольник с одной из координат" + getX() + ", " + getX1() + " и сторонами" + getStr1() + " " + getStr2() + " " + getStr1() + " " + getStr2();
    }
}
class square extends quadrilateral{
    private double str;

    public square(int x, int x1, double str) {
        super(x, x1);
        this.str = str;
    }

    public double getStr() {
        return str;
    }

    public void setStr(double str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "квадрат с одной из координат" + getX() + ", " + getX1() + " и сторонами" + getStr() + " " + getStr() + " " + getStr() + " " + getStr();
    }
}
class rhombus extends quadrilateral {
    private double diag1;
    private double diag2;

    public rhombus(int x, int x1, double diag1, double diag2) {
        super(x, x1);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double getDiag1() {
        return diag1;
    }

    public void setDiag1(double diag1) {
        this.diag1 = diag1;
    }

    public double getDiag2() {
        return diag2;
    }

    public void setDiag2(double diag2) {
        this.diag2 = diag2;
    }

    @Override
    public String toString() {
        return "ромб с одной из координат" + getX() + ", " + getX1() + " и диагоналями" + getDiag1() + " " + getDiag2();
    }
}
class trapezoid extends quadrilateral{
    private double s1;
    private double s2;
    private double s3;
    private double s4;

    public double getS1() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public double getS4() {
        return s4;
    }

    public void setS4(double s4) {
        this.s4 = s4;
    }

    public trapezoid(int x, int x1, double s1, double s2, double s3, double s4) {

        super(x, x1);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    public String toString() {
        return "трапеция с одной из координат" + getX() + ", " + getX1() + " и сторонами" + getS1() + " " + getS2() + " " + getS3() + " " + getS4();
    }

}
