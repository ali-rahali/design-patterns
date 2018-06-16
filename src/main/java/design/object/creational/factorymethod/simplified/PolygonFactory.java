package design.object.creational.factorymethod.simplified;

/**
 * Creator concrete class in terms of factory method design pattern
 */
public class PolygonFactory {

    /**
     * Concrete factory method
     */
    public Polygon getPolygon(int sizeNumber) {
        Polygon polygon = null;
        switch (sizeNumber) {
            case 3:
                polygon = new Triangle();
                break;
            case 4:
                polygon = new Square();
                break;
            case 5:
                polygon = new Multigon();
                break;
        }
        return polygon;
    }
}
