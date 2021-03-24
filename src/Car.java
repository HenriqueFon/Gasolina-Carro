
public class Car {
    //carro1
	private int Ltanque;
	private int tipo;
	private int tanque=0;
	private int dist=0;
	
	public Car(int Ltanque,int tipo) {
		this.Ltanque=Ltanque;
		this.tipo=tipo;
	}
	

	//carro1
	//getters and setters
	public int getLtanque() {
		return Ltanque;
	}
	
	
	//getters and setters
	public int getTipo() {
		return tipo;
	}
	
	
	//Carro
	//Abastecer Carro
	public int abastecerCarro(int combus) {
		tanque=tanque+combus;
		if(tanque>Ltanque) {
			this.tanque=tanque;
		}
		
		return tanque;
	}
	
	
	//mover carro
	public void moverCarro(int meta) {
		if(tipo==1) {
			if(tanque>0) {
				while(dist<=meta&&tanque>0) {
					
					tanque=tanque-7;
					dist=dist+7;
					
				}
				
			}
			else {
				System.out.println("O tanque está vazio");
			}
			System.out.println("A distância percorrida foi: "+dist);
			System.out.println("Tanque de Álcool: "+tanque);
			
		}
		else if(tipo==2) {
			if(tanque>0) {
				while(dist<meta&&tanque>0) {
					tanque=tanque-10;
					dist=dist+10;
				}
				
			}
			else {
				System.out.println("O tanque está vazio");
			}
			System.out.println("A distância percorrida foi: "+dist);
			System.out.println("Tanque de Gasolina: "+tanque);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
