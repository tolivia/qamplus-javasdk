package com.qamplus.output;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {

	@JsonProperty("updated_on")
	Date updatedOn;
	Integer code;
	String description;

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
