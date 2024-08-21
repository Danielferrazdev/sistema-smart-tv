public class processoSeletivo {
    public static void main(String[] args) {
        System.out.println("PROCESSO SELETIVO");
        analisarCadidato(1900.0);
        analisarCadidato(2200.0);
        analisarCadidato(2000.0);
    }
        // " SÓ O NOME static RESULTADO" parametro que não vai gerar resultado
        // colocar oq ue vai variar entre ( )
        static void analisarCadidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
            }else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PORPOSTA");
            else {
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
            }   
    }
}
