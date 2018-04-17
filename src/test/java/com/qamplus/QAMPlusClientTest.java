package com.qamplus;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.qamplus.input.Logic;
import com.qamplus.input.Params;
import com.qamplus.input.Step;
import com.qamplus.output.Result;

public class QAMPlusClientTest {

	@Test
	public void testCreateInboundCall() {
		QAMPlusClient client = new QAMPlusClient("da0e1acd-caf5-404b-a174-62e18fe9189b",
				"5369ea23-5ce5-465b-a37f-6e34457e6e17");
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step("play", "2_en"));
		Logic executionLogic = new Logic("answer", steps);
		Logic referenceLogic = new Logic("answer", steps);
		Params params = new Params(executionLogic, referenceLogic, "", "15161122334", "us", "pstn");
		Result result = client.createInboundCall(params);
		assertNotNull(result.getStatus().getUpdatedOn());
		assertEquals(500, (int) result.getStatus().getCode());
		assertEquals(-20001, (int) result.getErrors().get(0).getCode());
		assertTrue(result.getWarnings().isEmpty());
	}

}
