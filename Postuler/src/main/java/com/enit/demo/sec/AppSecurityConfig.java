package com.enit.demo.sec;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
        .csrf().disable();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests().antMatchers("/login/","/register","/all", "/projects","/project/launch/","/addCarr","/addPost","/getAllPost","/removePostuler/**").permitAll();
		//http.authorizeRequests().antMatchers("/addPost/","/removePost").hasAuthority("USER");
		http.addFilterBefore(new JWTAuthorisationFilter(), UsernamePasswordAuthenticationFilter.class);
}
	




}