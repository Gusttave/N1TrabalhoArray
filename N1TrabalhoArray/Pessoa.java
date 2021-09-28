public  class  Pessoa {

    // VARIAVEIS
     nome da string privada , cpf;
     byte privado interesse;
    
    
    public  void  setNome ( String  nome ) {
            isso . nome = nome;
        }
        public  String  getNome () {
            devolva  isso . nome;
        }
        public  void  setCpf ( String  cpf ) {
            isso . cpf = cpf;
        }
        public  String  getCpf () {
            devolva  isso . cpf;
        }

        public  void  setInteresse ( byte  interesse ) {
            isso . interesse = interesse;
        }
        public  byte  getInteresse () {
            devolva  isso . interesse;
        }

        @Sobrepor
        public  String  toString () {
            String texto;
            mudar ( este . interesse) {

            caso  1 :
                texto =  " Pagamento de Conta " ;
                pausa ;

            caso  2 :
                texto =  " Recebimento de Salário " ;
                pausa ;
            padrão :
                texto =  " Operação Outra " ;
            }
            return  " \ n Nenhum: "  + nome +  " , CPF: "  + cpf +  " . INTERESSE: "  + texto + " } " ;
        } 

    }