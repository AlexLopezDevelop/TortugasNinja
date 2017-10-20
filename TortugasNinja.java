import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class TORTUGAS_NINJA {
	public static void main(String[] args) {

		TreeSet<String> arbol2 = new TreeSet<String>();
		
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			int opcion = 7;
			int nmalos = 0;
			int ninocentes = 0;
			int error = 1;
			int error2 = 1;
			int error3 = 1;
			int stopvaloracion1 = 0;
			int stopvaloracion2 = 0;
			int stopvaloracion3 = 0;
			int stopvaloracion4 = 0;
			double valoraciondiaria1 = 0;
			double valoraciondiaria2 = 0;
			double valoraciondiaria3 = 0;
			double valoraciondiaria4 = 0;
			double realizacion1 = 0;
			double realizacion2 = 0;
			double realizacion3 = 0;
			double realizacion4 = 0;

			while (opcion != 0) {
				System.out.println("==================");
				System.out.println("= Menu Principal =");
				System.out.println("==================");
				System.out.println("                  ");
				System.out.println("[1] Registrar Malos");
				System.out.println("[2] Registrar Inocentes");
				System.out.println("[3] Registrar Realizacion");
				System.out.println("[4] Grado de incidencia de la ciudad");
				System.out.println("[5] Ver equilibrio");
				System.out.println("[6] Mejorar realizacion");
				System.out.println("[7] Ranking realizacion");
				System.out.println("[0] Salir");
				System.out.println("                  ");
				System.out.println("Seleciona una opcion:");
				String opcion1 = buffer.readLine();
				opcion = Integer.parseInt(opcion1);

				switch (opcion) {

				case 1:

					System.out.println("Cantidad de malos desarmados");
					String nm = buffer.readLine();
					nmalos = Integer.parseInt(nm);

					while (error > 0) {
						if (nmalos > 0) {
							error = 0;
						} else {
							error++;
							System.out.println("Error al introducir Numero de malos");
							System.out.println("-----------------------------------");
							System.out.println("Cantidad de malos desarmados");
							nm = buffer.readLine();
							nmalos = Integer.parseInt(nm);
						}
					}

					break;

				case 2:

					System.out.println("Cantidad de inocentes salvados");
					String ni = buffer.readLine();
					ninocentes = Integer.parseInt(ni);

					while (error > 0) {
						if (ninocentes > 0) {
							error = 0;
						} else {
							error++;
							System.out.println("Error al introducir Numero de inocentes");
							System.out.println("-----------------------------------");
							System.out.println("Cantidad de inocentes salvados");
							ni = buffer.readLine();
							ninocentes = Integer.parseInt(ni);
						}
					}

					break;

				case 3:
					error2 = 1;
					while (error2 > 0) {
						System.out.println("Introduce usuario:");
						String usuario = buffer.readLine();

						if (usuario.toUpperCase().equals("LEONARDO")) {
							error2 = 0;
							if (stopvaloracion1 > 0)
								System.out.println("Solo puedes introducir una vez la valoracion diaria");
							else {
								System.out.println("Valoracion diaria");
								String vd1 = buffer.readLine();
								valoraciondiaria1 = Double.parseDouble(vd1);
								stopvaloracion1++;
								while (valoraciondiaria1 > 10 || valoraciondiaria1 < 0) {
									System.out.println("Error valoracion diaria [0-10]");
									System.out.println("------------------------------");
									System.out.println("Valoracion diaria");
									vd1 = buffer.readLine();
									valoraciondiaria1 = Double.parseDouble(vd1);
								}
							}
						}

						else if (usuario.toUpperCase().equals("MICHELANGELO")) {
							error2 = 0;
							if (stopvaloracion2 > 0)
								System.out.println("Solo puedes introducir una vez la valoracion diaria");
							else {
								System.out.println("Valoracion diaria");
								String vd2 = buffer.readLine();
								valoraciondiaria2 = Double.parseDouble(vd2);
								stopvaloracion2++;
								while (valoraciondiaria2 > 10 || valoraciondiaria2 < 0) {
									System.out.println("Error valoracion diaria [0-10]");
									System.out.println("------------------------------");
									System.out.println("Valoracion diaria");
									vd2 = buffer.readLine();
									valoraciondiaria2 = Double.parseDouble(vd2);
								}
							}
						}

						else if (usuario.toUpperCase().equals("DONATELLO")) {
							error2 = 0;
							if (stopvaloracion3 > 0)
								System.out.println("Solo puedes introducir una vez la valoracion diaria");
							else {
								System.out.println("Valoracion diaria");
								String vd3 = buffer.readLine();
								valoraciondiaria3 = Double.parseDouble(vd3);
								stopvaloracion3++;
								while (valoraciondiaria3 > 10 || valoraciondiaria3 < 0) {
									System.out.println("Error valoracion diaria [0-10]");
									System.out.println("------------------------------");
									System.out.println("Valoracion diaria");
									vd3 = buffer.readLine();
									valoraciondiaria3 = Double.parseDouble(vd3);
								}
							}
						}

						else if (usuario.toUpperCase().equals("RAPHAEL")) {
							error2 = 0;
							if (stopvaloracion4 > 0)
								System.out.println("Solo puedes introducir una vez la valoracion diaria");
							else {
								System.out.println("Valoracion diaria");
								String vd4 = buffer.readLine();
								valoraciondiaria4 = Double.parseDouble(vd4);
								stopvaloracion4++;
								while (valoraciondiaria4 > 10 || valoraciondiaria4 < 0) {
									System.out.println("Error valoracion diaria [0-10]");
									System.out.println("------------------------------");
									System.out.println("Valoracion diaria");
									vd4 = buffer.readLine();
									valoraciondiaria4 = Double.parseDouble(vd4);
								}
							}
						}

						else {
							System.out.println("Error al introducir usuario [leonardo-michelangelo-donatello-raphael]");
							System.out.println("---------------------------------------------------------------------");
						}
					}
					break;

				case 4:
					
					if(nmalos==0) System.out.println("Primero introduce el numero de malos");
					else System.out.println("El grado de incidencia de la ciudad es: "+Math.sqrt(nmalos));
					
					break;
					
				case 5:
					
					if(ninocentes==nmalos)System.out.println("Equilibrio de la ciudad: Neutro");
					else if (ninocentes>nmalos)System.out.println("Equilibrio de la ciudad: Positivo");
					else if (ninocentes<nmalos)System.out.println("Equilibrio de la ciudad: Negativo");
					
					break;
					
				case 6:
					
					error3 = 1;
					while (error3 > 0) {
						System.out.println("Introduce usuario:");
						String usuario = buffer.readLine();

						if (usuario.toUpperCase().equals("LEONARDO")) {
							error3 = 0;
							System.out.println("Introduce Realizacion:");
							String realiz1 = buffer.readLine();
							realizacion1 = Double.parseDouble(realiz1);
							while(realizacion1+valoraciondiaria1>10){
								System.out.println("Error realizacion no puede superar 10 Actual: "+(realizacion1+valoraciondiaria1));
								System.out.println("-------------------------------------------------");
								System.out.println("Introduce Realizacion:");
								realiz1 = buffer.readLine();
								realizacion1 = Double.parseDouble(realiz1);
							}
						}

						else if (usuario.toUpperCase().equals("MICHELANGELO")) {
							error3 = 0;
							System.out.println("Introduce Realizacion:");
							String realiz2 = buffer.readLine();
							realizacion2 = Double.parseDouble(realiz2);
							while(realizacion2+valoraciondiaria2>10){
								System.out.println("Error realizacion no puede superar 10 Actual: "+(realizacion2+valoraciondiaria2));
								System.out.println("-------------------------------------------------");
								System.out.println("Introduce Realizacion:");
								realiz2 = buffer.readLine();
								realizacion2 = Double.parseDouble(realiz2);
							}
						}

						else if (usuario.toUpperCase().equals("DONATELLO")) {
							error3 = 0;
							System.out.println("Introduce Realizacion:");
							String realiz3 = buffer.readLine();
							realizacion3 = Double.parseDouble(realiz3);
							while(realizacion3+valoraciondiaria3>10){
								System.out.println("Error realizacion no puede superar 10 Actual: "+(realizacion3+valoraciondiaria3));
								System.out.println("-------------------------------------------------");
								System.out.println("Introduce Realizacion:");
								realiz3 = buffer.readLine();
								realizacion3 = Double.parseDouble(realiz3);
							}
						}

						else if (usuario.toUpperCase().equals("RAPHAEL")) {
							error3 = 0;
							System.out.println("Introduce Realizacion:");
							String realiz4 = buffer.readLine();
							realizacion4 = Double.parseDouble(realiz4);
							while(realizacion4+valoraciondiaria4>10){
								System.out.println("Error realizacion no puede superar 10 Actual: "+(realizacion4+valoraciondiaria4));
								System.out.println("-------------------------------------------------");
								System.out.println("Introduce Realizacion:");
								realiz4 = buffer.readLine();
								realizacion4 = Double.parseDouble(realiz4);
							}
						}

						else {
							System.out.println("Error al introducir usuario [leonardo-michelangelo-donatello-raphael]");
							System.out.println("---------------------------------------------------------------------");
						}
					}
					
					break;
					
				case 7:
					
						arbol2.add(realizacion1+valoraciondiaria1+" LEONARDO"); 
						arbol2.add(realizacion2+valoraciondiaria2+" MICHELANGELO");  
						arbol2.add(realizacion3+valoraciondiaria3+" DONATELLO");
						arbol2.add(realizacion4+valoraciondiaria4+" RAPHAEL");
						
						
						Iterator<String> it2 = arbol2.iterator();	
						while(it2.hasNext()) 
						System.out.println(it2.next()); 
						
					break;
					
				case 0:
					
					opcion=0;
					System.out.println("Programa finalizado...");
					
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Error al introducir Datos");
		}
	}
}
