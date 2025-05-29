import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("¡Hola mundo desde Log4J2!");
        logger.error("Esto es un error de prueba.");
    }
}