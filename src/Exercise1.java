//group8

class Rectangle {

    // The width and height of the rectangle.
    float width;
    float height;

    // Constructs a new rectangle with the given width and height.
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    // Returns the area of the rectangle.
    float getArea() {
        return (width * height);
    }

    // Returns the perimeter of the rectangle.
    float getPerimeter() {
        return 2 * (width + height);
    }
}

public class Exercise1 {

    public static void main(String[] args) {

        // Create two rectangles.
        Rectangle rect = new Rectangle(4f, 40f);
        Rectangle rect2 = new Rectangle(3.5f, 35.7f);

        // Print the width, height, area, and perimeter of each rectangle.
        System.out.println("===================================");
        System.out.println("width: " + rect.width + " hight: " + rect.height);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());
        System.out.println("===================================");
        System.out.println("width: " + rect2.width + " hight: " + rect2.height);
        System.out.println("Area = " + rect2.getArea());
        System.out.println("Perimeter = " + rect2.getPerimeter());
        System.out.println("===================================");
    }
}
