package org.acme.not.related;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.eclipse.microprofile.config.spi.ConfigSource;

public class ConfigSourceNotToBeUsed implements ConfigSource {

    private final Map<String, String> values = Collections.emptyMap();

    public ConfigSourceNotToBeUsed() {
        throw new IllegalStateException("Should not be used!");
    }

    @Override
    public Map<String, String> getProperties() {
        return values;
    }

    @Override
    public Set<String> getPropertyNames() {
        return values.keySet();
    }

    @Override
    public int getOrdinal() {
        return 0;
    }

    @Override
    public String getValue(String s) {
        return values.get(s);
    }

    @Override
    public String getName() {
        return "should-not-be-used";
    }
}
