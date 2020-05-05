package day3;

public class GeometricTest {
    public boolean equalsArea (GeometricObject geometricObject1, GeometricObject geometricObject2) {
        return geometricObject1.findArea() == geometricObject2.findArea();
    }

    public double displayGeometricObject(GeometricObject geometricObject) {
        return geometricObject.findArea();
    }
}
