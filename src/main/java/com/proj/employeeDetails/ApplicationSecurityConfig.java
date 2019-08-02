package com.proj.employeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.util.AntPathMatcher;
@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig 
extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserDetailsService userDetailsService;
	//	MyUserDetailsService userDetailsService= new MyUserDetailsService();
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		//We need to make it interact with the service layer because that the way to roll mahboy
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http.csrf().disable().formLogin()
//		.loginPage("/login")
//		.permitAll()
//		.and().
//		logout().
//		invalidateHttpSession(false).
//		clearAuthentication(true).logoutRequestMatcher((RequestMatcher) new AntPathMatcher("/logout")).logoutSuccessUrl("/login");
//	}

	//the @bean annotation makes this method a bean and also we need to create  the data type of type UserDetailService to return so we use bean to do so.
	//	@Bean
	//	@Override
	//	protected UserDetailsService userDetailsService() {
	//		// TODO Auto-generated method stub
	//		 List<UserDetails> users = new ArrayList();
	//		 users.add(User.withDefaultPasswordEncoder().username("Bishwa").password("12345").roles("USER").build());
	//		 return new InMemoryUserDetailsManager(users);
	//}
	//The above commented part is used to assign username and password by user themselves.
}
