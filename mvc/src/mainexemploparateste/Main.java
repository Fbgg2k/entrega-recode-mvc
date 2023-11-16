package mainexemploparateste;

import java.util.List;
import java.util.Scanner;

import dao.InscricaoDAO;
import model.Inscricao;

public class Main {
    private InscricaoDAO inscricaoDAO;
    private Scanner scanner;

    public Main() {
        this.inscricaoDAO = new InscricaoDAO();
        this.scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    criarInscricao();
                    break;
                case 2:
                    consultarInscricoes();
                    break;
                case 3:
                    atualizarInscricao();
                    break;
                case 4:
                    deletarInscricao();
                    break;
                case 5:
                    consultarInscricaoPorId();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n============================== Inscricao =================================\n");
        System.out.println("1-CRIAR   2-CONSULTAR   3-ATUALIZAR   4-DELETAR   5-CONSULTAR POR ID  0-SAIR");
    }

    private void criarInscricao() {
        // Implementar a lógica para criar uma inscricao
        // Exemplo:
        // Aluno aluno = new Aluno("123456789", "aluno@gmail.com", "Nome do Aluno", "senha123");
        // Vaga vaga = new Vaga("2023-12-01", "Nome da Vaga");
        // Inscricao inscricao = new Inscricao(aluno, vaga);
        // inscricaoDAO.create(inscricao);
    }

    private void consultarInscricoes() {
        List<Inscricao> inscricoes = inscricaoDAO.read();
        for (Inscricao inscricao : inscricoes) {
            System.out.println(inscricao.toString());
        }
    }

    private void atualizarInscricao() {
        // Implementar a lógica para atualizar uma inscricao
    }

    private void deletarInscricao() {
        // Implementar a lógica para deletar uma inscricao
    }

    private void consultarInscricaoPorId() {
        // Implementar a lógica para consultar uma inscricao por ID
    }

    public static void main(String[] args) {
        Main controller = new Main();
        controller.executar();
    }
}
