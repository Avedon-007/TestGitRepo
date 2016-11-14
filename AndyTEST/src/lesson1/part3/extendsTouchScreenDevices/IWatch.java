package lesson1.part3.extendsTouchScreenDevices;

import lesson1.part2.TouchScreenDevices;

abstract class IWatch extends TouchScreenDevices 
{
			private String iWatchModel;		
			private String braceletMaterial;
			private String bluethooth;
	
	public IWatch(){}
	
	public IWatch(String iWatchModel, String braceletMaterial, String bluethooth)
	{
		this.iWatchModel = iWatchModel;
		this.braceletMaterial = braceletMaterial;
		this.bluethooth = bluethooth;
	}

	public String getiWatchModel() {
		return iWatchModel;
	}

	public void setiWatchModel(String iWatchModel) {
		this.iWatchModel = iWatchModel;
	}

	public String getBraceletMaterial() {
		return braceletMaterial;
	}

	public void setBraceletMaterial(String braceletMaterial) {
		this.braceletMaterial = braceletMaterial;
	}

	public String getBluethooth() {
		return bluethooth;
	}

	public void setBluethooth(String bluethooth) {
		this.bluethooth = bluethooth;
	}
			
	
	
}
/*
public void showTime() {}
public void charge() {}

*/