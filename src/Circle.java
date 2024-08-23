public  class Circle extends Shape{
    private double radius;
    final double pi = Math.PI;
    public Circle(double r){
        radius=r;
    }
    public double area(){
        return Math.pow(this.radius,2)*pi;
    }

    public  double perimeter(){
        return 2*this.radius*pi;
    }
    public double getRadius(){
        return this.radius;
    }
public void setRadius(double r ){
        if(r>0)
            this.radius=r;
        else
            this.radius=1;

}
public String toString(){
    return "Circle: radius = " + this.radius;
}


}
