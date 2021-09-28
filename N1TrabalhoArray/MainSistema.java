import  java.util.ArrayList ;
import  java.util.Scanner ;

public  class  MainSistema {
    public  static  void  main ( String [] args ) {
        Scanner ler =  novo  Scanner ( Sistema . In);
        FiladeAtendimento f1 =  novo  FiladeAtendimento ();

        byte escolha;

        faça {
            Sistema . para fora . println ( " Digite sua opção: " );
            Sistema . para fora . println ( " 1 - Adicionar um cliente na fila " );
            Sistema . para fora . println ( " 2 - Ver cliente da fila " );
            Sistema . para fora . println ( " 3 - Ver quantidade de clientes que estão na fila " );
            Sistema . para fora . println ( " 4 - Atender um cliente " );
            Sistema . para fora . println ( " 5 - Pesquisar um cliente pelo CPF " );
            Sistema . para fora . println ( " 6 - Pesquisar clientes pelo interesse " );
            Sistema . para fora . println ( " 7 - Retirar todos os clientes da fila " );
            Sistema . para fora . println ( " 0 - Sair " );
            escolha = ler . nextByte ();
        
            switch (escolha) {
                caso  1 :
                     Pessoa p1 =  novo  Pessoa ();
                     Sistema . para fora . println ( " Informe o nome do cliente: " );
                     p1 . setNome (ler . next ());

                    faça {
                        Sistema . para fora . println ( " Informe o CPF do cliente: " );
                        p1 . setCpf (ler . next ());
                        if (p1 . getCpf () . length () ! =  11 ) {
                            Sistema . para fora . println ( " Erro, CPF Inválido. " );
                        }
                        } while (p1 . getCpf () . length () ! =  11 );
                        faça {
                            Sistema . para fora . println ( " Informe o interesse do cliente " );
                            Sistema . para fora . println ( " 1 - Pagamento de Conta " );
                            Sistema . para fora . println ( " 2 - Recebimento de Salário " );
                            Sistema . para fora . println ( " 3 - Outra Operação " );
                            p1 . setInteresse (ler . nextByte ());
                            if (p1 . getInteresse () <  1  | p1 . getInteresse () >  3 ) {
                                Sistema . para fora . println ( " Erro, inválido. " );
                            }
                        } while (p1 . getInteresse () <  1  | p1 . getInteresse () >  3 );
                        f1 . adicionarPessoa (p1);
                        Sistema . para fora . println ( " Pessoa adcionada na fila com sucesso. " );
                        pausa ;
                caso  2 :
                     if (f1 . getFila () . isEmpty ()) {
                        Sistema . para fora . println ( " Não há cliente na fila. " );
                     } else {
                        Sistema . para fora . println (f1);
                     }
                caso  3 :
                     Sistema . para fora . println ( " Total de cliente na fila: "  + f1 . obterQuantidadeDePessoas ());
                     pausa ;
                caso  4 :
                     if (f1 . getFila () . isEmpty ()) {
                        Sistema . para fora . println ( " Não há cliente para atender. " );
                     } else {
                        Sistema . para fora . println ( " Cliente: "  + f1 . atenderPessoa ());
                    }
                    pausa ;
                caso  5 : 
                       Sistema . para fora . println ( " Informe o CPF do cliente para efetuar uma pesquisa " );
                       Nome da string = ler . próximo();
                       Pessoa resultado = f1 . pesquisarPeloCPF (nome);
                       if (resultado ==  null ) {
                        Sistema . para fora . println ( " Não há este cliente na fila " );
                       } else {
                        Sistema . para fora . println (resultado);
                       }
                       pausa ;
                caso  6 : 
                      Sistema . para fora . println ( " Informe o interesse para listar os clientes " );       
                      Sistema . para fora . println ( " 1 - Pagamento de Conta " );
                      Sistema . para fora . println ( " 2 - Recebimento de Salário " );
                      Sistema . para fora . println ( " 3 - Outras Operações " );
                      byte pesquisa = ler . nextByte ();
                      ArrayList < Pessoa > lista = f1 . pesquisandoPessoasPeloInteresse (pesquisa);
                      se (Lista . isEmpty ()) {
                        Sistema . para fora . println ( " Não há clientes com esse interesse " );
                      } else {
                        Sistema . para fora . println (lista);
                      }
                      pausa ;
                caso  7 :
                      if (f1 . getFila () . isEmpty ()) {
                        Sistema . para fora . println ( " Nãp há clientes na fila " );
                      } else {
                          f1 . apagarTodos ();
                          Sistema . para fora . println ( " Clientes removidos da fila " );
                      }            
                      pausa ;
                caso  0 :
                Sistema . para fora . println ( " Sistema Encerrado " );
                pausa ;
                padrão :
                Sistema . para fora . println ( " Opção inválida " );
                pausa ;               
            }
            } enquanto (escolha ! =  0 );
}
}