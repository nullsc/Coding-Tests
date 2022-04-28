/******************************************************************************

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		//waterbody test = new waterbody("Pool");
		
		still sea = new still("North Sea", false);
        river r1 = new river("Thames", sea);
        river r2 = new river("Lea", r1);
        System.out.println(r2);
        System.out.println(r1.hasFresh());
        System.out.println(sea.hasFresh());
	}
}
