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

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.model.FailureHandling

public class LoopDate {

	@Keyword
	def selectMonthFromExcel(String filePath = 'Data Files/Data Registrasi.xlsx', String sheetName = 'Sheet1') {
		// Baca file Excel
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		def sheet = workbook.getSheet(sheetName)

		// Ambil target bulan dari baris pertama kolom 0
		String targetMonth = sheet.getRow(1).getCell(0).getStringCellValue().trim()
		WebUI.comment(" Target bulan dari Excel: ${targetMonth}")

		boolean found = false

		for (int i = 1; i <= 12; i++) {
			String xpath = "(//div[@aria-label='Open months overlay']//following-sibling::div//div//div//div//div)[${i}]"
			TestObject monthByIndex = new TestObject("monthIndex_${i}")
			monthByIndex.addProperty("xpath", ConditionType.EQUALS, xpath)

			if (WebUI.verifyElementPresent(monthByIndex, 3, FailureHandling.OPTIONAL)) {
				String monthText = WebUI.getText(monthByIndex).trim()
				WebUI.comment("Index ${i} = ${monthText}")

				if (monthText.equalsIgnoreCase(targetMonth)) {
					WebUI.comment("Klik bulan: ${monthText} (index ${i})")
					WebUI.click(monthByIndex)
					found = true
					break
				}
			}
		}

		if (!found) {
			WebUI.comment(" Bulan '${targetMonth}' tidak ditemukan.")
		}

		workbook.close()
		fis.close()
	}

	@Keyword
	def selectYearFromExcel(String filePath = 'Data Files/Data Registrasi.xlsx', String sheetName = 'Sheet1') {
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		def sheet = workbook.getSheet(sheetName)

		String targetYear = sheet.getRow(1).getCell(1).getStringCellValue().trim()
		WebUI.comment(" Target tahun dari Excel: ${targetYear}")

		boolean found = false

		for (int i = 1; i <= 500; i++) {
			String xpath = "(//div[@aria-label='Open years overlay']//following-sibling::div//div//div//div//div)[${i}]"
			TestObject yearByIndex = new TestObject("yearIndex_${i}")
			yearByIndex.addProperty("xpath", ConditionType.EQUALS, xpath)

			if (WebUI.verifyElementPresent(yearByIndex, 3, FailureHandling.OPTIONAL)) {
				String yearText = WebUI.getText(yearByIndex).trim()
				WebUI.comment("Index ${i} = ${yearText}")

				if (yearText.equalsIgnoreCase(targetYear)) {
					WebUI.comment("Klik tahun: ${yearText} (index ${i})")
					WebUI.click(yearByIndex)
					found = true
					break
				}
			}
		}

		if (!found) {
			WebUI.comment(" Tahun '${targetYear}' tidak ditemukan.")
		}

		workbook.close()
		fis.close()
	}

	@Keyword
	def selectDayFromExcel(String filePath = 'Data Files/Data Registrasi.xlsx', String sheetName = 'Sheet1') {
		FileInputStream fis = new FileInputStream(filePath)
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		def sheet = workbook.getSheet(sheetName)

		String targetDay = sheet.getRow(1).getCell(2).getStringCellValue().trim()
		WebUI.comment(" Target hari dari Excel: ${targetDay}")

		boolean found = false

		for (int i = 1; i <= 42; i++) {
			String xpath = "(//div[@aria-label='Calendar wrapper']//div//div//div//div)[${i}]"
			TestObject dayByIndex = new TestObject("dayIndex_${i}")
			dayByIndex.addProperty("xpath", ConditionType.EQUALS, xpath)

			if (WebUI.verifyElementPresent(dayByIndex, 3, FailureHandling.OPTIONAL)) {
				String dayText = WebUI.getText(dayByIndex).trim()
				WebUI.comment("Index ${i} = ${dayText}")

				if (dayText.equalsIgnoreCase(targetDay)) {
					WebUI.comment("Klik bulan: ${dayText} (index ${i})")
					WebUI.click(dayByIndex)
					found = true
					break
				}
			}
		}

		if (!found) {
			WebUI.comment(" Tahun '${targetYear}' tidak ditemukan.")
		}

		workbook.close()
		fis.close()
	}
}