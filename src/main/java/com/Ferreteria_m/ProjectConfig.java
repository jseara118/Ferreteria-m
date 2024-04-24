package com.Ferreteria_m;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ProjectConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registro) {
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/index").setViewName("index");
        registro.addViewController("/login").setViewName("login");
        registro.addViewController("/registro/nuevo").setViewName("registro/nuevo");
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request -> request
                .requestMatchers("/", "/index", "/js/**", "/css/**", "/webjars/**", "/registro/**"
                        , "/info/info"
                        ,"/pruebas/**")
                .permitAll()
                .requestMatchers("/categoria/listado", "/producto/listado")
                .hasRole("VENDEDOR")
                .requestMatchers("/categoria/listado", "/producto/listado")
                .hasRole("VENDEDOR")
                .requestMatchers("/categoria/nuevo", "/categoria/modificar/**", "/categoria/eliminar/**", "/categoria/guardar/**",
                        "/producto/nuevo", "/producto/modificar/**", "/producto/eliminar/**", "/producto/guardar/**")
                .hasRole("ADMIN")
        )
                .formLogin((form) -> form.loginPage("/login").defaultSuccessUrl("/", true).permitAll())
                .logout((logout) -> logout.permitAll());
        return http.build();
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
