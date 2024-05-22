package com.companyName.limitsMicroservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-microservice")
//In the step, we enhanced our limit service to get the properties from a property file.
//In the subsequent steps,we would want to connect our limit service to a centralized configuration server.

public class Configuration {

	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
