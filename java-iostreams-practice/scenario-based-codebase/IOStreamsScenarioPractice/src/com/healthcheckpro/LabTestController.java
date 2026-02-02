package com.healthcheckpro;

public class LabTestController {

	@PublicAPI(description = "Fetch all lab tests")
	public void getAllLabTests() {
	}

	@RequiresAuth(role = "PATIENT")
	public void bookLabTest() {
	}

	public void downloadReport() {
	}
}