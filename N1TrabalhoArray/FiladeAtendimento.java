import  java.util.ArrayList ;

public  class  FiladeAtendimento {
     ArrayList  < Pessoa > fila privada ;

    public  FiladeAtendimento () {
        isso . fila =  nova  ArrayList <> ();

    }

    public  ArrayList < Pessoa >  getFila () {
        retorno fila;
    }

    public  void  setFila ( ArrayList < Pessoa >  fila ) {
        isso . fila = fila;
    }

    público  Pessoa  atenderPessoa () {
        Pessoa p1 =  isso . fila . get ( 0 );
        isso . fila . remover ( 0 );
        return p1;
    }

    public  void  adicionarPessoa ( Pessoa  p ) {
        isso . fila . adicione (p);
    }
    
    public  int  obterQuantidadeDePessoas () {
        devolva  isso . fila . Tamanho();
    }

    public  void  apagarTodos () {
        isso . fila . Claro();
    }

    public  Pessoa  pesquisandoPeloCPF ( String  cpf ) {
        Pessoa p2 =  nulo ;
        para ( int i =  0 ; i < this . fila . size (); i ++ ) {
            if ( this . fila . get (i) . getCpf () . equals (cpf)) {
                p2 =  isso . fila . Entendi);
            }
        }
        return p2;
    }

    public  ArrayList < Pessoa > pesquisarPessoasPeloInteresse ( byte  interesse ) {
        ArrayList  < Pessoa > listaInteresse =  new  ArrayList <> ();
        para ( int i =  0 ; i <  this . fila . size (); i ++ ) {
            if ( this . fila . get (i) . getInteresse () == interesse) {
                listaInteresse . add ( this . fila . get (i));
            }
        }
        return listaInteresse;
    }
    @Sobrepor
    public  String  toString () {
        retornar  " Fila de Atendimento \ n "  + fila;
    }
}