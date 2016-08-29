package br.com.devmedia.ws.soap.exemplo1;

import java.rmi.RemoteException;

public class TesteSOAP {
	public static void main(String[] args) {
		WebServiceSOAPProxy service = new WebServiceSOAPProxy();
		String nome;
		try {
			nome = service.ping("SOAP");
			System.out.println(nome);
			for (String string : service.getListString()) {
				System.out.println(string);
			}
			
			for (Carro carro : service.getListCarro()) {
				System.out.println("Nome: "+carro.getNome() + 
								   "\nMarca: "+carro.getMarca() +
								   "\nCor: "+carro.getCor());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
