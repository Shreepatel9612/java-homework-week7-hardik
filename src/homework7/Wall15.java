package homework7;

/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 */
//Field Instance Variable
public class Wall15 {
    private double width;
    private double height;

    // No-arg constructor
    public Wall15() {
        this.width = 0;
        this.height = 0;
    }

    // Constructor with parameters
    public Wall15(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to set the width
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Method to get the height
    public double getHeight() {
        return height;
    }

    // Method to set the height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Method to get the area of the wall
    public double getArea() {
        return this.width * this.height;
    }

    // Main method for testing
    public static void main(String[] args) {
        Wall15 wall = new Wall15(5, 4); // Wall with width 5 and height 4
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5); // Setting height to -1.5, should set to 0
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

