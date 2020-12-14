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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/registrasiDemoShop/Page_DemoShop/a_Register'))

String email = CustomKeywords.'com.test1.function.util.randomEmail.getRandomEmail'()

WebUI.setText(findTestObject('Object Repository/registrasiDemoShop/Page_DemoShop/input_Email_InputEmail'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/registrasiDemoShop/Page_DemoShop/input_Password_InputPassword'), 
    '5Ed5CIkj9UQ8EtLtflsFug==')

WebUI.setEncryptedText(findTestObject('Object Repository/registrasiDemoShop/Page_DemoShop/input_Confirm password_InputConfirmPassword'), 
    '5Ed5CIkj9UQ8EtLtflsFug==')

WebUI.click(findTestObject('Object Repository/registrasiDemoShop/Page_DemoShop/button_Register'))

