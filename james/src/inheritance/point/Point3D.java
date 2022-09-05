package inheritance.point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(), getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point3D z= "
                + z
                + ",  XYZ :"
                + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(2.5f, 2.3f, 2.9f);
        System.out.println(point3D);
    }
}
