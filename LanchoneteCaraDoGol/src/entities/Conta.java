package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Conta {
	private static String path = "c:\\temp\\senhasSalvas.txt";
	private String email;
	private String name;
	private String senha;
	private boolean acesso;
    
	
	
	public Conta() {
		
	}
	

	public Conta(String email, String senha) {
	
		this.email = email;
		this.senha = senha;
	}


	public Conta(String email, String name, String senha) {
		this.email = email;
		this.name = name;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAcesso() {
		return acesso;
	}

	public void setAcesso(boolean acesso) {
		this.acesso = acesso;
	}
	public int verificarConta()  {
		int b = 0; 
		Scanner sc=null;
		File file = new File(path);
		try {
			sc=new Scanner(file);
			
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
				if (s.equals(email)) {
					b=1;
					
				}
			}
		}
		catch(IOException e) {
			e.getMessage();
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}
		return b;
	}

	public void salvarConta() {
		String[] lines = new String[] { email, name, senha };
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}

	
}
