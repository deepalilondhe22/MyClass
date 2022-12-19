package DimondAmbiguity;

public class Pune implements Baramati,Satara {

	public static void main(String[] args) {
      
		Pune p = new Pune();
	    p.Market();
	    p.DinkalaNiwas();
	    p.KrahaRiver();
	    p.PanchwadMarket();
	    p.KrishaRiver();
	    
	    // Stataic method use
	    Satara.WildFlower();
	    Baramati.Digital();
      
	}

	@Override
	public void KrishaRiver() {
		System.out.println("Satara Famous River is KrishaRiver");
		
	}

	@Override
	public void PanchwadMarket() {
		
		System.out.println("Satara Famous Market  is PanchwadMarket ");
	}

	@Override
	public void KrahaRiver() 
	{
		System.out.println("Baramati Famous River  is Krahariver ");
	}
	

	@Override
	public void DinkalaNiwas()
	{
		System.out.println("Beautifull house in BAARAMATI");
		
	}

	@Override
	public void Market() {
		Satara.super.Market();
		Baramati.super.Market();
	}

}
