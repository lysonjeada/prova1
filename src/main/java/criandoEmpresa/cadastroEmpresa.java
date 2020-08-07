package criandoEmpresa;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class cadastroEmpresa {
	public static void main(String[] args) {
		
        List<criandoEmpresa> empresas = new ArrayList<criandoEmpresa>();

		System.out.println("Bem vindo ao cadastro de empresas");
		
		Scanner ler = new Scanner(System.in); 
		String continuar = "s";
		
		while ("s".equalsIgnoreCase(continuar)) {
			System.out.print("CPNJ: ");
			String cnpj = ler.nextLine();
			
			System.out.print("Nome da empresa: ");
			String nome = ler.nextLine();
			
			System.out.print("Endereco: ");
			String endereco = ler.nextLine();
			
			criandoEmpresa empresa = new criandoEmpresa(cnpj, nome, endereco);
			if (empresas.contains(empresa)) {
				System.err.println("Essa empresa ja foi adicionada. Utilize outro cnpj");
				System.err.flush();			
			} else {
				empresas.add(empresa);
				System.out.println("Produto adicionado.");
			}
			
			System.out.println("Deseja adicionar mais alguma empresa? (s/n)");
			continuar = ler.nextLine();
			
		}
//		empresas.forEach(System.out::println);
		for(criandoEmpresa empresa : empresas){
            System.out.println(empresa.toString());
        }
		System.out.println("Fim"); 
    }	
}

