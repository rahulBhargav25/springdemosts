package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WiringConfiguration {
	//@Bean(initMethod = "init", destroyMethod = "destroyed")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public SimpleLogic SimpleLogic() {
		return new SimpleLogic();
	}
}
