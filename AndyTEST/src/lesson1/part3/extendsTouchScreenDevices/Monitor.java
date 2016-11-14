package lesson1.part3.extendsTouchScreenDevices;

import lesson1.part2.TouchScreenDevices;

abstract class Monitor extends TouchScreenDevices 
{
			private String brandName;		
			private String connectorType;
			private String webCameraType;
	
	public Monitor(){}
	
	public Monitor(String brandName, String connectorType)
	{
		this.brandName = brandName;
		this.connectorType = connectorType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getConnectorType() {
		return connectorType;
	}

	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}

	public String getWebCameraType() {
		return webCameraType;
	}

	public void setWebCameraType(String webCameraType) {
		this.webCameraType = webCameraType;
	}
}
/*
public void show() {}
public void turnOn() {}
*/