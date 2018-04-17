package com.qamplus.input;

import java.util.List;

public class Logic {
	String initial;
	List<Step> steps;

	public Logic(String initial, List<Step> steps) {
		super();
		this.initial = initial;
		this.steps = steps;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

}
