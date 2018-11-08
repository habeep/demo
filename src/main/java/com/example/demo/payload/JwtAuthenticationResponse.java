package com.example.demo.payload;

public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private String roles;

    public String getRole() {
		return roles;
	}

	public void setRole(String role) {
		this.roles = role;
	}

	public JwtAuthenticationResponse(String accessToken) {
		System.out.println(accessToken);
        this.accessToken = accessToken;
        this.roles = "ADMIN";
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}