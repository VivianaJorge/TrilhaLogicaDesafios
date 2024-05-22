package bloqueiodeusuario;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BloqueioDeUsuario {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        for (int i = 1;i<=3;i++){
            System.out.println("Informe seu usuário: ");
            String usuario = t.next();
            System.out.println("Informe sua senha: ");
            String senha = t.next();
            if ((usuario.equals("aluno")) && (senha.equals("segredo"))){
                System.out.println("Bem-vindo");
                i=4;
            } else{
                System.out.println("Erro ao informar credenciais. Tentativa " + i + " de 3. Após 3 tentativas usuário será bloqueado.");
            }

        }

    }
}
