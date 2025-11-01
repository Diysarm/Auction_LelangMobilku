package util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import java.security.SecureRandom

import internal.GlobalVariable

public class RandomizedNumber {
	
	SecureRandom random = new SecureRandom()
	
	@Keyword
	def String generateNomorKTP() {
		StringBuilder ktp = new StringBuilder()

		ktp.append(random.nextInt(9) +1)

		for(int i=1; i<16; i++) {
			ktp.append(random.nextInt(10))
		}
		return ktp.toString()
	}
	@Keyword
	def String generateNomorHP(int totalDigit = 12) {
		StringBuilder hp = new StringBuilder("08")
		for (int i = 2; i < totalDigit; i++) {
			hp.append(random.nextInt(10))
		}
		return hp.toString()
	}

	@Keyword
	def String generateNomorRekening(int totalDigit = 10) {
		StringBuilder rek = new StringBuilder()
		rek.append(random.nextInt(9) + 1)
		for (int i = 1; i < totalDigit; i++) {
			rek.append(random.nextInt(10))
		}
		return rek.toString()
	}
	
}
