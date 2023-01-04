package listenerspack;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilitiespack.utilities;

public class listeners extends utilities implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
	this.driver=((utilities)result.getInstance()).driver;
	try {
		Screenshot("succes");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot("failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	try {
		Screenshot("skipped");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}