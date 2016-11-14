package lesson1.part3.extendsPlanes;

import lesson1.part2.Planes;

abstract class MilitaryAirplane extends Planes 
{
			private String missilesType;		
			private String machineGunType;
			private String flaresType;
	
	public MilitaryAirplane(){}
	
	public MilitaryAirplane(String missilesType, String machineGunType, String flaresType, int maxVelocity)
	{
		this.missilesType = missilesType;
		this.machineGunType = machineGunType;
		this.flaresType = flaresType;
		this.maxVelocity = maxVelocity;
	}

	public String getMissilesType() {
		return missilesType;
	}

	public void setMissilesType(String missilesType) {
		this.missilesType = missilesType;
	}

	public String getMachineGunType() {
		return machineGunType;
	}

	public void setMachineGunType(String machineGunType) {
		this.machineGunType = machineGunType;
	}

	public String getFlaresType() {
		return flaresType;
	}

	public void setFlaresType(String flaresType) {
		this.flaresType = flaresType;
	}	
}
/*
public void setMissile() {}
public void shoot() {}

*/