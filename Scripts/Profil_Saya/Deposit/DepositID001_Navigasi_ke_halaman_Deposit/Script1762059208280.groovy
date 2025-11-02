import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Panggil test case untuk login'
WebUI.callTestCase(findTestCase('Login/LoginID001_Login_dengan_credential_valid'), [('label_SelamatDatang') : 'Selamat Datang'
        , ('email') : email, ('password') : password], FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Profil_Saya_Page/Sub_Tab/Sub_Tab_Deposit'))

'Verifikasi teks Element'
WebUI.verifyElementText(findTestObject('Profil_Saya_Page/Sub_Tab/Sub_Tab_Deposit'), titleSub_Tab)

'Klik Element'
WebUI.click(findTestObject('Profil_Saya_Page/Sub_Tab/Sub_Tab_Deposit'))

'Mengambil atribut Aria-Current'
String ariaCurrent = WebUI.getAttribute(findTestObject('Profil_Saya_Page/Sub_Tab/Sub_Tab_Deposit'), 'aria-current')

'Memastikan halaman yang aktif sekarang'
WebUI.verifyMatch(ariaCurrent, 'page', false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Profil_Saya_Page/Deposit_Section/Label/Label_deposit'))

'Verifikasi teks Element'
WebUI.verifyElementText(findTestObject('Profil_Saya_Page/Deposit_Section/Label/Label_deposit'), titleSub_Tab)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_Lelang'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_Lelang'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_Tanggal'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_Tanggal'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_UploadBuktiBayar'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Profil_Saya_Page/Deposit_Section/Button/Button_UploadBuktiBayar'))

