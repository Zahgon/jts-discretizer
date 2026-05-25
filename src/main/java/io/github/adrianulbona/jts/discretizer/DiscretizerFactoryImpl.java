package io.github.adrianulbona.jts.discretizer;

import ch.hsr.geohash.GeoHash;
import ch.hsr.geohash.WGS84Point;
import com.vividsolutions.jts.geom.*;
import io.github.adrianulbona.jts.discretizer.geometry.GeometryCollectionDiscretizer;
import io.github.adrianulbona.jts.discretizer.geometry.LineStringDiscretizer;
import io.github.adrianulbona.jts.discretizer.geometry.PointDiscretizer;
import io.github.adrianulbona.jts.discretizer.geometry.PolygonDiscretizer;
import io.github.adrianulbona.jts.discretizer.util.*;
import lombok.NonNull;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by adrianulbona on 30/12/2016.
 */
public class DiscretizerFactoryImpl implements DiscretizerFactory {

    @Override
    public <T extends Geometry> GeometryDiscretizer<T> discretizer(@NonNull T geometry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public GeometryDiscretizer<GeometryCollection> geometryCollectionDiscretizer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public GeometryDiscretizer<LineString> lineStringDiscretizer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public GeometryDiscretizer<Polygon> polygonDiscretizer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public GeometryDiscretizer<Point> pointDiscretizer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private BiFunction<LineString, Integer, Set<GeoHash>> segmentDiscretizer() {
        return new SegmentDiscretizer(coordinateDiscretizer(), geoHash2Geometry());
    }

    private Function<GeoHash, Stream<GeoHash>> geoHash2ChildrenStream() {
        return new GeoHash2ChildrenStream();
    }

    private BiFunction<GeoHash, GeometryFactory, Geometry> geoHash2Geometry() {
        return new GeoHash2Geometry(wgs84Point2Coordinate());
    }

    private BiFunction<Coordinate, Integer, GeoHash> coordinateDiscretizer() {
        return new CoordinateDiscretizer(coordinate2WGS84Point());
    }

    private Function<WGS84Point, Coordinate> wgs84Point2Coordinate() {
        return new WGS84Point2Coordinate();
    }

    private Function<Coordinate, WGS84Point> coordinate2WGS84Point() {
        return new Coordinate2WGS84Point();
    }
}
