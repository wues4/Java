public class Rectangle {
    private int width=25, height=10;

    public Rectangle(){
        System.out.println("Default rectangle created, width:" + width + " height:" +  height);
    }

    public Rectangle(int w, int h){
        if (w > 0 && w < 31 && h > 0 && h < 31){
            this.width = w;
            this.height = h;
            System.out.println("Rectangle created with width:" + w + " height:" + h);

        } else {
            System.out.println("Invalid width and/or height parameter. Input values from 1 to 30");
        }
    }

    public int getArea(){
        return width*height;
    }

    public void draw(){
        for (int row=0; row<height; row++) {
            for (int col=0; col<width; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
