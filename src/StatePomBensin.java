public class StatePomBensin implements IState {
	private IMobil mob;
	
	public StatePomBensin(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		return "U: dari pom bensin nggak bisa ke utara";
	}

	@Override
	public String keSelatan() {
		mob.setState(mob.getMallState());
		return "S: dari pom bensin ke mall";
	}

	@Override
	public String keBarat() {
		mob.setState(mob.getMaranathaState());
		return "B: dari pom bensin ke maranatha";
	}

	@Override
	public String keTimur() {
		return "T: dari pom bensin nggak bisa ke timur";
	}
}
