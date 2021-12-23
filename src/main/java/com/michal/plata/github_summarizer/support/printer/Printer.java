package com.michal.plata.github_summarizer.support.printer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Printer {

    private Printer() {
    }

    public static void print(String string) {
        Logger logger = LogManager.getLogger(Printer.class);
        logger.log(Level.INFO, "{} {} {}", "\u001B[1;32m", string, "\u001B[0m");
    }
}
