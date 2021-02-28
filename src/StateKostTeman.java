public class StateKostTeman implements IState {
	private IMobil mob;
	
	public StateKostTeman(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		mob.setState(mob.getRumahState());
		return "U: dari kost teman ke rumah";
	}

	@Override
	public String keSelatan() {
		return "S: dari kost teman ga bisa ke selatan";
	}

	@Override
	public String keBarat() {
		return "B: dari kost teman ga bisa ke barat";
	}

	@Override
	public String keTimur() {
		return "T: dari kost teman ga bisa ke timur";
	}
}
