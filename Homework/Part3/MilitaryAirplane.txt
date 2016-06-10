abstract class MilitaryAirplane extends Planes {
			private String missiles;		
			private String machineGun;
			private String flares;
	
	public String getMissiles() {
		return missiles;
		}
	public void setMissiles(String newMissiles) {
		missiles=newMissiles;
		}			
			
	public String getMachineGun() {
		return machineGun;
		}
	public void setMachineGun(String newMachineGun) {
		machineGun=newMachineGun;
		}	
			
	public String getFlares() {
		return flares;
		}
	public void setFlares(String newFlares) {
		flares=newFlares;
		}
	
	public void setMissile() {}
	public void shoot() {}
	
}