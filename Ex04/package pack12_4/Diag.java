package L12.Ex04.pack12_4;

public class Diag {
	private int width;
    private int height;
    
    public Diag(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void show(){
        System.out.println("w="+width+", H="+height);
        System.out.printf("length=%5.2f\n",dia());
    }

    public double dia(){
        return Math.sqrt(width*width+height*height);
    }
}