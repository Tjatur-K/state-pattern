import java.util.Random;

public class TestMobil {
	Mobil mobil;
	
	public static void main(String[] args) {
		TestMobil t = new TestMobil();
	}

	public TestMobil()
	{
		mobil = new Mobil();
		Random r = new Random(System.currentTimeMillis());
		
		do {
			int z = r.nextInt(4);
			if (z == 0) mobil.keUtara();
			if (z == 1) mobil.keSelatan();
			if (z == 2) mobil.keBarat();
			if (z == 3) mobil.keTimur();
		} while (mobil.getState() != mobil.getRumahState());
	}
}
