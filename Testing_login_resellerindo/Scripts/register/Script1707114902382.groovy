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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rs-dev.promosindo.web.id/')

WebUI.click(findTestObject('Object Repository/Page_Resellerindo - Masuk SMM Panel Resellerindo/a_person_addDaftar'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Nama_first'), 'standartt')

WebUI.click(findTestObject('Object Repository/Page_Register/div_Username'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Register/input_Nama_first'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Username_username'), 'standartt')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'standartt@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Password_password'), 'xlHpaiHkJ4/X4v/7dzvUMQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_Ulangi Password_repassword'), 'xlHpaiHkJ4/X4v/7dzvUMQ==')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_No Whatsapp Untuk Konfirmasi_phone'), '089111333444')

WebUI.click(findTestObject('Object Repository/Page_Register/a_Selanjutnya'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Register/a_Pilih'), 10)

WebUI.click(findTestObject('Object Repository/Page_Register/a_Pilih'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_Pilih Di SiniBank Central Asia (Reco_0b3ea2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Register/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_Register/input_Kontak Kami_setuju'))

WebUI.closeBrowser()

