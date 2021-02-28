public class StateMaranatha implements IState {
	private IMobil mob;
	
	public StateMaranatha(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		return "U: dari maranatha ga bisa ke utara";
	}

	@Override
	public String keSelatan() {
		mob.setState(mob.getRumahState());
		return "S: dari maranatha ke rumah";
	}

	@Override
	public String keBarat() {
		mob.setState(mob.getBengkelState());
		return "B: dari maranatha ke bengkel";
	}

	@Override
	public String keTimur() {
		mob.setState(mob.getPomBensinState());
		return "T: dari maranatha ke pom bensin";
	}
}
