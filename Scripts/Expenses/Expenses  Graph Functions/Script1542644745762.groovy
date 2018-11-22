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

Mobile.verifyElementVisible(findTestObject('APP/Dashboard/Dashboard ProfileLevel Card'), 0)

Mobile.delay(3, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Tool bar/Burger icon'), 0)

Mobile.tap(findTestObject('APP/Navigation/Side Bar/Expenses icon'), 0)

Mobile.verifyElementVisible(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses Account Settings Gear'), 0)

a = Mobile.verifyElementExist(findTestObject('APP/Budget Settings/Setup Budget Dialog/Budget Settings Setup Budget Dialog'), 
    3)

if (a == true) {
    Mobile.pressBack()

    Mobile.verifyElementExist(findTestObject('APP/Budget Settings/Budget Settings Title Page'), 0)

    Mobile.delay(15, FailureHandling.OPTIONAL)
} else {
    Mobile.tap(findTestObject('APP/Tool bar/Burger icon'), 0)

    Mobile.tap(findTestObject('APP/Navigation/Side Bar/Expenses icon'), 0)
}

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Graph/Expenses page title'), 0)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses PercentageCurrency toggle'), 0)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses Manual Entry'), 5)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/SP.B.M.E. No Add Expense button'), 5)

Mobile.verifyElementExist(findTestObject('APP/Expenses/Manual Entry/Add Expense header'), 0)

Mobile.tap(findTestObject('APP/Expenses/Manual Entry/Cancel Button'), 5)

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Graph/Expenses page title'), 0)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Detail/Expense Detail Page Title'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Graph/Expenses page title'), 0)

