import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Matériaux extends Object { //incorporer les résistances dans les matériaux etc...
	
	public static String[] refTextures= getTextures();
	protected double resistance ;
	protected String texture ;
	protected Image img ;
	protected double x;
	protected double y;
	protected double centreX;
	protected double centreY;
	
	public Matériaux (double x1, double y1, double resist, int refTexture) {
		super();
		this.x = x1 ;
		this.y = y1;
		this.resistance = resist ;
		
		APoint p = this.barycenter();
		this.centreX = p.x;
		this.centreY = p.y;
		
		//trouve la texture correspondante
		for (int i = 0; i < refTextures.length; i++) {
			if(i == refTexture) {
				this.texture = refTextures[i];
			}
		}
		this.img = Toolkit.getDefaultToolkit().getImage(this.texture); //intégration directe de l'image dans le matériaux plus simple
		
	}
	
	/* méthode attribuant une texture à une valeur
	pour info les textures c'est du 50 par 50 pixels pour vous aider avec les coordonnées !!!
	*/
	private  static String[] getTextures(){
		refTextures= new String[8];
		
		refTextures[1]="./images/bois.png";
		refTextures[2]="./images/bois2.png";
		
		refTextures[3]="./images/brique.png";
		refTextures[4]="./images/pierre.png";
		
		return refTextures;
	}
	
	public void dessiner ( Graphics g ) {
		
	}
	
	public void action () {
		
	}
	
	//méthodes ajoutées par héritance à voir plus tard si utiles ou non
	@Override
	public APoint barycenter() {
		APoint p = new APoint(this.x+25.0,this.y+25.0);
		return p;
	}

	@Override
	public double[] force() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
