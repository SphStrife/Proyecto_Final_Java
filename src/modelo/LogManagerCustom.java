package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogManagerCustom {
    private static final Logger logger = LogManager.getLogger(LogManagerCustom.class);

    public static void logInfo(String mensaje) {
        logger.info(mensaje);
    }

    public static void logError(String mensaje) {
        logger.error(mensaje);
    }
}