public class Rectangle extends Shape{
    protected double width;
    protected double height;
    public double area(){
        return width*height;
    }
    public  double perimeter(){
       return  2*height+2*width;
    }
    public Rectangle(double w, double h){
        if(w>0)
            this.width=w;
        else
            this.width=1;
        if(h>0)
            this.height=h;
        else
            this.height=1;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "Rectangle: width= "+ width+", "+ "height= "+height;
    }

}
