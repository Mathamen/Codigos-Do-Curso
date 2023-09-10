
public class Circo {
	public static void main(String args[]) {
		String N= "ola";
		Animal k[]= new Animal[3];
		Animal [] x= {new Leao(N), new Urso(N)};
		correrTudo(x);
		Leao A= new Leao("Simba");
		System.out.println();
		A.idade= 2;
		System.out.println(A.toString());
		
	}
	public static void correrTudo(Animal y[]) {
		for (int i=0; i<y.length; i++) {
			if (y[i] instanceof Leao){ 
				( (Leao)y[i] ).rugir();
				// ou
				// Leao u= (Leao)y[i];
				//u.rugir;
			}
			y[i].correr();
			System.out.println(y[i].toString());
		}
	}
}
