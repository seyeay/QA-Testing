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

empty_state_graph = Mobile.verifyElementVisible(findTestObject('APP/Expenses/Expense Graph/Expense Graph Empty state text'), 
    0)

if (empty_state_graph == false) {
    Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

    Mobile.scrollToText('Delete')

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete button'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete Warning - Cancel'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete button'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete Warning- Delete'), 0)
} else {
    Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Empty State Manual Entry button'), 0)

    Mobile.setText(findTestObject('APP/Expenses/Manual Entry/Amount Field'), '1000', 0)

    Mobile.tap(findTestObject('APP/Expenses/Manual Entry/Date Field'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('APP/Expenses/Manual Entry/Date dialog OK button'), 0, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('APP/Expenses/Manual Entry/Vendor field'), 'Automation test', 0)

    Mobile.tap(findTestObject('APP/Expenses/Manual Entry/Category Field'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('APP/Expenses/Category Selector/Restaurants tile'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Manual Entry/Enabled SAVE button'), 0, FailureHandling.OPTIONAL)

    Mobile.delay(5)

    Mobile.verifyElementExist(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Graph/Expenses 1st Category Item'), 0)

    Mobile.scrollToText('Delete')

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete button'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete Warning - Cancel'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete button'), 0)

    Mobile.tap(findTestObject('APP/Expenses/Expense Detail/Expense Detail 2/Expense Detail 2 Delete Warning- Delete'), 0)
}

