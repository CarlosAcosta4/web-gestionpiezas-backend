package com.idat.response;

import com.idat.entity.Fabrica;

public class LoginResponse {
    private String message;
    private Fabrica fabrica;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Fabrica getFabrica() {
		return fabrica;
	}
	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

    
}