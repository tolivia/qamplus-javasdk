package com.qamplus.input;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Params {

	@JsonProperty("execution_logic")
	Logic executionLogic;
	@JsonProperty("reference_logic")
	Logic referenceLogic;
	String to;
	String from;
	String country;
	String technology;

	public Params(Logic executionLogic, Logic referenceLogic, String to, String from, String country, String technology) {
		super();
		this.executionLogic = executionLogic;
		this.referenceLogic = referenceLogic;
		this.to = to;
		this.from = from;
		this.country = country;
		this.technology = technology;
	}

	public Logic getExecutionLogic() {
		return executionLogic;
	}

	public void setExecutionLogic(Logic executionLogic) {
		this.executionLogic = executionLogic;
	}

	public Logic getReferenceLogic() {
		return referenceLogic;
	}

	public void setReferenceLogic(Logic referenceLogic) {
		this.referenceLogic = referenceLogic;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
}
