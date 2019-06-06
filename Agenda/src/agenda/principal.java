package agenda;


import java.util.Scanner;
public class principal {
	
	public static void main(String[] arg){		
		
		Scanner reader=new Scanner(System.in);
		int opcion, tamanio;
		contacto mi_contacto = null;
		String nombre = null, telefono, email;
		boolean band=true;	
		
		System.out.print("Tamaño de la agenda: ");
		tamanio=reader.nextInt();
		agenda mi_agenda=new agenda(tamanio);		
				
		while(band==true){	
			menu();			
			System.out.print("> Elegir opcion: ");
			opcion=reader.nextInt();
			
			switch(opcion){
				case 1: //insertar contacto
					System.out.print("Ingresar nombre contacto: ");
					nombre=reader.next();
					System.out.print("Ingresar telefono contacto: ");
					telefono=reader.next();
					System.out.print("Ingresar email contacto: ");
					email=reader.next();
					
					mi_contacto=new contacto(nombre,telefono,email);
					mi_agenda.setContacto(mi_contacto);
					break;
				case 2:
					break;
				case 3:
					mi_agenda.buscarpornombre(nombre);
					break;
				case 4:
					mi_agenda.eliminarcontacto(mi_contacto);
					break;
				case 5://Listar Contactos
					mi_agenda.listarContactos();
					break;
				case 0://Finalizar programa
					band=false;
					break;
				default:				
					break;					
			}				
		}		
	}
	
	//Metodo de menu de opciones del proyecto
	public static void menu(){
		System.out.println("");
		System.out.println("========= Menu Agenda Telefonica =========");
		System.out.println("[1] Añadir Contacto");
		System.out.println("[2] Editar Contacto");
		System.out.println("[3] Buscar Contacto");
		System.out.println("[4] Eliminar Contacto"); // por nombre
		System.out.println("[5] Listar Contacto");
		System.out.println("[0] Finalizar Programa");
	}
	


}



	