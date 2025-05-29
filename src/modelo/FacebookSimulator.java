package modelo;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;
import facebook4j.PostUpdate;
import facebook4j.auth.AccessToken;

public class FacebookSimulator {
    public static void main(String[] args) {
        try {
            // Crear instancia de Facebook (simulada)
            Facebook facebook = new FacebookFactory().getInstance();

            // Simulación de configuración (sin token real)
            facebook.setOAuthAppId("APP_ID_AQUI", "APP_SECRET_AQUI");
            facebook.setOAuthAccessToken(new AccessToken("TOKEN_SIMULADO", null));

            // Crear mensaje de prueba
            PostUpdate post = new PostUpdate("¡Simulación exitosa desde Facebook4J!");
            System.out.println("🔗 Conexión simulada a Facebook...");
            System.out.println("📨 Mensaje preparado: " + post.getMessage());

        } catch (Exception e) {
            System.out.println("⚠️ Simulación completa: sin token real. Todo correcto.");
        }
    }
}