
public class ContasBancarias {

    // ATRIBUTOS - Campos da classe
    private int numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private float saldoConta;

    // Contrutor Padrão
    public ContasBancarias() {

        // Inicialização 
        this.numeroConta = 0;
        this.numeroAgencia = "";
        this.nomeCliente = "";
        this.saldoConta = 0.2f;
    }

    // GETTERS - métodos de recuperação de dados
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNumeroAgencia() {
        return numeroAgencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public float getSaldoConta() {
        return saldoConta;
    }

    // SETTERS - métodos de atribuição de valores
    public void setNumeroConta( int numeroConta ) {
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia (String numeroAgencia ) {
        this.numeroAgencia = numeroAgencia;
    }
    public void setNomeCliente( String nomeCliente ) {
        this.nomeCliente = nomeCliente;
    }
    public void setSaldoConta( float saldoConta ) {
        this.saldoConta = saldoConta;
    }

    /**************************************************************
     Método para validar as informações digitadas da conta bancária
     --------------------------------------------------------------
     Recebe as informações da conta bancária e retorna se todos  os 
     campos foram validado ou não.
     --------------------------------------------------------------
     Informações adicionais:

     1) Nas mensagens de erro, os nomes entre colchetes ([]) são 
        iguais a campo da entrada de dados para o usuário se localizar.

     2) As validações são na mesma ordem da entrada de dados para fazer 
        sentido (não é esse o caso).     

     3) As mensagens de erro devem ser todas diferentes para facilitar 
        a manutenção desse método pelos desenvolvedores.

     4) As validações são independentes, um campo pode ter maisde um 
        erro de digitação, por exemplo, nome pode ser branco e/ou ter 
        menos de 5 caracteres.

     5) Não foram criadas exceções, as validações foram as mais 
        básicas.
     **************************************************************/

    public String validarInfomacoes( ContasBancarias conta ){
        
        String resultado = "";

        if( conta.numeroConta == 0 ) {
            resultado += "[Número da Conta] inválido. Informe um número inteiro.";
        } 
        
        if ( conta.numeroAgencia.isEmpty()) {
            resultado += "Número da Agência] inválido. Informe um número da Agência.";
        } 
        
        if ( conta.nomeCliente.isEmpty()) {
            resultado += "[Nome do Cliente] inválido. Informe o nome do cliente.";
        } 
        
        if ( conta.nomeCliente.length() < 5) {
            resultado += "[Nome do Cliente] inválido. Digite pelo menos 5 caracteres.";
        } 
        
        if ( conta.saldoConta < 0.2f ) {
            resultado += "[Saldo da Conta] inválido. O saldo nesse momento deve ser maior ou igual a zero.";
        }

        return ( resultado.isEmpty() ? "OK" : resultado ) ;
    }
}


