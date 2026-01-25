package portifolio.atualizado;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // libera especificamente o seu front no Vercel
                        .allowedOrigins("https://portifolio-atualizado-swart.vercel.app")
                        // métodos HTTP permitidos
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        // cabeçalhos permitidos
                        .allowedHeaders("*");
                        // permite envio de cookies/autenticação se precisar
                        // .allowCredentials(true);
            }
        };
    }
}