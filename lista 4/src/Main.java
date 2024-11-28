class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void abrirLivro() {
        System.out.println("Livro " + titulo + " aberto.");
    }

    public void lerPagina(int pagina) {
        if (pagina > 0 && pagina <= numeroDePaginas) {
            System.out.println("Lendo a página " + pagina + " do livro " + titulo + ".");
        } else {
            System.out.println("Página inválida.");
        }
    }
}

class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public void ligar() {
        System.out.println("Celular " + marca + " " + modelo + " ligado.");
    }

    public void desligar() {
        System.out.println("Celular " + marca + " " + modelo + " desligado.");
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }
}

class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: R$" + valor + ". Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado: R$" + valor + ". Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
