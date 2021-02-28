public class StateMall implements IState {
	private IMobil mob;
	
	public StateMall(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		mob.setState(mob.getPomBensinState());
		return "U: dari mall ke pom bensin";
	}

	@Override
	public String keSelatan() {
		return "S: dari mall nggak bisa ke selatan";
	}

	@Override
	public String keBarat() {
		mob.setState(mob.getRumahState());
		return "B: dari mall ke rumah";
	}

	@Override
	public String keTimur() {
		return "T: dari mall nggak bisa ke timur";
	}
}
