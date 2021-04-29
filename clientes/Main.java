package com.celular.clientes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compania compania1 = new Compania(3);
		
		Celular celu1= new Celular("alcatel","123456789");
		Cliente cliente1= new Cliente("1-9","nombre1",60,'m',true,celu1);
		Celular celu2= new Celular("Samsung","22445566");
		Cliente cliente2= new Cliente("1-7","nombre2",60,'f',true,celu2);
		Celular celu3= new Celular("iphone","987654321");
		Cliente cliente3= new Cliente("1-8","nombre3",60,'f',true,celu3);
		
		compania1.agregarCliente(cliente1);
		compania1.agregarCliente(cliente2);
		compania1.agregarCliente(cliente3);
		
		
		compania1.modificarCelular(cliente2.getRut(), "99887766");
		
		if(compania1.buscarCliente("1-8")){
			System.out.println("Cliente existe en nuestros registros");
		}
		
		compania1.listarClientes();

	}

}
