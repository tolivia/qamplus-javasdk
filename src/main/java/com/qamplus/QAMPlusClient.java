package com.qamplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qamplus.input.Params;
import com.qamplus.output.Result;

public class QAMPlusClient {

	private String username;
	private String password;

	private String BASE_URL = "https://api.qamplus.com/voice/v1/";

	public QAMPlusClient(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Result createInboundCall(Params inputParams) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			URL url = new URL(BASE_URL + "inbound");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");

			OutputStream os = conn.getOutputStream();
			mapper.writeValue(os, inputParams);
			os.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String result = "";
			String output;
			while ((output = br.readLine()) != null) {
				result += output;
			}

			conn.disconnect();

			System.out.println(result);
			return new ObjectMapper().readValue(result, Result.class);

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;
	}

}
