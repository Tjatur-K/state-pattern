public class StateBengkel implements IState {
	private IMobil mob;
	
	public StateBengkel(IMobil m){
		mob = m;
	}	
	
	@Override
	public String keUtara() {
		return "U: dari bengkel nggak bisa ke utara";
	}

	@Override
	public String keSelatan() {
		mob.setState(mob.getGedungOlahragaState());
		return "S: dari bengkel ke gedung olahraga";
	}

	@Override
	public String keBarat() {
		return "B: dari bengkel ga bisa ke barat";
	}

	@Override
	public String keTimur() {
		mob.setState(mob.getMaranathaState());
		return "T: dari bengkel ke maranatha";
	}
}
