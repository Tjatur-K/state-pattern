public class StateRumah implements IState {
	private IMobil mob;
	
	public StateRumah(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		mob.setState(mob.getMaranathaState());
		return "U: dari rumah ke maranatha";
	}

	@Override
	public String keSelatan() {
		mob.setState(mob.getKostTemanState());
		return "S: dari rumah ke kost teman";
	}

	@Override
	public String keBarat() {
		mob.setState(mob.getGedungOlahragaState());
		return "B: dari rumah ke gedung olahraga";
	}

	@Override
	public String keTimur() {
		mob.setState(mob.getMallState());
		return "T: dari rumah ke mall";
	}
}
