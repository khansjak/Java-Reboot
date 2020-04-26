class Shape{
    public final void draw(){
        System.out.println("Draw method in shape class");
    }
}

final class Shape1{
    public final void draw(){
        System.out.println("Draw method in shape class");
    }
}


class Rectangle extends Shape{
//Allowed
}

//class Rectangle extends Shape1{
//Not Allowed
//}

public class p014_final {
    final int count=100;
    public void setCount(){
        System.out.println(this.count);
    }
    public static void main(String[] args) {
        p014_final p = new p014_final();
        p.setCount();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}


/*
1. This is not initialized at the time of
2. Static blank final variable :
    - is a static variable which is not initialized at the time of declaration, so it needs to initialized in static block.
3. You cannot override final methods in subclass.
4. You can call parent class in main.
 */