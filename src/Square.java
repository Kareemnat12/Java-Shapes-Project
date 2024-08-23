public class Square extends Rectangle{
public Square(int length){
    super(length,length);
}
    public String toString(){
        return "Square:length= " + height;
    }

    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }
    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }



}
