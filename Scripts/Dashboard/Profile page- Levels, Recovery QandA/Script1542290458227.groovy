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

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Dashboard ProfileLevel Card'), 0)

Mobile.tap(findTestObject('APP/Dashboard/Dashboard ProfileLevel Card'), 0)

Mobile.verifyElementExist(findTestObject('APP/Profile Page/Recovery Question and Answer dialog'), 0)

if (true) {
    Mobile.setText(findTestObject('APP/Profile Page/Recovery Question Field'), 'Mother\'s Maiden Name', 5)

    Mobile.setText(findTestObject('APP/Profile Page/Recovery Answer Field'), 'maxwell', 5)

    Mobile.tap(findTestObject('APP/Profile Page/Recovery QA Continue button'), 5)

    Mobile.tap(findTestObject('APP/Profile Page/Recovery QA Edit button'), 5)

    Mobile.tap(findTestObject('APP/Profile Page/Recovery QA Continue button'), 5)

    Mobile.tap(findTestObject('APP/Profile Page/Recovery QA Done button'), 0)
}

Mobile.tap(findTestObject('APP/Profile Page/Profile page View All Levels'), 0)

Mobile.verifyElementExist(findTestObject('APP/Profile Page/Levels page/Levels page header'), 0)

Mobile.verifyElementExist(findTestObject('APP/Profile Page/Levels page/Levels Current Level image'), 0)

Mobile.tap(findTestObject('APP/Profile Page/Levels page/Levels Page cancel button'), 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('APP/Dashboard/Regularity card/Dashboard Regularity Card'), 0)

