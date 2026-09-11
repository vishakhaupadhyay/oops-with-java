
class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("area is: " + l * b);
    }
}
class  Main{
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(10,20);
        rec.area();
    }
}
