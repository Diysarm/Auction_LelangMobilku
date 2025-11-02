import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.googlecode.javacv.cpp.opencv_legacy.RandomizedTree as RandomizedTree
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Map<String, String> regData = [:]

'Menunggu element terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/Label/Label_SelamatDatang'), 30)

'Verifikasi teks label selamat datang'
WebUI.verifyElementText(findTestObject('Login_Page/Label/Label_SelamatDatang'), label_SelamatDatang)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/Hyperlink/Hyperlink_DaftarSekarang'), 30)

'Verifikasi Element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Login_Page/Hyperlink/Hyperlink_DaftarSekarang'), FailureHandling.STOP_ON_FAILURE)

'Klik Element'
WebUI.click(findTestObject('Login_Page/Hyperlink/Hyperlink_DaftarSekarang'))

'Tunggu page load sampai selesai'
WebUI.waitForPageLoad(20)

'Ambil URL untuk ditampung'
String urlRegistrasi = WebUI.getUrl()

'Memastikan URL sudah sesuai'
WebUI.verifyMatch(urlRegistrasi, GlobalVariable.urlRegistrasi, false)

'Menunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_DataDiri'), 0)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_DataDiri'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NamaDepan'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaDepan'), FailureHandling.STOP_ON_FAILURE)

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaDepan'), namaDepan)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tampung value attribute dari element ke variabel'
String inputtedNamaDepan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaDepan'), 
    'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedNamaDepan, namaDepan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NamaBelakang'), FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaBelakang'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaBelakang'), namaBelakang)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tampung value attribute dari element ke variabel'
String inputtedNamaBelakang = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaBelakang'), 
    'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedNamaBelakang, namaBelakang, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_TempatLahir'), FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_TempatLahir'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_TempatLahir'), tempatLahir)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tampung value attribute dari element ke variabel'
String inputtedTempatLahir = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_TempatLahir'), 
    'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedTempatLahir, tempatLahir, false)

'memastikan bahwa element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_TanggalLahir'))

'memastikan bahwa element dapat diklik'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_TanggalLahir'))

'Ambil screenshot'
WebUI.takeScreenshot()

'memastikan bahwa element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Month_Select'))

'memastikan bahwa element dapat diklik'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Month_Select'))

'Pilih bulan sesuai dengan data yang ada pada Excel'
CustomKeywords.'util.LoopDate.selectMonthFromExcel'('Data Files/Data Registrasi.xlsx', 'Sheet1')

'memastikan bahwa element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Year_Select'))

'Klik element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Year_Select'))

'Pilih Tahun sesuai dengan data yang ada pada excel'
CustomKeywords.'util.LoopDate.selectYearFromExcel'('Data Files/Data Registrasi.xlsx', 'Sheet1')

'Pilih Hari sesuai dengan data yang ada pada excel'
CustomKeywords.'util.LoopDate.selectDayFromExcel'('Data Files/Data Registrasi.xlsx', 'Sheet1')

'memastikan bahwa element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Select_Button'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Select_Button'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorKTP'), FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorKTP'), FailureHandling.STOP_ON_FAILURE)

'Randomize nomor KTP 16 digit'
String nomorKTP = CustomKeywords.'util.RandomizedNumber.generateNomorKTP'()

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorKTP'), nomorKTP)

'Ambil screenshot'
WebUI.takeScreenshot()

KeywordUtil.logInfo(nomorKTP)

'menampung value pada field Nomor KTP'
String inputtedNomorKTP = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorKTP'), 
    'value')

'Memvalidasi nomorktp yang diinput sama'
WebUI.verifyMatch(inputtedNomorKTP, nomorKTP, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_UploadKTP'), FailureHandling.STOP_ON_FAILURE)

'Menunggu element dapat di klik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/KTP/Button_UploadKTP'), 30)

'Menjalankan function runconfiguration untuk mengamil directory project'
String projectDir = RunConfiguration.getProjectDir()

'buat path relative agar bisa digunakan oleh orang lain'
String relative = 'Data Files/Foto KTP/KTP.JPG'

'gabungkan relative dengan projectdirectory'
String filePath = (projectDir + '/') + relative

'upload file dengan filepath yang sudah dibuat'
WebUI.uploadFile(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Type_File/Upload_File'), filePath)

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Preview'), 30)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_MasaBerlakuKTP'))

'Verifikasi Belum dicentang'
WebUI.verifyElementNotChecked(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'), 
    30)

'Verifikasi Element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element sudah dicentang'
WebUI.verifyElementChecked(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'), 
    30)

'Verifikasi Element memiliki atribute disabled'
WebUI.verifyElementHasAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_MasaBerlakuKTP'), 
    'disabled', 0)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Kewarganegaraan'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNA'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Sama'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'), 
        'aria-checked'), 'true', false)

'Scroll ke Element'
WebUI.scrollToElement(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'), 30)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Provinsi'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_Param', [('optionTextProv') : provinsi]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String provDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_Param', 
        [('optionTextProv') : provinsi]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(provDipilih, provinsi, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Kota'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_Param', [('optionTextKota') : kota]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String kotaDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_Param', 
        [('optionTextKota') : kota]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(kotaDipilih, kota, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatDomisili'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'), alamatDomisili)

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedAlamatDomisili = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedAlamatDomisili, alamatDomisili, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorTelepon'), FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), FailureHandling.STOP_ON_FAILURE)

'Randomize nomor Telepon depannya 08'
String nomorTelepon = CustomKeywords.'util.RandomizedNumber.generateNomorHP'()

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), nomorTelepon)

'Ambil screenshot'
WebUI.takeScreenshot()

KeywordUtil.logInfo(nomorTelepon)

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedNomorTelepon = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedNomorTelepon, nomorTelepon, false)

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_Param', [('optionTextPekerjaan') : pekerjaan]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String pekerjaanDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_Param', 
        [('optionTextPekerjaan') : pekerjaan]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(pekerjaanDipilih, pekerjaan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NamaPerusahaan'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'), namaPerusahaan)

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedNamaPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedNamaPerusahaan, namaPerusahaan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatPerusahaan'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'), alamatPerusahaan)

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedAlamatPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedAlamatPerusahaan, inputtedAlamatPerusahaan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorTeleponPerusahaan'), 
    FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), 
    FailureHandling.STOP_ON_FAILURE)

'Randomize nomor Telepon depannya 08'
String nomorTeleponPerusahaan = CustomKeywords.'util.RandomizedNumber.generateNomorHP'()

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), nomorTeleponPerusahaan)

'Ambil screenshot'
WebUI.takeScreenshot()

KeywordUtil.logInfo(nomorTeleponPerusahaan)

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedNomorTeleponPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedNomorTeleponPerusahaan, nomorTeleponPerusahaan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NPWP'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_TidakAdaNPWP'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_AdaNPWP'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Sama'
WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'), 
        'aria-checked'), 'true', false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorNPWP'))

'Verifikasi element mmiliki atribute readonly'
WebUI.verifyElementHasAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorNPWP'), 
    'readonly', 0)

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String autofillNomorNPWP = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorNPWP'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(autofillNomorNPWP, nomorKTP, false)

'Scroll ke Element'
WebUI.scrollToElement(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorNPWP'), 0)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_jenisKendaraan'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_Param', 
        [('optionTextJenisKendaraan') : jenisKendaraan]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String jenisKendaraanDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_Param', 
        [('optionTextJenisKendaraan') : jenisKendaraan]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(jenisKendaraanDipilih, jenisKendaraan, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KendaraanYangDicari'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_Param', 
        [('optionTextKendaraanYangDicari') : kendaraanYangDicari]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String kendaraanYangDicariDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_Param', 
        [('optionTextKendaraanYangDicari') : kendaraanYangDicari]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(kendaraanYangDicariDipilih, kendaraanYangDicari, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_TujuanPembelian'))

'Klik Element'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_Param', 
        [('optionTextTujuanPembelian') : tujuanPembelian]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String tujuanPembelianDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_Param', 
        [('optionTextTujuanPembelian') : tujuanPembelian]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(tujuanPembelianDipilih, tujuanPembelian, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Email'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_Email'))

'Random Data email'
String email = CustomKeywords.'util.RandomData.generateUniqueEmail'('qatest', 'yopmail.com')

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_Email'), email)

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KataSandi'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'), kataSandi)

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedKataSandi = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedKataSandi, kataSandi, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KonfirmasiKataSandi'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'), konfirmasiKataSandi)

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedKonfirmasiKataSandi = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedKonfirmasiKataSandi, konfirmasiKataSandi, false)

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedKonfirmasiKataSandi, inputtedKataSandi, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_DataPembayaran'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_NomorRekening'))

'Random nomor rekening'
String nomorRekening = CustomKeywords.'util.RandomizedNumber.generateNomorRekening'()

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/TextInput/TextInput_NomorRekening'), nomorRekening)

'Ambil screenshot'
WebUI.takeScreenshot()

KeywordUtil.logInfo(nomorRekening)

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String inputtedNomorRekening = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/TextInput/TextInput_NomorRekening'), 
    'value')

'Verifikasi Element Sama'
WebUI.verifyMatch(inputtedNomorRekening, nomorRekening, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_PilihBank'))

'Verifikasi Element Terlihat'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element Terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank_Param', 
        [('optionTextPilihBank') : pilihBank]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String pilihBankDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/PilihBank/Picklist_PilihBank_Param', 
        [('optionTextPilihBank') : pilihBank]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(pilihBankDipilih, pilihBank, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_NamaPemilikiRekening'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/TextInput/TextInput_NamaPemilikRekening'))

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/TextInput/TextInput_NamaPemilikRekening'), namaPemilikRekening)

'Ambil screenshot'
WebUI.takeScreenshot()

'Tampung value attribute dari element ke variabel'
String inputtedNamaPemilikRekening = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/TextInput/TextInput_NamaPemilikRekening'), 
    'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedNamaPemilikRekening, namaPemilikRekening, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_SumberDana'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana_Param', 
        [('optionTextSumberDana') : sumberDana]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String sumberDanaDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/SumberDana/Picklist_SumberDana_Param', 
        [('optionTextSumberDana') : sumberDana]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(sumberDanaDipilih, sumberDana, false)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Label/Label_MetodePembayaran'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran_List'), 
    30)

'Menunggu Element dapat diklik'
WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran_List'), 
    30)

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran_Param', 
        [('optionTextMetodePembayaran') : metodePembayaran]))

'Ambil screenshot'
WebUI.takeScreenshot()

'Mengambil Atribut Element untuk Ditampung ke Variabel'
String metodePembayaranDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Picklist/MetodePembayaran/Picklist_MetodePembayaran_Param', 
        [('optionTextMetodePembayaran') : metodePembayaran]), 'aria-label')

'Verifikasi Element Sama'
WebUI.verifyMatch(metodePembayaranDipilih, metodePembayaran, false)

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Button/Button_Daftar'))

'Verifikasi Element Dapat Diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Button/Button_Sebelumnya'))

'Klik Element'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Pembayaran_Section/Button/Button_Daftar'))

'Ambil screenshot'
WebUI.takeScreenshot()

'Tunggu page load sampai selesai'
WebUI.waitForPageLoad(20)

'Ambil URL untuk ditampung'
String urlAfterRegistrasi = WebUI.getUrl()

'Memastikan URL sudah sesuai'
WebUI.verifyMatch(urlAfterRegistrasi, GlobalVariable.urlLogin, false)

'Ambil screenshot'
WebUI.takeScreenshot()

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/Toast/Toast_Header'), 10)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Toast/Toast_Header'))

'Verifikasi teks Element'
WebUI.verifyElementText(findTestObject('Login_Page/Toast/Toast_Header'), toastHeader)

'Menunggu Element dapat terlihat'
WebUI.waitForElementVisible(findTestObject('Login_Page/Toast/Toast_Deskripsi'), 10)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Toast/Toast_Deskripsi'))

'Verifikasi teks Element'
WebUI.verifyElementText(findTestObject('Login_Page/Toast/Toast_Deskripsi'), toastDescription)

