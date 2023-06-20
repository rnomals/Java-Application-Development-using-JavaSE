public class Circle{
    public static void main(String[] args){
        final float PI = 3.14f;
        int radius = 34;

        float area = PI * (radius * radius);
        float perimeter = 2 * PI * radius;

        System.out.println("Area of the circle is "+area);
        System.out.println("Perimeter of the circle is "+perimeter);
    }
}