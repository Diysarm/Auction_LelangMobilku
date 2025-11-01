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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException as WebElementNotFoundException

'Menunggu element terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/Label/Label_SelamatDatang'), 30)

'Verifikasi teks label selamat datang'
WebUI.verifyElementText(findTestObject('Login_Page/Label/Label_SelamatDatang'), label_SelamatDatang)

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Label/Label_Email'))

'Menunggu element terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/TextInput/TextInput_Email'), 30)

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Login_Page/TextInput/TextInput_Email'), email)

'Tampung value attribute dari element ke variabel'
String inputtedEmail = WebUI.getAttribute(findTestObject('Login_Page/TextInput/TextInput_Email'), 'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedEmail, email, false)

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Label/Label_Password'))

'Menunggu element terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/TextInput/TextInput_Password'), 30)

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Login_Page/TextInput/TextInput_Password'), password)

'Tampung value attribute dari element ke variabel'
String inputtedPassword = WebUI.getAttribute(findTestObject('Login_Page/TextInput/TextInput_Password'), 'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedPassword, password, false)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tunggu element ada di DOM'
WebUI.waitForElementPresent(findTestObject('Login_Page/iFrame/iFrame_Captcha'), 30)

'Pindah frame ke iFrame captcha'
WebUI.switchToFrame(findTestObject('Login_Page/iFrame/iFrame_Captcha'), 10)

'Menunggu element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Login_Page/Checkbox/Checkbox_Captcha'), 30)

'Klik checkbox captcha'
WebUI.click(findTestObject('Login_Page/Checkbox/Checkbox_Captcha'))

'Delay 20 detik karena captcha harus dilakukan secara manual'
WebUI.delay(20)

'Kembali ke frame default'
WebUI.switchToDefaultContent()

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Login_Page/Checkbox/Checkbox_SnK'))

'Verifikasi element belum dicentang'
WebUI.verifyElementNotChecked(findTestObject('Login_Page/Checkbox/Checkbox_SnK'), 30)

'Klik element'
WebUI.click(findTestObject('Login_Page/Checkbox/Checkbox_SnK'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Login_Page/Button/Button_Masuk'))

'Klik element'
WebUI.click(findTestObject('Login_Page/Button/Button_Masuk'))

'Verifikasi element terlihat'
WebUI.verifyElementVisible(findTestObject('Profil_Saya_Page/Tab/Tab_Profil Saya'))

'Ambil URL untuk ditampung'
String urlSetelahLogin = WebUI.getUrl()

'Memastikan URL sudah sesuai'
WebUI.verifyMatch(urlSetelahLogin, GlobalVariable.urlProfil, false)

'Ambil screenshot'
WebUI.takeScreenshot()


