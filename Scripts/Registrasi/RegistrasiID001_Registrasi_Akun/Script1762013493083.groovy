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

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_DataDiri'), 0)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_DataDiri'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NamaDepan'))

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaDepan'), FailureHandling.STOP_ON_FAILURE)

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaDepan'), namaDepan)

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

'Tampung value attribute dari element ke variabel'
String inputtedTempatLahir = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_TempatLahir'), 
    'value')

'Memastikan bahwa element yang diinput sudah sesuai'
WebUI.verifyMatch(inputtedTempatLahir, tempatLahir, false)

'memastikan bahwa element dapat diklik'
WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_TanggalLahir'))

'memastikan bahwa element dapat diklik'
WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_TanggalLahir'))

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

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorKTP'), FailureHandling.STOP_ON_FAILURE)

'Verifikasi Element Terlihat'
WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorKTP'), FailureHandling.STOP_ON_FAILURE)

'Randomize nomor KTP 16 digit'
String nomorKTP = CustomKeywords.'util.RandomizedNumber.generateNomorKTP'()

'Input teks sesuai variabel'
WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorKTP'), nomorKTP)

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

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Preview'), 30)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_MasaBerlakuKTP'))

WebUI.verifyElementNotChecked(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'), 
    30)

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'))

WebUI.verifyElementChecked(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Checkbox/Checkbox_BerlakuSeumurHidup'), 
    30)

WebUI.verifyElementHasAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Date/Date_Input_MasaBerlakuKTP'), 
    'disabled', 0)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Kewarganegaraan'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNA'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'))

WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'), 
        'aria-checked'), 'true', false)

WebUI.scrollToElement(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Kewarganegaraan/Button_WNI'), 30)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Provinsi'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_Param', [('optionTextProv') : provinsi]))

String provDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Provinsi/Picklist_Provinsi_Param', 
        [('optionTextProv') : provinsi]), 'aria-label')

WebUI.verifyMatch(provDipilih, provinsi, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Kota'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_Param', [('optionTextKota') : kota]))

String kotaDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Kota/Picklist_Kota_Param', 
        [('optionTextKota') : kota]), 'aria-label')

WebUI.verifyMatch(kotaDipilih, kota, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatDomisili'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'))

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'), alamatDomisili)

String inputtedAlamatDomisili = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatDomisili'), 
    'value')

WebUI.verifyMatch(inputtedAlamatDomisili, alamatDomisili, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorTelepon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), FailureHandling.STOP_ON_FAILURE)

'Randomize nomor Telepon depannya 08'
String nomorTelepon = CustomKeywords.'util.RandomizedNumber.generateNomorHP'()

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), nomorTelepon)

KeywordUtil.logInfo(nomorTelepon)

String inputtedNomorTelepon = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTelepon'), 
    'value')

WebUI.verifyMatch(inputtedNomorTelepon, nomorTelepon, false)

WebUI.scrollToElement(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatDomisili'), 0)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatDomisili'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_Param', [('optionTextPekerjaan') : pekerjaan]))

String pekerjaanDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/Pekerjaan/Picklist_Pekerjaan_Param', 
        [('optionTextPekerjaan') : pekerjaan]), 'aria-label')

WebUI.verifyMatch(pekerjaanDipilih, pekerjaan, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NamaPerusahaan'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'))

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'), namaPerusahaan)

String inputtedNamaPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NamaPerusahaan'), 
    'value')

WebUI.verifyMatch(inputtedNamaPerusahaan, namaPerusahaan, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_AlamatPerusahaan'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'))

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'), alamatPerusahaan)

String inputtedAlamatPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_AlamatPerusahaan'), 
    'value')

WebUI.verifyMatch(inputtedAlamatPerusahaan, inputtedAlamatPerusahaan, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorTeleponPerusahaan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), 
    FailureHandling.STOP_ON_FAILURE)

'Randomize nomor Telepon depannya 08'
String nomorTeleponPerusahaan = CustomKeywords.'util.RandomizedNumber.generateNomorHP'()

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), nomorTeleponPerusahaan)

KeywordUtil.logInfo(nomorTeleponPerusahaan)

String inputtedNomorTeleponPerusahaan = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorTeleponPerusahaan'), 
    'value')

WebUI.verifyMatch(inputtedNomorTeleponPerusahaan, nomorTeleponPerusahaan, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NPWP'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_TidakAdaNPWP'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_AdaNPWP'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'))

WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/NPWP/Button_NPWPNIK'), 
        'aria-checked'), 'true', false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorNPWP'))

WebUI.verifyElementHasAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorNPWP'), 
    'readonly', 0)

String autofillNomorNPWP = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_NomorNPWP'), 
    'value')

WebUI.verifyMatch(autofillNomorNPWP, nomorKTP, false)

WebUI.scrollToElement(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_NomorNPWP'), 0)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_jenisKendaraan'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_Param', 
        [('optionTextJenisKendaraan') : jenisKendaraan]))

String jenisKendaraanDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/JenisKendaraan/Picklist_jenisKendaraan_Param', 
        [('optionTextJenisKendaraan') : jenisKendaraan]), 'aria-label')

WebUI.verifyMatch(jenisKendaraanDipilih, jenisKendaraan, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KendaraanYangDicari'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_Param', 
        [('optionTextKendaraanYangDicari') : kendaraanYangDicari]))

String kendaraanYangDicariDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/KendaraanYangDicari/Picklist_KendaraanYangDicari_Param', 
        [('optionTextKendaraanYangDicari') : kendaraanYangDicari]), 'aria-label')

WebUI.verifyMatch(kendaraanYangDicariDipilih, kendaraanYangDicari, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_TujuanPembelian'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian'))

WebUI.waitForElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_List'), 
    30)

WebUI.waitForElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_List'), 
    30)

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_Param', 
        [('optionTextTujuanPembelian') : tujuanPembelian]))

String tujuanPembelianDipilih = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Picklist/TujuanPembelian/Picklist_TujuanPembelian_Param', 
        [('optionTextTujuanPembelian') : tujuanPembelian]), 'aria-label')

WebUI.verifyMatch(tujuanPembelianDipilih, tujuanPembelian, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_Email'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_Email'))

String email = CustomKeywords.'util.RandomData.generateUniqueEmail'('qatest', 'yopmail.com')

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_Email'), email)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KataSandi'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'))

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'), kataSandi)

String inputtedKataSandi = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KataSandi'), 
    'value')

WebUI.verifyMatch(inputtedKataSandi, kataSandi, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Label/Label_KonfirmasiKataSandi'))

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'))

WebUI.setText(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'), konfirmasiKataSandi)

String inputtedKonfirmasiKataSandi = WebUI.getAttribute(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/TextInput/TextInput_KonfirmasiKataSandi'), 
    'value')

WebUI.verifyMatch(inputtedKonfirmasiKataSandi, konfirmasiKataSandi, false)

WebUI.verifyMatch(inputtedKonfirmasiKataSandi, inputtedKataSandi, false)

WebUI.verifyElementVisible(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

WebUI.verifyElementClickable(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

WebUI.click(findTestObject('Form_Pendaftaran_Page/Data_Diri_Section/Button/Navigation/Button_Selanjutnya'))

