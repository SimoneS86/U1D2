
public class MyMane2 {

	public static void main(String[] args) {
		SIM nuovaSIM = new SIM("1234567890");
        nuovaSIM.stampaDati();
        
        SIM simConChiamate = new SIM("333003435311", 15.0, new String[]{"12331234567", "7887654321", "3467468456", null, null}, new int[]{2, 7, 13, 0, 0});
        simConChiamate.stampaDati();
	}

}
