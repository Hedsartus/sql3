package ru.netology.sql3.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}pass")
                .authorities("read", "write").roles("ADMIN")
                .and()
                .withUser("User")
                .password("{noop}pass1")
                .authorities("read").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/persons/by-name-and-surname").hasRole("ADMIN")
                .antMatchers("/persons/by-city").hasRole("USER|ADMIN")
                .and()
                .formLogin().permitAll();
    }
}
