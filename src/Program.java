import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		int carroMax=2;
		int conta=0;
		int tipo=0;
		int opcao=0;
		int limiteTanque=0;
		int encher=0;
		int meta=0;
		String str="";
		Car[] Carro=new Car[carroMax];
		carroMax=0;
		//Criar o carro
		while(carroMax<2) {
			System.out.println("Digite o tipo de combustível do carro Nº" +(conta+1) +": " );
			System.out.print("1 para Álcool e 2 para Gasolina: ");
			str=entrada.readLine();
			tipo=Integer.parseInt(str);
			System.out.println("Digite o limite do tanque de combustível: ");
			str=entrada.readLine();
			limiteTanque=Integer.parseInt(str);
			Carro[conta]=new Car(limiteTanque,tipo);
			carroMax++;
			conta++;
		}
        
	    while(opcao!=3) {
	    	System.out.println("1 para abastecer o carro ");
	    	System.out.println("2 para mover o carro ");
	    	System.out.print("Digite a opção desejada: ");
	    	str=entrada.readLine();
	    	opcao=Integer.parseInt(str);
	        switch(opcao) {
	        //Abastecer o carro
	        case 1:
	        	
	        	System.out.print("Qual carro deseja abastecer? 1 ou 2: ");
	            str=entrada.readLine();
	            int opcao2=Integer.parseInt(str);
	            if(opcao2==1) {
	            	System.out.print("Quanto que você deseja encher: ");
	            	str=entrada.readLine();
	            	encher=Integer.parseInt(str);
	            	Carro[0].abastecerCarro(encher);
	            }
	            else if(opcao2==2) {
	            	System.out.print("Quanto que você deseja encher: ");
	            	str=entrada.readLine();
	            	encher=Integer.parseInt(str);
	            	Carro[1].abastecerCarro(encher);
	            }
	            else {
	            	System.out.println("Escolha inexistente");
	            }
	        	
	        	break;
	        	//Mover o carro
	        case 2:
	        	System.out.print("Qual carro deseja mover? 1 ou 2: ");
	        	str=entrada.readLine();
	        	int opcao3=Integer.parseInt(str);
	        	if(opcao3==1) {
	        		System.out.print("Digite a distância que deseja percorrer: ");
	        		str=entrada.readLine();
	        		meta=Integer.parseInt(str);
	        		Carro[0].moverCarro(meta);
	        		
	        	}
	        	else if(opcao3==2) {
	        		System.out.print("Digite a distância que deseja percorrer: ");
	        		str=entrada.readLine();
	        		meta=Integer.parseInt(str);
	        		Carro[1].moverCarro(meta);
	        		
	        	}
	        	break;
	        case 3:
	        	opcao=3;
	        	break;
	        }
	    	
	    }
		

	}

}
