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

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Graph/Expenses page title'), 0)

Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Detail/Expense Detail Page Title'), 0)

WS.sendRequest(findTestObject('APIs/Expenses API/Get Expenses Categories list'))

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Grocery Tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Transport tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Restaurants tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Entertainment tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Clothing tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Electronics tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Gifts  Family tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Faith  Charity tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Bills  Utilities tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Personal Care', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Personal Care tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Housing', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Housing tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Education', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Education tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Savings & Investments', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Savings  Investments tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Bank Charges', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Bank Charges tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Business Expenses', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Business Expenses tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('ATM', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/ATM tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Travel & Vacation', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Travel  Vacation tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Wedding', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Wedding  tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Home Services', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Home Services tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Kids', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Kids tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Borrowing', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Borrowing tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Lending', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Lending tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Transfer', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Transfer tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Online Shopping', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Online Shopping'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Unsure', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Unsure tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Transferred to Self', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Transferred to Self tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Household Supplies', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Household Supplies tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Shopping', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Shopping tile'), 0)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Category Field 1'), 0)

Mobile.scrollToText('Fun & Gaming', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('APP/Expenses/Category Selector/Fun  Gaming tile'), 0)

