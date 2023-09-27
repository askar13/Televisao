package Televisao;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		Scanner teclado = new Scanner(System.in);
		
		int volume, canal;
		
		TV tv = new TV(1, 5);
		
		int seleciona;
	    do {
	     	System.out.printf("\n%15s\n\n","Controle");
	        System.out.println("1>> Ligar/Desligar");
	        System.out.println("2>> Aumentar volume");
	        System.out.println("3>> Diminuir volume");
	        System.out.println("4>> Aumentar canal");
	        System.out.println("5>> Diminuir canal");
	        System.out.println("6>> Encerrar programa");
	        System.out.printf("\nSelecione uma opção>> ");
	        seleciona = teclado.nextInt();
	        
	        switch (seleciona){
	        	case 1:
	        		if (!tv.getLigado()) {
	        			tv.setLigado(true);
	                	System.out.println("\nSua televisão está ligada.");
	                	break;
	                } else if (tv.getLigado()){
	                	tv.setLigado(false);
	                	System.out.println("\nSua televisão está desligada.");
	                }
	        		break;
	        		
	            case 2:
	            if (!tv.getLigado()) {
		            	System.out.println("\nSua televisão está desligada.");

		            } else if (tv.getLigado()) {
		            	controle.aumentarVolume();
		            	volume = tv.getVolume();
		            	System.out.printf("Volume atual é %d", volume);
			        }    
		            break;
		            
	            case 3:
	            	if (!tv.getLigado()) {
	            		System.out.println("\nSua televisão está desligada.");

		            } else if (tv.getLigado()) {
		            	controle.diminuirVolume();
		            	volume = tv.getVolume();
		            	System.out.printf("Volume atual é %d", volume);
		            }	
		            break;
		            
	            case 4:
	            	if (!tv.getLigado()) {
	            		System.out.println("\nSua televisão está desligada.");
	
            	} else if (tv.getLigado()) {
	            		controle.aumentarCanal();
	            		canal = tv.getCanal();
	            		System.out.printf("Canal atual é %d", canal);
					}
	            	break;
	            	
	            case 5:
	            	if (!tv.getLigado()) {
	            		System.out.println("\nSua televisão está desligada.");

	            	} else if (tv.getLigado()) {
            		controle.diminuirCanal();
            		canal = tv.getCanal();
            		System.out.printf("Canal atual é %d", canal);
	            	}
	            	break;
	            	
	            case 6:
            	System.out.println("\nPrograma finalizado. Até a próxima");
                  break;
                  
	            default:
	            	System.out.println("\nVocê selecionou uma opção inválida.");
	        }
        } while (seleciona != 6);
    
	    teclado.close();
	}
}
