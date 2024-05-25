package com.example.test.utilities.timing;

import java.sql.Timestamp;
import java.time.Instant;

public class TimingUtils {

    public static Timestamp currentTimestamp() {
        return Timestamp.from(Instant.now());
    }
}
