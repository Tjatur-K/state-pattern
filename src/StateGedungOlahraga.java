public class StateGedungOlahraga implements IState{
	private IMobil mob;
	
	public StateGedungOlahraga(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		mob.setState(mob.getBengkelState());
		return "U: dari gedung olahraga ke bengkel";
	}

	@Override
	public String keSelatan() {
		return "S: dari gedung olahraga nggak bisa ke selatan";
	}

	@Override
	public String keBarat() {
		return "B: dari gedung olahraga nggak bisa ke barat";
	}

	@Override
	public String keTimur() {
		mob.setState(mob.getRumahState());
		return "T: dari gedung olahraga ke rumah";
	}
}
