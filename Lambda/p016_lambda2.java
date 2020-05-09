package Lambda;

interface Drawable{
    public void draw();
}

public class p016_lambda2 {
    public static void main(String[] args) {
        int width = 10;
        //Without lambda
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing :"+width);
            }
        };
        d.draw();

        //With Lambda
        Drawable d2=()->{
            System.out.println("Drawing :"+width);
        };
        d2.draw();
    }
}
