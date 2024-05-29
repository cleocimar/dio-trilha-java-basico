import java.util.Scanner;

/**************************************************************
 Método para coletar as informações 
--------------------------------------------------------------
Função de eparada de dados numa função separada para permitir 
a mudança pelo front-end sem muitas alterações 
--------------------------------------------------------------
Informações adicionais:
1) Para o campo "Nome" o ideal seria permitir a entrada de mais 
   de uma string mas não consegui criar essa funcionalidade, 
   o método "entrada.nextLine()" não funcionou como esperado 
   então não usei na leitura do campo "Nome"

2) Só reafrmando, o campo "Nome" não permite a entrada de 
   mais de uma string
**************************************************************/

public class InformacoesContaBanca {

    public ContasBancarias coletaInformacoes(){

        RotinasUteis uteis = new RotinasUteis();

        System.out.println("\n\n");
        System.out.println(">> Menu >> Cadastro");
        System.out.println( "-----------------------------------------------" );
        System.out.println( "Cadastro da Conta - (informe os dados da conta)" );
        System.out.println( "-----------------------------------------------\n" );

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o Número da Conta:");
        Integer vNumeroConta = entrada.nextInt();

        System.out.println("\nInforme o Número da Agência:");
        String vNumeroAgencia = entrada.next();

        System.out.println("\nInforme o Nome do Cliente:");
        String vNomeCliente = entrada.next();

        System.out.println("\nInforme o Saldo Atual:");
        Float vSaldoConta = entrada.nextFloat();

        //Empacota valores para tarnsporte
        ContasBancarias conta = new ContasBancarias();
        conta.setNumeroConta( vNumeroConta );
        conta.setNumeroAgencia( vNumeroAgencia );
        conta.setNomeCliente( vNomeCliente );
        conta.setSaldoConta( vSaldoConta );

        return conta;
    }
}
