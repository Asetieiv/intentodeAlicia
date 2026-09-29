import java.util.ArrayList;

public class Mundo {
	
	public static void main(String[] args) {	
	}
	
	public ArrayList <Personaje> losPersonajes = new ArrayList<>();
		
    public void agregarPersonajes(Personaje p) {
    	losPersonajes.add(p);
	}
	
    public boolean hayPersonaNormal() {
    	for (Personaje p: losPersonajes) {
    		if (p.esNormal() == true) {
    			return true;
    		}
    	} 
    	return false;
    }

	public ArrayList <Personaje> losPersonajesLindos = new ArrayList<>();
	public ArrayList <Personaje> personajesLindos() {
		for (Personaje p: losPersonajesLindos) {
			
          if (p.esLinde () == true ) {
        	losPersonajesLindos.add(p);

           }
		} return losPersonajesLindos;
		}
	
	public int cuantosEnMaravilla(int maravilloso) {
		for (Personaje p: losPersonajes) {
			if (p.esDeMaravilla() == true) {
				maravilloso += 1;
			}
		}return maravilloso;
	}
	
	public ArrayList <Personaje> losPersonajesLocos = new ArrayList<> ();
	public Personaje mayorLocura() {
		Personaje kevin = new Personaje("kevin", 0,0,0);
		for (Personaje p : losPersonajes) {
			if(p.getLocura() > kevin.getLocura()) {
				p = kevin;
				
			}
		} 
		return kevin;
	}
	
	
	
	
	
}
