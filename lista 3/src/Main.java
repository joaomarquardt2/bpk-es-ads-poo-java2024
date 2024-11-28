class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;

    void abrirLivro() {
        System.out.println("Livro " + titulo + " aberto.");
    }

    void lerPagina(int pagina) {
        if (pagina > 0 && pagina <= numeroDePaginas) {
            System.out.println("Lendo a página " + pagina + " do livro " + titulo + ".");
        } else {
            System.out.println("Página inválida.");
        }
    }
}

class Celular {
    String marca;
    String modelo;
    int capacidadeBateria;

    void ligar() {
        System.out.println("Celular " + marca + " " + modelo + " ligado.");
    }

    void desligar() {
        System.out.println("Celular " + marca + " " + modelo + " desligado.");
    }
}

class Pessoa {
    String nome;
    int idade;
    double altura;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }
}

class ContaBancaria {
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: R$" + valor + ". Saldo atual: R$" + saldo);
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor + ". Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo!");
    }

    void correr() {
        System.out.println(nome + " está correndo!");
    }
}

class Computador {
    String processador;
    int memoriaRAM;
    int armazenamento;

    void ligar() {
        System.out.println("Computador ligado.");
    }

    void desligar() {
        System.out.println("Computador desligado.");
    }
}

class Aluno {
    String nome;
    String matricula;
    String curso;

    double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

class Professor {
    String nome;
    String disciplina;
    double salario;

    void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas.");
    }
}

class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    void aumentarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println("Estoque aumentado. Quantidade atual: " + quantidadeEstoque);
    }

    void diminuirEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuído. Quantidade atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}

class Veiculo {
    String tipo;
    String placa;
    String cor;

    void abastecer() {
        System.out.println("Veículo abastecido.");
    }

    void lavar() {
        System.out.println("Veículo lavado.");
    }
}

class Cidade {
    String nome;
    int populacao;
    String estado;

    void aumentarPopulacao(int quantidade) {
        populacao += quantidade;
        System.out.println("População aumentada para " + populacao + ".");
    }

    void diminuirPopulacao(int quantidade) {
        if (populacao >= quantidade) {
            populacao -= quantidade;
            System.out.println("População diminuída para " + populacao + ".");
        } else {
            System.out.println("População não pode ser negativa.");
        }
    }
}

class Filme {
    String titulo;
    String diretor;
    int duracao;

    void iniciar() {
        System.out.println("Filme " + titulo + " iniciado.");
    }

    void parar() {
        System.out.println("Filme " + titulo + " parado.");
    }
}

class Time {
    String nome;
    String tecnico;
    int numeroDeJogadores;

    void adicionarJogador() {
        numeroDeJogadores++;
        System.out.println("Jogador adicionado. Total: " + numeroDeJogadores);
    }

    void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
            System.out.println("Jogador removido. Total: " + numeroDeJogadores);
        } else {
            System.out.println("Nenhum jogador para remover.");
        }
    }
}

class Jogo {
    String nome;
    String genero;
    double preco;

    void iniciar() {
        System.out.println("Jogo " + nome + " iniciado.");
    }

    void pausar() {
        System.out.println("Jogo " + nome + " pausado.");
    }
}

class Loja {
    String nome;
    String endereco;
    String telefone;

    void abrir() {
        System.out.println("Loja " + nome + " aberta.");
    }

    void fechar() {
        System.out.println("Loja " + nome + " fechada.");
    }
}

class Animal {
    String especie;
    int idade;
    double peso;

    void alimentar() {
        System.out.println("Animal alimentado.");
    }

    void dormir() {
        System.out.println("Animal dormindo.");
    }
}

class LivroDigital {
    String titulo;
    String autor;
    double tamanhoArquivo;

    void abrir() {
        System.out.println("Livro digital " + titulo + " aberto.");
    }

    void fechar() {
        System.out.println("Livro digital " + titulo + " fechado.");
    }
}

class Bicicleta {
    String marca;
    String modelo;
    int tamanhoRoda;

    void pedalar() {
        System.out.println("Bicicleta pedalada.");
    }

    void frear() {
        System.out.println("Bicicleta freada.");
    }
}

class Cozinha {
    String tipo;
    int quantidadePessoas;
    String cor;

    void cozinhar() {
        System.out.println("Cozinhando na cozinha de tipo " + tipo + ".");
    }

    void limpar() {
        System.out.println("Cozinha limpa.");
    }
}

class Empresa {
    String nome;
    String CNPJ;
    int numeroFuncionarios;

    void contratar() {
        numeroFuncionarios++;
        System.out.println("Funcionário contratado. Total: " + numeroFuncionarios);
    }

    void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Funcionário demitido. Total: " + numeroFuncionarios);
        } else {
            System.out.println("Nenhum funcionário para demitir.");
        }
    }
}


