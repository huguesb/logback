/**
 * Logback: the generic, reliable, fast and flexible logging framework.
 * 
 * Copyright (C) 2000-2008, QOS.ch
 * 
 * This library is free software, you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation.
 */
package ch.qos.logback.classic.spi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { ContextListenerTest.class, CallerDataTest.class,
    LoggerComparatorTest.class, LoggingEventSerializationTest.class,
    LoggingEventSerializationPerfTest.class, ThrowableProxyTest.class,
    PackagingDataCalculatorTest.class })
public class PackageTest  {
}