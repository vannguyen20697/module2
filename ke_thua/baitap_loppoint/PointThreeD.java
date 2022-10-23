package ke_thua.baitap_loppoint;

public class PointThreeD extends PointTwoD {
    private float z = 0.0f;

    public PointThreeD() {
    }

    public PointThreeD(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = {super.getX(), super.getY(), z};
        return arrayXYZ;
    }

    public void setXYZ(float x, float y) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "PointThreeD with " +
                "x= " + super.getX() +
                ", y= " + super.getY() +
                ", z= " + z +
                " and " + getXYZ();
    }
}

class MainTest {
    public static void main(String[] args) {
        PointTwoD point3D = new PointThreeD();
        System.out.println(point3D);

        PointThreeD point3Test = new PointThreeD(2, 4, 5);
        System.out.println(point3Test);

    }
}
