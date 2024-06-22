package TestEntidades;

import java.util.List;

import Dao.ClassClienteImp;
import model.TblCliente;

public class TestEntidadCliente {

	public static void main(String[] args) {
		//realizamos la respectiva instancia de las clases...
		TblCliente cliente=new TblCliente();
		ClassClienteImp crud=new ClassClienteImp();
	/*	//asignamos valores
		cliente.setNombre("nilson ronaldo");
		cliente.setApellido("ramirez ramirez");
		cliente.setDni("1045789");
		cliente.setEmail("nilson@gmail.com");
		cliente.setTelf("3871459");
		cliente.setSexo("M");
		cliente.setNacionalidad("argentina");
		//invocamos al metodo registrar...
		crud.RegistrarCliente(cliente);		*/
		
		//testeamos el metodo listado
		List<TblCliente> listado = crud.ListadoCliente();
		//aplicamos un bucle for...
		for(TblCliente lis:listado)
		{
			System.out.println(
					"nombre :"+lis.getNombre()+"\n"+
					"apellido :"+lis.getApellido()+"\n"+
					"dni :"+lis.getDni()+"\n"+
					"email :"+lis.getEmail()+"\n"+
					"telefono :"+lis.getTelf() +"\n"+
					"sexo :"+lis.getSexo () +"\n"+
					"nacionalidad :"+lis.getNacionalidad()+"\n"+
					"--------------------------------------------"+
					"\n"
					);
			
		}

	}   //fin del metodo main...

} //fin de la clase...
