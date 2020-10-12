package archivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lista {

	public static void main(String[] args) {
		 Scanner sn = new Scanner(System.in);
		List milista=new ArrayList();
		 boolean salir = false;
	       int opcion; 
	        
	       while(!salir){
	            
	    System.out.println("1. INSERTAR");
	    System.out.println("2. LEER");
	    System.out.println("3. ACTUALIZAR");
	    System.out.println("4. BORRAR ");
	    System.out.println("5. BORRAR TODA LA LISTA");
	    System.out.println("6. SALIR");
	        //GUARDAMOS LA OPCION DEL USUARIO    
	    System.out.println("¿Que opcion desea realizar?");
	           opcion = sn.nextInt();
	            
	    switch(opcion){
	      case 1://AGREGAMOS ELEMENTO ALA LISTA
	          System.out.println("dame un elemento para agregar:");
	          int agregar=sn.nextInt();
	          milista.add(agregar);
	         
	             break; 
	     case 2://LEEMOS LOS ELEMENTOS DE LA LISTA
	                	if(milista.size()>0){
	                		System.out.println("la lista si tiene elementos");
	                		}else{
	                		System.out.println("La lista esta vacia");
	                		}
	                   System.out.println(milista);
	                  
	                   break;     
	     case 3://ACTUALIZAMOS ELEMENTO DE LA LISTA
	            	   if(milista.size()>0){
	                		System.out.println("la lista si tiene elementos");
	                		 System.out.println("dame la posicion  a actualizar:");
	  	                   int posicion=sn.nextInt();
	  	                   System.out.println("dame el valor del elemento a actualizar:");
	  	                   int actualizar=sn.nextInt();
	  	                   milista.set(posicion,actualizar);	
	            	   }else{
	                		System.out.println("La lista esta vacia");
	                		}
	                  
	                  
	                    System.out.println(milista );
	                   break;
	                
	    case 4://ELIMINAMOS ELEMENTO DE LA LISTA
	                	if(milista.size()>0){
	                		System.out.println("la lista si contiene elementos");
	                		System.out.println("dame posicion a eliminar");
	                		int eliminar=sn.nextInt();
	                		milista.remove(eliminar);
	                		}else{
	                		System.out.println("La lista esta vacia");
	                		}
	                	
	                	
	                break;
	    case 5://LIMPIAMOS TODA LA LISTA
	                	if(milista.size()>0){
	                		System.out.println("la lista si tiene elementos");
	                		System.out.println("desea eliminar la lista completa presiona el numero 5 ");
	                		
	                		milista.clear();
	                		}else{
	                		System.out.println("La lista esta vacia");
	                		}
	                milista.clear();
	              
	                break;
	   case 6://SALIR DEL MENU
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("LA OPCION NO ESTA EN EL MENU");
	                   break;
	           }//switch
	            
	       }//while
	}//main

}//class
