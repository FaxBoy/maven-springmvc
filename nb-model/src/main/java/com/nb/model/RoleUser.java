package com.nb.model;

import java.io.Serializable;

public class RoleUser implements Serializable{

    /** @Fields serialVersionUID : TODO */ 
	private static final long serialVersionUID = 1L;

	private String cd_usrl;

    private String cd_rl;

    private String cd_us;

	public String getCd_usrl() {
		return cd_usrl;
	}

	public void setCd_usrl(String cd_usrl) {
		this.cd_usrl = cd_usrl;
	}

	public String getCd_rl() {
		return cd_rl;
	}

	public void setCd_rl(String cd_rl) {
		this.cd_rl = cd_rl;
	}

	public String getCd_us() {
		return cd_us;
	}

	public void setCd_us(String cd_us) {
		this.cd_us = cd_us;
	}
    
    
}