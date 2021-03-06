package com.ofg.infrastructure.correlationid

import groovy.transform.CompileStatic

/**
 * Component that stores correlation id using {@link ThreadLocal}
 */
@CompileStatic
//from: https://github.com/daniel-bryant-uk/correlation-id-sync/
class CorrelationIdHolder {
    public static final String CORRELATION_ID_HEADER = "correlationId"
    private static final ThreadLocal<String> id = new ThreadLocal<String>()

    static void set(String correlationId) {
        id.set(correlationId)
    }

    static String get() {
        return id.get()
    }

    static void remove() {
        id.remove()
    }
}
