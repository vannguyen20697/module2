package ke_thua.baitap_loppoint;

public class PointTwoD {
    private float x = 0.0f;
    private float y = 0.0f;
    public PointTwoD(){

    }

    public PointTwoD(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] arrayXY = {x,y};
        return arrayXY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "PointTwoD with " +
                "x=" + x +
                ", y=" + y +
                ",and " + getXY();
    }
}
class Main{
    public static void main(String[] args) {
        PointTwoD point2D = new PointTwoD();
        System.out.println(point2D);

        PointTwoD pointTest = new PointTwoD(2,3);
        System.out.println(pointTest);
    }
}
