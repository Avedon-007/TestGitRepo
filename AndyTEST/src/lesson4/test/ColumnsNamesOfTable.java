package lesson4.test;

public class ColumnsNamesOfTable 
{
	String nameOfTestCaseNoColumn;
	double testCaseNo;
	String testCaseName;
	String sqlQuery;
	String expectedResult;
	String actualResult;
	String testResult;
	
	
	
	
/*
	public ColumnsNamesOfTable(int testCaseNo, String testCaseName, String sqlQuery, String expectedResult,
			String actualResult, String testResult) 
	{		
		//this.testCaseNo = testCaseNo;
		this.testCaseName = testCaseName;
		this.sqlQuery = sqlQuery;
		this.expectedResult = expectedResult;
		this.actualResult = actualResult;
		this.testResult = testResult;
	}
*/
	
	public String getNameOfTestCaseNoColumn() {
		return nameOfTestCaseNoColumn;
	}

	public void setNameOfTestCaseNoColumn(String nameOfTestCaseNameColumn) {
		this.nameOfTestCaseNoColumn = nameOfTestCaseNameColumn;
	}

	
	public double getTestCaseNo() {
		return testCaseNo;
	}
	
	public void setTestCaseNo(double testCaseNo) {
		this.testCaseNo = testCaseNo;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

	public String getActualResult() {
		return actualResult;
	}

	public void setActualResult(String actualResult) {
		this.actualResult = actualResult;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	
}
