package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Henrique";
        var idade = 33;
        var salario = 1324.4523;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
        System.out.printf("Nome %s: \nSobrenome:%s \nIdade: %d \nSalário: R$%.2f", nome, sobrenome, idade, salario);
    }
}
