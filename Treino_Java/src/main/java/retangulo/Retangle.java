package retangulo;

public class Retangle {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
    return this.getWidth() * this.getHeight();
    }
    public double perimeter(){
        return this.height * 2 + this.width * 2;
    }
    public double diagonal(){
        double d = Math.pow(this.width, 2) + Math.pow(this.height, 2);
        return Math.sqrt(d);
    }

}
