package com.qamplus.output;

import java.util.List;

public class Result {

	Status status;
	List<Status> errors;
	List<Status> warnings;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Status> getErrors() {
		return errors;
	}

	public void setErrors(List<Status> errors) {
		this.errors = errors;
	}

	public List<Status> getWarnings() {
		return warnings;
	}

	public void setWarnings(List<Status> warnings) {
		this.warnings = warnings;
	}
}
