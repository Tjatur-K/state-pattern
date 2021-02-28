public class Mobil implements IMobil {
	IState bengkel;
	IState gedungOlahraga;
	IState kostTeman;
	IState mall;
	IState maranatha;
	IState pomBensin;
	IState rumah;
	IState now;
	
	public Mobil() {
		bengkel = new StateBengkel(this);
		gedungOlahraga = new StateGedungOlahraga(this);
		kostTeman = new StateKostTeman(this);
		mall = new StateMall(this);
		maranatha = new StateMaranatha(this);
		pomBensin = new StatePomBensin(this);
		rumah = new StateRumah(this);
		now = rumah;
	}
	
	public void keUtara(){
		System.out.println(now.keUtara());
	}
	public void keSelatan(){
		System.out.println(now.keSelatan());
	}
	public void keBarat(){
		System.out.println(now.keBarat());
	}
	public void keTimur(){
		System.out.println(now.keTimur());
	}
	
	public IState getBengkelState(){
		return bengkel;
	}
	public IState getGedungOlahragaState(){
		return gedungOlahraga;
	}
	public IState getKostTemanState(){
		return kostTeman;
	}
	public IState getMallState(){
		return mall;
	}
	public IState getMaranathaState(){
		return maranatha;
	}
	public IState getPomBensinState(){
		return pomBensin;
	}
	public IState getRumahState(){
		return rumah;
	}
	
	public void setState(IState s){
		now = s;
	}
	public IState getState(){
		return now;
	}
}
