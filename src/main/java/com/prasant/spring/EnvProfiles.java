package com.prasant.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component("envProfiles")
@PropertySource({ "classpath:application-${targetEnv}.properties" })
public class EnvProfiles {
	
	@Value("${profile.name}")
    private String profileName;

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "EnvProfiles [profileName=" + profileName + "]";
	}

}
