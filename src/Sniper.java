import comportement.*;

public class Sniper extends Personnage {
	
	  public Sniper(){
		    this.espritCombatif = new FusilSniper();
		  }
		  public Sniper(EspritCombatif esprit, Soin soin, Deplacement dep) {
		    super(esprit, soin, dep);
		  }
}