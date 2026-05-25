package io.github.adrianulbona.jts.discretizer.geometry;

import ch.hsr.geohash.GeoHash;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.LineString;
import io.github.adrianulbona.jts.discretizer.GeometryDiscretizer;
import io.github.adrianulbona.jts.discretizer.util.SegmentDiscretizer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;
import java.util.function.BiFunction;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.IntStream.range;

/**
 * Created by adrianulbona on 26/12/2016.
 */
@RequiredArgsConstructor
public class LineStringDiscretizer implements GeometryDiscretizer<LineString> {

    private final BiFunction<LineString, Integer, Set<GeoHash>> segmentDiscretizer;

    @Override
    public Set<GeoHash> apply(@NonNull LineString geometry, @NonNull Integer precision) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
