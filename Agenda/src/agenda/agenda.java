package agenda;

import java.util.Scanner;
public class agenda {	//Atributos
	                    
	contacto[] lista;	
	
	//Metodos Constructores
	
	public agenda(int tamanio_agenda){
		this.lista= new contacto[tamanio_agenda]; 
	}
	
	public agenda(){
		this.lista= new contacto[10]; 
	}	
	// METODOS
	
	 //Metodo insertar contactos
	public void setContacto(contacto c){		
		int indice=buscar_indice_vacio();
		
		if(indice<0){
			System.out.println("");
			System.out.println("Importante: Agenda llena!");
		}else{
			this.lista[indice]=c;	
		}								
	}
	
	// LOOKING FOR A VACIO
	private int buscar_indice_vacio() {		
		int indice=0;		
		while(this.lista[indice]!=null){			
			indice++;
			if(indice > (this.lista).length-1){
				return -1;
			}				
		}		
		return indice;				
	}
	// Metodo listar contactos
	public void listarContactos(){
		System.out.println("");
		System.out.println("Lista de contactos");
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]==null){
				
			}else{
				System.out.println("");
				System.out.println("Contacto: "+(i+1));
				(this.lista[i]).DatosContacto();
			}
		}
	}
	// METODO BUSCAR POR NOMBRE
	public void buscarpornombre(String nombre) {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		nombre=reader.nextLine();
		boolean encontrado =false;
		for(int i=0;i<(this.lista).length && !encontrado;i++){
			if(this.lista[i]==null && this.lista[i].getNombre().equalsIgnoreCase(nombre)){
			//ojo
				
				System.out.println("su número es " +this.lista[i].getTelefono());
				encontrado=true;
				
				
		}
	}
	if(!encontrado) {
		
		System.out.println("no se encontró contacto");
	}
		
	}
	
	public boolean agendallena() {
		
		for(int i=0;i<(this.lista).length;i++){
			if(this.lista[i]==null){
			return false;
			}
		}
		return true;
		
	}// METODO ELIMINAR CONTACTOS :v
	public void eliminarcontacto(contacto c) {
		 boolean encontrado = false;
	        for (int i = 0; i < this.lista.length && !encontrado; i++) {
	            if (this.lista[i] != null && this.lista[i].equals(c)) {
	                this.lista[i] = null; //i try to have the control of the  nulos
	                encontrado = true; // i say that i found 
	            }
	        }

	        if ( ! encontrado) {
	            System.out.println("Se ha eliminado el contacto");
	        } else {
	            System.out.println("No se ha eliminado el contacto");

	        }

	    }
	
	// Metodo editar contacto
	public  void  editarContacto ( int  indice , contacto  newc ) {
		if (indice > 0  && indice <= this . lista . length) {
			this. lista [indice - 1 ] = newc;
		} else {
			 System.out.println ( " El contacto que ha digitado no existe :v " );
			 }
	}

	    // FREE POSITION 
	    public int posiciónLibre() {

	        int contadorLibres = 0;
	        for (int i = 0; i < this.lista.length; i++) {
	            if (this.lista[i] == null) { //Controlo nulos
	                contadorLibres++; //Acumulo
	            }
	        }

	        return contadorLibres;

	    }

	}
	

	




