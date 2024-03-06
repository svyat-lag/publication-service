package storysphere.publicationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.
                authorizeHttpRequests(
                        authorize -> authorize
                                //.requestMatchers("/addPublication").permitAll()
                                .anyRequest().authenticated() )
                .oauth2ResourceServer(
                        j -> j.jwt(Customizer.withDefaults()) )
                .csrf((csrf) -> csrf.disable());

        return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.addAllowedOrigin("https://storysphere.ru");
        config.addAllowedOrigin("http://storysphere.ru");
        config.addAllowedOrigin("http://localhost:8000");
        config.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", config);
        return source;
    }

    // http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://springone.io/authorized&code_challenge=c478361e6869af25970682a2c53967adbc8a46e9429efdc64b96351cfd52e13f&code_challenge_method=S256

    // http://localhost:9000/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=https://storysphere.ru&code_challenge=c478361e6869af25970682a2c53967adbc8a46e9429efdc64b96351cfd52e13f&code_challenge_method=S256
}
