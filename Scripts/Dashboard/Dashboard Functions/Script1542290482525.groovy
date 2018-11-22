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
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-debug-RCH-3012 (1).apk', false)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Regularity card/Dashboard Regularity Card'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Regularity card/Dashboard Regularity Card'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Regularity card/Regularity Explainer dialog'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Regularity card/Regularity Explainer Cancel button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Regularity card/Dashboard Regularity Card'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Expense Graph Card/Unclickable Expense Graph'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Expense Graph Card/Expense card header'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Expense Graph Card/Graph filled state Manual Entry button'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Expense Graph Card/Dashboard View Expenses'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Expense Graph Card/Dashboard View Expenses'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Expense Graph Card/Dashboard View Expenses'), 0)

Mobile.scrollToText('READ NOW', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Content 1'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Webview Web address'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Webview Cancel button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Content Card header'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Content 2'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Webview Web address'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Webview Cancel button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Content Card header'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Content 3'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Webview Web address'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Content Card/Webview Cancel button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Content Card/Content Card header'), 0)

Mobile.scrollToText('Your budgets this month', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Dashboard/Budget Card/Dashboard Setup Budget button'), 0)

Mobile.verifyElementExist(findTestObject('APP/Budget Settings/Setup Budget Dialog/Budget Settings Setup Budget Dialog'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Budget Card/Budget Card header'), 0)

Mobile.scrollToText('Set category', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Dashboard/Unsure Card/Dashboard 1st Unsure item'), 0)

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Unsure Card/Dashboard Category Selector SMS Content'), 0)

Mobile.pressBack()

Mobile.scrollToText('Go ahead, build your community', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Dashboard/Community Card/Invite Friend 1'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Community Card/Invite Friend 2'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Community Card/Invite Friend 3'), 0)

Mobile.scrollToText('CURRENT POINTS', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Dashboard/Level Card/Level card Refresh button'), 0)

