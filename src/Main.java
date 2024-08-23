public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        System.out.println(c);
        c.setRadius(6);
       System.out.println(c);

       System.out.println(c.area());
      System.out.println(c.perimeter());
       System.out.println(c.getRadius());
       c.toString();
       Square s = new Square(12);
       System.out.println(s);
Rectangle r = new Rectangle(12,3);
       System.out.println(r);
       r.setHeight(33);
        r.setWidth(10);
       System.out.println(r);
        System.out.println(r.perimeter());
       System.out.println(r.area());
       s.setHeight(666);
      System.out.println(s);
      s.setWidth(66);
        System.out.println(s);



    }
}