package com.csy.web.web.config;


import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.standard.StandardDialect;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RiskDialect extends AbstractProcessorDialect {

    private static final String PREFIX = "risk";
    private static final String ELEMENT_NAME = "sanstitv";

    protected RiskDialect() {
        super(PREFIX, ELEMENT_NAME, StandardDialect.PROCESSOR_PRECEDENCE);
    }

    @Override
    public Set<IProcessor> getProcessors(String s) {
        return createStandardProcessorsSet(ELEMENT_NAME);
    }
    private Set<IProcessor> createStandardProcessorsSet(String dialectPrefix) {
        LinkedHashSet<IProcessor> processors = new LinkedHashSet<IProcessor>();
        processors.add(new SansitiveEncryptProcessor(dialectPrefix));
        return processors;
    }

}
