import java.util.Scanner;

public class ProjetoGlaucio {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int digitacao, conferencia, auxiliar, sintomas, doencas, auxiliar2;
        sintomas = 18;
        doencas = 5;
        int[] vetor1 = new int[sintomas], vetor2 = new int[doencas];
        String[] vetor3 = new String[sintomas];
        vetor3[0] = "\n 1-PERCA DE PALADAR";
        vetor3[1] = "\n 2-PERCA DE OUFATO";
        vetor3[2] = "\n 3-DIFICULDADE RESPIRATÓRIA";
        vetor3[3] = "\n 4-TOSSE SECA";
        vetor3[4] = "\n 5-ALUCINAÇÃO, DELIRIO OU MEDO";
        vetor3[5] = "\n 6-AGRESSIVIDADE, INQUIETAÇÃO OU IRRITABILIDADE";
        vetor3[6] = "\n 7-SENSIBILIDADE EXCESSIVA A LUZ";
        vetor3[7] = "\n 8-CONVULÇÃO";
        vetor3[8] = "\n 9-DOR NO CORPO";
        vetor3[9] = "\n 10-DOR ATRÁS DOS OLHOS";
        vetor3[10] = "\n 11-MANCHAS AVERMELHADAS";
        vetor3[11] = "\n 12-SANGRAMENTO NA GENGIVA E NARIZ";
        vetor3[12] = "\n 13-CALAFRIOS";
        vetor3[13] = "\n 14-PELE E OLHOS AMARELADOS";
        vetor3[14] = "\n 15-LESÃO BUCAL";
        vetor3[15] = "\n 16-SEMSAÇÃO DE QUEIMAÇÃO";
        vetor3[16] = "\n 17-LABIOS DOLORIDOS";
        vetor3[17] = "\n 18-ERUPÇÕES NOS LABIOS";
        auxiliar = 0;
        while (auxiliar < 18) {
            vetor1[auxiliar] = 0;
            auxiliar++;
        }
        auxiliar = 0;
        while (auxiliar < 5) {
            vetor2[auxiliar] = 0;
            auxiliar++;
        }
        auxiliar = 0;
        System.out.print(
                "\n\n Bem vindo ao sistema de leitura de sintomas, por favor indique quais sintomas você está sentindo.\n\n");
        digitacao = 0;
        while (digitacao == 0) {
            conferencia = 0;
            while (conferencia == 0) {
                System.out.print(
                        "\n A leitura de sintomas pelo sistema será feito atravez de número, onde cade número representará um sintoma (disponivel) tal qual a tabela abaixo:\n\n");
                auxiliar2 = 0;
                while (auxiliar2 < sintomas) {
                    if (0 == vetor1[auxiliar2]) {
                        System.out.print(vetor3[auxiliar2]);
                    }
                    auxiliar2++;
                }
                System.out.print(
                        "\n\n Digite o número do sintoma que está sentindo (caso seje mais de um sintoma coloque um sintoma ainda não marcado):");
                auxiliar = entrada.nextInt();
                switch (auxiliar) {
                    case 1:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[0]++;
                        }
                        break;
                    case 2:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[0]++;
                        }
                        break;
                    case 3:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar] = 1;
                            vetor2[0]++;
                        }
                        break;
                    case 4:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[0]++;
                        }
                        break;
                    case 5:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[1]++;
                        }
                        break;
                    case 6:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[1]++;
                        }
                        break;
                    case 7:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[1]++;
                            vetor2[3]++;
                        }
                        break;
                    case 8:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[1]++;
                        }
                        break;
                    case 9:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[2]++;
                            vetor2[3]++;
                        }
                        break;
                    case 10:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[2]++;
                        }
                        break;
                    case 11:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[2]++;
                        }
                        break;
                    case 12:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[2]++;
                        }
                        break;
                    case 13:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[3]++;
                        }
                        break;
                    case 14:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[3]++;
                        }
                        break;
                    case 15:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[4]++;
                        }
                        break;
                    case 16:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[4]++;
                        }
                        break;
                    case 17:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[4]++;
                        }
                        break;
                    case 18:
                        if (1 == vetor1[auxiliar - 1]) {
                            conferencia = 0;
                            System.out.print("\n Númeração repetida. Tente novamente.");
                        } else {
                            conferencia = 1;
                            vetor1[auxiliar - 1] = 1;
                            vetor2[4]++;
                        }
                        break;
                    default:
                        conferencia = 0;
                        System.out.print("\n Númeração inexistênte. Tente novamente.");
                        break;
                }
                System.out.print("\n\n Deseja escolher mais algum sintoma? (digite 0 para sim e 1 para não) \n ");
                digitacao = entrada.nextInt();
                if (digitacao == 1 && conferencia == 0) {
                    conferencia = 1;
                }
            }
        }
        System.out.print("\n\n O(s) sintoma(s) apresetado(s) podem ser classificado(s) na(s) doença(s):\n\n");
        if (vetor2[0] > 0) {
            System.out.print("\n " + vetor2[0] + " sintoma(s) de covid.");
        }
        if (vetor2[1] > 0) {
            System.out.print("\n " + vetor2[1] + " sintoma(s) de raiva.");
        }
        if (vetor2[2] > 0) {
            System.out.print("\n " + vetor2[2] + " sintoma(s) de dengue.");
        }
        if (vetor2[3] > 0) {
            System.out.print("\n " + vetor2[3] + " sintoma(s) de febre amarela.");
        }
        if (vetor2[4] > 0) {
            System.out.print("\n " + vetor2[4] + " sintoma(s) de herbes labial.");
        }
        System.out.print(
                "\n\n\n Lembrando sempre que este não é um diagnostico médico.\n Deve sempre procurar um profissional da saude ou um hospital o mais rapido possivel.\n Para iniciar o tratamento mais rapido possivel.\n\n\n");
    }
}