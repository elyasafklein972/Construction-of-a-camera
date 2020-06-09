package elements;

import primitives.*;

import java.util.List;

/**
 * Interface for common actions of light sources
 *
 * @author Dan Zilberstein
 */
public interface LightSource  {
    /**
     * Get light source intensity as it reaches a point I<sub>P</sub>
     *
     * @param p the lighted point
     * @return intensity I<sub>P</sub>
     */
    Color getIntensity(Point3D p);
    double getRadius();
    /**
     * Get normalized vector in the direction from light source
     * towards the lighted point
     *
     * @param p the lighted point
     * @return light to point vector
     */
    Point3D getPosition();
    Vector getL(Point3D p);
    List<Vector> getLs (Point3D p);
    /**
     * @param point from geopoint
     * @return distance from light source
     */
    double getDistance(Point3D point);
}