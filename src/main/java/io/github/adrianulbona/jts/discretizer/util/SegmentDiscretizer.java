package io.github.adrianulbona.jts.discretizer.util;

import ch.hsr.geohash.GeoHash;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toSet;

/**
 * Created by adrianulbona on 27/12/2016.
 */
@RequiredArgsConstructor
public class SegmentDiscretizer implements BiFunction<LineString, Integer, Set<GeoHash>> {

    private final BiFunction<Coordinate, Integer, GeoHash> coordinateDiscretizer;

    private final BiFunction<GeoHash, GeometryFactory, Geometry> geoHash2Geometry;

    @Override
    public Set<GeoHash> apply(@NonNull LineString segment, @NonNull Integer precision) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
