public class text
{
    public static void main(String[] args)
    {
        Shape rect = new Rectangle(); 
        Shape cir = new Circle();
        Shape tri = new Triangle();
        Shape line = new Line();
        line.fill();
        line.display();
        tri.fill();
        tri.display();
        rect.fill();
        rect.setColor();
        rect.display();
        cir.display();
    }
}
