
import java.util.Scanner;

public class ContaTerminal {

    /***********************************************************************
     * O programa ao permitir cadastrar novamente, cria uma nova instancia 
     * 
     ***********************************************************************/
    public static void main(String[] args) throws Exception {

        // Preparação
        String TECLE_0_MAIS_ENTER_PARA_CONTINUAR = "Tecle [0]+[ENTER] para contnuar...";  
        RotinasUteis uteis = new RotinasUteis();

        boolean continua = true;
        while ( continua ) {

            // Menu de opções 
            System.out.println("\n\n");
            System.out.println( "**************************");
            System.out.println( "CADASTRO DE CONTA BANCÁRIA");
            System.out.println( "**************************");
            System.out.println( "[1]Cadastrar Conta  [2]Finalizar\n" );
            System.out.print( "Digite a opção desejada: ");

            Scanner opcaoDesejada = new Scanner( System.in );
            String opcao = opcaoDesejada.next();

            switch ( opcao ) {

                // Opção [1]Cadastrar Conta
                case "1": 

                    ContasBancarias contaBancaria = new ContasBancarias();

                    //Digitação e validação das informações da conta bancária
                    boolean continuaCadastro = true;
                    while ( continuaCadastro ) {

                        //Entrada de dados
                        InformacoesContaBanca entradaDados = new InformacoesContaBanca();
                        contaBancaria = entradaDados.coletaInformacoes();

                        //Validar informações
                        String resultadoValidacao = contaBancaria.validarInfomacoes( contaBancaria );

                        if( resultadoValidacao != "OK" ) {

                            System.out.println( "\n\n");
                            System.out.println( "Informações inválidas:" );
                            System.out.println( "------------------------------------------------------------------------------------------" );
                            System.out.println( resultadoValidacao );
                            System.out.println( "------------------------------------------------------------------------------------------" );
                            uteis.pausarFluxo( TECLE_0_MAIS_ENTER_PARA_CONTINUAR );

                        } else {

                            System.out.println( "\n\n");
                            System.out.println( "-----------------------------------" );
                            System.out.println( "Conta Bancária criada com sucesso!!" );
                            System.out.println( "-----------------------------------\n" );
                            String saldoContaFormatado = String.format( "%.2f", contaBancaria.getSaldoConta());
                            System.out.println( "Olá " + contaBancaria.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+contaBancaria.getNumeroAgencia()+", conta "+contaBancaria.getNumeroConta()+" e seu saldo de R$ "+saldoContaFormatado+" já está disponível para saque\n\n");
                            uteis.pausarFluxo( TECLE_0_MAIS_ENTER_PARA_CONTINUAR );

                            continuaCadastro = false;
                        }
                    }
                    break;

                // Opção [2]Finalizar
                case "2": 

                    // Pula duas linhas e envia mensagem para continuar o fluxo do programa
                    System.out.println("\nObrigado por usar nosso banco !!\n\n");
                    continua = false;
                    break;

                // Opçaõ Inválida
                default:

                    // Pula duas linhas e envia mensagem para continuar o fluxo do programa
                    System.out.println("\nOpção inválida !!\n");
                    uteis.pausarFluxo( TECLE_0_MAIS_ENTER_PARA_CONTINUAR );
            }
        }
    }
}


