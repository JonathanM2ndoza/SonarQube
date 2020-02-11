package com.jmendoza;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        int number = 10;
        logger.debug("Hello World!");
        logger.debug(number + " - " + Arrays.toString(args));
    }
}
