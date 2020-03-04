public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;;
        return area;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;

    }

    public String isSquare(){
        if(length == width){
            return "this is a square";
        }
        return "this isn't a square";
    }

    public String printrecInfo(){
        return
                "this Rectangle has" +
                        this.getLength()+ "in length,  " +
                        this.getWidth()+ "in width,  " +
                        this.getArea()+ "in area, "+
                        this.getDiagonal() + "in diagonal, " +
                        this.isSquare() ;
    }
}