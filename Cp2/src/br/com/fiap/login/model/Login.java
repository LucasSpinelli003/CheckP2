package br.com.fiap.login.model;

import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args) {

		String registroUsuario = JOptionPane.showInputDialog("Digite o seu usuario para ser cadastrado.");
		String registroSenha = JOptionPane.showInputDialog("Digite o seu senha para ser cadastrado.");
		
		
		 String usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
		 String senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
		 int contador = 1;
	
		 if (usuario.equals(".")) {
			 JOptionPane.showMessageDialog(null, "Agora você está tentando entrar no modo administrador.");
			 usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
			 senha = JOptionPane.showInputDialog("Digite a sua senha: ");
			 while (!senha.equals(registroSenha)||!usuario.equals(registroUsuario)){
				JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
				JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (2 - contador));
				usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
				senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
				contador++;
				break;
			 }if(senha.equals(registroSenha)&&usuario.equals(registroUsuario)) {
					JOptionPane.showMessageDialog(null,"Acesso Administrador liberado");
				}else if(contador<1) {
					JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
				}
			 else {
					JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
				}
		 }else {
			 
		while (!senha.equals(registroSenha)|| !usuario.equals(registroUsuario)){
			JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
			JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (2 - contador));
			usuario = JOptionPane.showInputDialog("Digite o seu usuário: ");
			senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
			contador++;
			break;
			
			
		}if(senha.equals(registroSenha)&& usuario.equals(registroUsuario)) {
			JOptionPane.showMessageDialog(null,"Acesso liberado");
		}else if(contador<1){
			JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
		}else {
			JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
		}
		 }
		 

	}

}