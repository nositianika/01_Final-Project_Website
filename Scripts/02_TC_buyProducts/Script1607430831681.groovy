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

//WebUI.click(findTestObject('buyProducts/Page_DemoShop/button_Buy now'))
//WebUI.setText(findTestObject('Object Repository/buyProducts/Page_DemoShop/input_Email_InputEmail'), 'abcd12@gmail.com')
//WebUI.setEncryptedText(findTestObject('Object Repository/buyProducts/Page_DemoShop/input_Password_InputPassword'), '5Ed5CIkj9UQ8EtLtflsFug==')
//WebUI.click(findTestObject('Object Repository/buyProducts/Page_DemoShop/button_Log in'))
WebUI.click(findTestObject('Object Repository/buyProducts/Page_DemoShop/button_Buy now'))

WebUI.click(findTestObject('Object Repository/buyProducts/Page_DemoShop/button_Direct payment'))

WebUI.delay(2)

WebUI.click(findTestObject('buyProducts/Page_Payment Gateway/Page_Payment Gateway/button_Test Bank 2'))

WebUI.setText(findTestObject('buyProducts/Page_Log in - BankSystem/input_Email_InputEmail'), 'tianikanosi@gmail.com')

WebUI.setEncryptedText(findTestObject('buyProducts/Page_Log in - BankSystem/input_Password_InputPassword'), '6BFHaQfyJMIjn2c7bn9Kvg==')

WebUI.click(findTestObject('Object Repository/buyProducts/Page_Log in - BankSystem/button_Log in'))

WebUI.click(findTestObject('buyProducts/Page_Confirm payment - BankSystem/button_Close'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/buyProducts/Page_Confirm payment - BankSystem/button_Pay 10000'))

WebUI.verifyElementText(findTestObject('Page_DemoShop/Camera'), 'Camera')

WebUI.verifyElementText(findTestObject('Page_DemoShop/10000 (harga)'), '€100.00')

WebUI.delay(10)

