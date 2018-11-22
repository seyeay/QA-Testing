import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-debug-RCH-3012 (1).apk', false)

Mobile.verifyElementExist(findTestObject('APP/App Open/Welcome Screen/Welcome screen Live your best life heading'), 0)

Mobile.tap(findTestObject('APP/App Open/Welcome Screen/Welcome screen Create account button'), 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up form First Name field'), 'Automated', 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up form Last Name field'), 'Signup', 0)

Mobile.tap(findTestObject('APP/Sign up form/Sign up form Country field'), 0)

Mobile.tap(findTestObject('APP/Sign up form/Country dialog- Nigeria (234)'), 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up form Phone number field'), '2123123432', 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up form Email field'), 'seyeay10@gmail.com', 0)

Mobile.checkElement(findTestObject('APP/Sign up form/Sign up form Male radio button'), 0)

Mobile.verifyElementChecked(findTestObject('APP/Sign up form/Sign up form Male radio button'), 0)

Mobile.tap(findTestObject('APP/Sign up form/Sign up form Birthday field'), 0)

Mobile.tap(findTestObject('APP/Sign up form/Birthday OK button'), 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up fom Password field'), 'eminem', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('APP/Sign up form/Sign up form Confirm Password field'), 'eminem1', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('APP/Sign up form/Sign up form Create Account button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Sign up form/Signup form Page heading'), 0)

Mobile.clearText(findTestObject('APP/Sign up form/Sign up form Confirm Password field'), 0)

Mobile.setText(findTestObject('APP/Sign up form/Sign up form Confirm Password field'), 'eminem', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('APP/Sign up form/Sign up form Create Account button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Sign up form/Sign up form Name Validation header'), 0)

Mobile.tap(findTestObject('APP/Sign up form/Sign up Splash screen/Signup Splash sceen Jump In button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Expense Graph Card/Dashboard View Expenses'), 0)

