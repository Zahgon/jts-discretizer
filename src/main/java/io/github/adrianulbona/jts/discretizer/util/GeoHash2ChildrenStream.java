package io.github.adrianulbona.jts.discretizer.util;

import ch.hsr.geohash.GeoHash;
import lombok.NonNull;
import java.util.function.Function;
import java.util.stream.Stream;
import static ch.hsr.geohash.GeoHash.fromLongValue;
import static java.util.stream.LongStream.range;

/**
 * Created by adrianulbona on 04/01/2017.
 */
public class GeoHash2ChildrenStream implements Function<GeoHash, Stream<GeoHash>> {

    @Override
    public Stream<GeoHash> apply(@NonNull GeoHash geoHash) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
