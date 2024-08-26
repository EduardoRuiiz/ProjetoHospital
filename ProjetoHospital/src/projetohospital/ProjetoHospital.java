
package projetohospital;

import java.util.Scanner;  // objeto pode acessar todos os dados e métodos do segundo objeto (incluindo aqueles que são private). e assim poder passar o objeto diretamente para o método System.
public class ProjetoHospital {

    //indica que esse é o programa principal, metodo main
    public static void main(String[] args) {
      
        Scanner info = new Scanner(System.in); // o objeto "info" será utilizado para receber o que for digitado pelo usuário
        System.out.println("Digite o nome do paciente"); // imprime uma mensagem na tela
        String variavelNome = info.nextLine(); // responsavel por pegar as informaçoes
        
        System.out.println("Digite o tipo de enfermidade do mesmo");
        String variavelDoenca = info.nextLine();
        
        Paciente pacienteUm = new Paciente(variavelNome, variavelDoenca);
        
        //while true: enquanto for verdadeiro
        while (true) {
            Scanner entradaDados = new Scanner(System.in);
            System.out.println("Digite uma opcao do menu, sendo: \n [1] Relatorio \n [2] Alterar Doenca \n");
            int opcao = entradaDados.nextInt();
            if (opcao==1){
                System.out.println("" + pacienteUm.relatorioPaciente());
            }
            else if (opcao==2){
                System.out.println("Digite o novo tipo de enfermidade do mesmo");
                pacienteUm.alterarEnfermidade(info.nextLine());
            }
            else {
                System.out.println("Fim");
                break;
            }
        }
    }
    
}
