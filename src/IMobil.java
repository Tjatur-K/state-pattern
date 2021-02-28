public interface IMobil {
	public void keUtara();
	public void keSelatan();
	public void keBarat();
	public void keTimur();
	
	public IState getBengkelState();
	public IState getGedungOlahragaState();
	public IState getKostTemanState();
	public IState getMallState();
	public IState getMaranathaState();
	public IState getPomBensinState();
	public IState getRumahState();
	
	public void setState(IState s);
	public IState getState();
}
