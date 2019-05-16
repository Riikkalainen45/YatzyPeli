package day1;
import java.util.Scanner;
public class YatzyPeli {



			public static void main(String[] args) {
				
				// Switch valikko yatzy vaihtoehdoille ja summien tallentaminen
				
					Scanner lukija = new Scanner(System.in);

					int pisteet= 0;
					int kierros = 0;
							
					//Peli jatkuu, kunnes kaikki 15 kierrosta on pelattu
					
					while (kierros < 15) {
						
					//Peli arpoo viisi numeroa v‰lilt‰ 1-6 
						
					int[] noppa = new int[5];
					
					vaihtoehdot();
					
					for(int i =0; i<noppa.length; i++) {
						noppa[i] = 1 + (int)(Math.random() * 6);
					}
						for(int i = 0; i <noppa.length; i++) {
						System.out.print("  " + noppa[i]);
						}
						
						System.out.println();
						System.out.println();
						System.out.println("Valintasi on numero? ");
						int valinta = lukija.nextInt();
						
				    switch (valinta) {
				      case 1:	
				    	 int ykkˆset=0;
				    	  //Etsit‰‰n kaikki numerot 1 ja lasketaan niiden m‰‰r‰.
						for (int y = 0; y < 5; y++) {
							if (noppa[y] == 1) {
								ykkˆset++;					
							}
						}
						System.out.println("ykkˆsi‰ lˆytyi " + ykkˆset);
						pisteet = ykkˆset+pisteet;
						System.out.println("Sinulla on " + pisteet + " pistett‰");
						kierros++;
				         break;
						  
						
				      case 2:
				    	  int kakkoset=0;
							for (int y = 0; y < 5; y++) {
								if (noppa[y] == 2) {
									kakkoset++;
								}
							}
							System.out.println("kakkosia lˆytyi " + kakkoset);
							pisteet = kakkoset*2+pisteet;
							System.out.println("Sinulla on " + pisteet + " pistett‰");
							kierros++;
							break;
			    	 
				      case 3:
				    	  int kolmoset =0;
							for (int y = 0; y < 5; y++) {
								if (noppa[y] == 3) {
									kolmoset++;
								}
							}
							
							System.out.println("Kolmosia lˆytyi " + kolmoset);
							pisteet = kolmoset*3+pisteet;
							System.out.println("Sinulla on " + pisteet + " pistett‰");
							kierros++;
							break;
			    	 
				      case 4:
				    	  int neloset =0;
							for (int y = 0; y < 5; y++) {
								if (noppa[y] == 4) {
									neloset++;
								}
							}
							
							System.out.println("Nelosia lˆytyi " + neloset);
							pisteet = neloset*4+pisteet;
							System.out.println("Sinulla on " + pisteet + " pistett‰");
							kierros++;
							break;
						
				      case 5:
				    	  int vitoset=0;
							for (int y = 0; y < 5; y++) {
								if (noppa[y] == 5) {
									vitoset++;
								}
							}
							System.out.println("Vitosia lˆytyi " + vitoset);
							pisteet = vitoset*5+pisteet;
							System.out.println("Sinulla on " + pisteet + " pistett‰");
							kierros++;
							break;
							
				      case 6:
				    	  int kutoset=0;
							for (int y = 0; y < 5; y++) {
								if (noppa[y] == 6) {
									kutoset++;
								}
							}
							
							System.out.println("Kutosia lˆytyi " + kutoset);
							pisteet = kutoset*6+pisteet;
							System.out.println("Sinulla on " + pisteet + " pistett‰");
							kierros++;
							break;
							
				      case 7:
				    	  int yksipari = yksiPari(noppa);
				    	  int paripisteet = 2*yksiPari(noppa);
				    	  
				    	  if (yksipari>0) {
				    		  System.out.println("Pari! Saat " + paripisteet+ " pistett‰");
				    	  pisteet = paripisteet+pisteet;
						  System.out.println("Sinulla on nyt " +pisteet+ " pistett‰");
						  kierros++;
						  }
				    	  else {
				    		  System.out.println("Ei ollut paria. Et saanut pisteit‰.");
				    		  kierros++;
				    	  }
						  
				        break;
				    	  
				      case 8:
					     int kaksipisteet = kaksiPari(noppa);
					     System.out.println("Kaksi paria! Saat " + kaksipisteet+ " pistett‰");
					     pisteet = kaksipisteet+pisteet;
						  System.out.println("Sinulla on nyt " +pisteet+ " pistett‰");
						  kierros++;
						  					  				     
					     break;
					     
					  case 9:
						  int kolmiluku = kolmiLuku(noppa);
						  if (kolmiluku > 0) {
						   int kolmilukupisteet = 3*kolmiluku;
						  System.out.println("Kolminumero! Saat " + kolmilukupisteet+ " pistett‰");
						  pisteet = kolmilukupisteet+pisteet;
						  System.out.println("Sinulla on nyt " +pisteet+ " pistett‰");
						  kierros++;
						  }
						  
						  else {
						   System.out.println("Ei ollut kolmiluku. :/");
						   kierros++;
						  }

					     break;
					   case 10:
						   int neliluku = kolmiLuku(noppa);
						   if (neliluku > 0) {
						    int nelilukupisteet = 4*neliluku;
						   System.out.println("Nelinumero! Saat " + nelilukupisteet+ " pistett‰");
						   pisteet = nelilukupisteet+pisteet;
						   System.out.println("Sinulla on nyt " +pisteet+ " pistett‰");
						   kierros++;
						   }
						   
						   else {
						    System.out.println("Ei ollut neliluku. :/");
						    kierros++;
						   }


					     break;
					     
					   case 11:
						 
						 if (pieniSuora(noppa) == true) {
						  pisteet=pisteet+15;
						  System.out.println("Pieni suora! Sait 15 pistett‰. Nyt sinulla on: " + pisteet +" pistett‰.");
						  kierros++;
						 }
						 else {
						  System.out.println("Ei ollut pieni suora, et saanut yht‰‰n pistett‰.");
						  kierros++;
						 } 				 					
					        
					        break;
					    case 12:
					    	 
							 if (suuriSuora(noppa) == true) {
							  pisteet=pisteet+20;
							  System.out.println("Suuri suora! Sait 20 pistett‰. Nyt sinulla on: "+ pisteet+" pistett‰.");
							  kierros++;
							 }
							 else {
							  System.out.println("Ei ollut suuri suora, et saanut yht‰‰n pistett‰.");
							  kierros++;
							 }

					        
					        break;
					        
					    case 13:
					    	System.out.println("T‰ysi k‰si!");
				    		  int summa13=0;
				    		  for (int i=0; i<5; i++) {
				    			  summa13 = noppa[i]+summa13;
				    		  }
				    		  pisteet= summa13+pisteet;
				    		  System.out.println("Sinulla on " + pisteet + " pistett‰");
				    		  kierros++;
					
			
					        break;
					        
					    case 14:
					    	 System.out.println("Sattuma");
				    		  int summa14=0;
				    		  for (int i=0; i<5; i++) {
				    			  summa14 = noppa[i]+summa14;
				    		  }
				    		  pisteet= summa14+pisteet;
				    		  System.out.println("Sinulla on " + pisteet + " pistett‰");
				    		  kierros++;
					
						     break;
						     
						case 15:
							 if (yatzy(noppa) == true) {
							  pisteet=pisteet+50;
							  System.out.println("Yatzy! Sait 50 pistett‰. Nyt sinulla on: "+pisteet+" pistett‰.");
							  kierros++;
							 }
							 else {
							  System.out.println("ƒl‰ yrit‰ huijata! Eih‰n se mik‰‰n yatzy ollut.");
							  kierros++;
							 }
						     break;
				    }
				}
					
					System.out.println();
					System.out.println("-------------------------------------------------");
					System.out.println("Peli loppui. Sait yhteens‰ " +pisteet+ " pistett‰.");
					System.out.println("Hienosti meni!");
					
			}
			
			
			
			
			/**
			 * T‰m‰ metodi tulostaa vaihtoehdot
			 */
			public static void vaihtoehdot() {
				System.out.println();
				System.out.println();
				System.out.println("-------------------------------------------------");
				System.out.println("1.  Ykkˆset ");
				System.out.println("2.  Kakkoset");
				System.out.println("3.  Kolmoset");
				System.out.println("4.  Neloset");
				System.out.println("5.  Viitoset");
				System.out.println("6.  Kuutoset");
				System.out.println("7.  Yksi pari");
				System.out.println("8.  Kaksi paria");
				System.out.println("9.  Kolmiluku");
				System.out.println("10. Neliluku");
				System.out.println("11. Pieni suora");
				System.out.println("12. Suuri suora");
				System.out.println("13. T‰ysi k‰si");
				System.out.println("14. Sattuma");
				System.out.println("15. Yatzy");
				System.out.println();
				
			}
			
			/**
			 * T‰m‰ metodi lˆyt‰‰ kaksi paria ja palauttaa niist‰ saadut pisteet
			 * @param noppa
			 * @return
			 */
			 public static int kaksiPari( int[]noppa){
				 
				 int pari=0;
				 
				  java.util.Arrays.sort(noppa);
				  
				  if(noppa[4]==noppa[3]&&noppa[2]==noppa[1]) {
					  pari = 2* noppa[4]+  2*noppa[3];
					  
					  }
				  if(noppa[4]==noppa[3]&&noppa[1]==noppa[0]) {
					  pari = 2*noppa[4] + 2*noppa[1];
					  
					  }
				  if(noppa[3]==noppa[2]&&noppa[1]==noppa[0]) {
					  pari = 2*noppa[3]+ 2*noppa[1];
					  
					  } 
				  if (pari > 0) {
					  return pari;
				  }
				  else {
					  return 0;
				  }

			 }
			
			 /**
			  * Lˆyt‰‰ suuremman parin ja palauttaa sen arvon
			  * @param noppa
			  * @return
			  */
			 public static int yksiPari( int[]noppa){
				 
		    	  java.util.Arrays.sort(noppa);
		    	  if(noppa[4]==noppa[3]) {
	    			  return(noppa[4]);
		    	  }
	    		  if(noppa[3]== noppa[2]) {
	    			 return(noppa[3]);
	    		  }
	    		  if(noppa[2]==noppa[1]) {
	    			  return(noppa[2]);
	    		  }
	    		  if(noppa[1]==noppa[0]) {
	    			  return(noppa[1]);
	    		  }
	    		  else {
	    			  return 0;
	    		  }
	    	  }
			/**
			 * Testaa kolmiluvun ja laskee niist‰ saadut pisteet
			 * @param noppa
			 * @return
			 */
			public static int kolmiLuku(int[]noppa){
				 
			     java.util.Arrays.sort(noppa); //j‰rjestet‰‰n taulu
			     for(int i=0;i<noppa.length-3;i++)
			     {
			       if(noppa[i]==noppa[i+1] ? noppa[i+1]==noppa[i+2] : false)
			        {
			           return noppa[i];
			         }
			     }
			     return 0;
			}

			/**
			 * Etsit‰‰n neliluku ja palautetaan saadut pisteet
			 * @param noppa
			 * @return
			 */
			public static int neliLuku(int[]noppa){
				 
				 java.util.Arrays.sort(noppa); //j‰rjestet‰‰n taulu
				 //Joko ensimm‰inen tai viimeinen luku on poikkeava
				 if(noppa[0] != noppa[1] || noppa[3] != noppa[4]) {
				  return noppa[2];
				 }
				 else {
				  return 0;
				 }
				}
			
	/**
	 * Testaa, onko kyseess‰ pieni suora, palauttaa boolean arvon
	 * @param noppa
	 * @return
	 */
		public static boolean pieniSuora( int[]noppa){
		 //Testataan, onko heitoissa samoja lukuja
		    for(int i = 0; i < noppa.length - 1; i++){
		         for (int j = i + 1; j < noppa.length; j++){
		             if (noppa[i] == noppa[j])
		                 //jos lˆytyy samoja, kyseess‰ ei ole suora, eli "vastaus" on v‰‰rin.
		              return false;
		         }
		    }
		    //varmistetaan viel‰, ett‰ kyseess‰ on pieni suora, eli ett‰ heitoista lˆytyy ykkˆnen
		    if (noppa[0] == 1 || noppa[1]== 1 || noppa[2] == 1 || noppa[3] == 1 || noppa[4] ==1) {
		    return true;}
		    
		    else {
		     return false;
		    }
		}
		
		/**
		 * Testaa, onko kyseess‰ suuri suora, palauttaa boolean arvon
		 * @param noppa
		 * @return
		 */
		 public static boolean suuriSuora( int[]noppa){
			 //Testataan, onko heitoissa samoja lukuja
			    for(int i = 0; i < noppa.length - 1; i++){
			         for (int j = i + 1; j < noppa.length; j++){
			             if (noppa[i] == noppa[j])
			                 //jos lˆytyy samoja, kyseess‰ ei ole suora, eli "vastaus" on v‰‰rin.
			              return false;
			         }
			    }
			    //varmistetaan viel‰, ett‰ kyseess‰ on suuri suora, eli ett‰ heitoista lˆytyy kutonen
			    if (noppa[0] == 6 || noppa[1]== 6 || noppa[2] == 6 || noppa[3] == 6 || noppa[4] ==6) {
			    return true;}
			    
			    else {
			     return false;
			    }
			}
		 
		 /**
		  * Testaa, onko kyseess‰ yatzy ja palauttaa boolean arvon
		  * @param noppa
		  * @return
		  */
			public static boolean yatzy( int[]noppa){
				 //Testataan, onko heitoissa samoja lukuja
				    for(int i = 0; i < noppa.length - 1; i++){
				         for (int j = i + 1; j < noppa.length; j++){
				             if (noppa[i] == noppa[j])
				                 //jos lˆytyy samoja, jatketaan.
				              continue;
				             //jos ei lˆydy samoja lukuja, ei ole yatzy
				             else
				              return false;
				         }
				    }
				    // Jos kaikki silm‰luvut ovat samoja, "vastaus" on oikein.
				    return true;
				}
	}


}
