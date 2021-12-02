import org.junit.Test;

import java.awt.Point;
public class TestGeom {
    @Test
    public void testDist(){
        var p1 = new Point (0,3);
        var p2 = new Point (4,0);
        assert BasicGeom.caleDistance(p1,p2) == 5;
        assert true;
    }

    @Test
    public void testZeroDist(){
        Point p1 = new Point (23, 546);
        Point p2 = new Point (23, 546);
        assert BasicGeom.caleDistance(p1,p2) ==0;
    }
}

