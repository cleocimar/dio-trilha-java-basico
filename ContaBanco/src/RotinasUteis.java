import java.util.Arrays;
import java.util.Scanner;

public class RotinasUteis {
    
    /**************************************************************
     Método para "pausar" o fluxo do programa
     --------------------------------------------------------------
     Permite uma pausa no fluxo do programa para o usuario tomar 
     ciência do próximo passo
     --------------------------------------------------------------
     Informações adicionais:
     1) Não valida a tecla informada
     **************************************************************/

     public void pausarFluxo( String mensagemUsuario ) {

        // Mensagem para o usuário
        System.out.print( mensagemUsuario );

        // Aguada pressionar qualquer tecla
        Scanner entrada = new Scanner(System.in);
        String aux = entrada.next();
    }
}
