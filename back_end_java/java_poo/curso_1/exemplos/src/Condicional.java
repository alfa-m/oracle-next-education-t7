public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento;
        double notaDoFilme;
        boolean planoPago;
        String tipoPlano;
        boolean incluidoNoPlano;

        int anoDeLancamentoTopGunMaverick = 2022;
        double notaDoFilmeTopGunMaverick = 8.2;
        boolean planoPagoTopGunMaverick = true;
        String tipoPlanoTopGunMaverick = "Normal";

        System.out.println("Filme: Top Gun Maverick");
        anoDeLancamento = anoDeLancamentoTopGunMaverick;
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        planoPago = planoPagoTopGunMaverick;
        tipoPlano = tipoPlanoTopGunMaverick;
        if (planoPago && tipoPlano.equals("Plus")) {
            System.out.println("Incluido no plano");
            incluidoNoPlano = true;
        } else {
            if (planoPago) {
                System.out.println("Faça o upgrade do seu plano");
            } else if (tipoPlano.equals("Plus")) {
                System.out.println("Pagamento pendente");
            } else {
                System.out.println("Pagamento pendente e plano sem cobertura");
            }
            incluidoNoPlano = false;
        }
        notaDoFilme = notaDoFilmeTopGunMaverick;
        if (incluidoNoPlano || notaDoFilme >= 7.0) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Faça o aluguel do filme");
        }

        System.out.println("=================================================");

        int anoDeLancamentoTopGun = 1986;
        double notaDoFilmeTopGun = 6.9;
        boolean planoPagoTopGun = false;
        String tipoPlanoTopGun = "Plus";

        System.out.println("Filme: Top Gun");
        anoDeLancamento = anoDeLancamentoTopGun;
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        planoPago = planoPagoTopGun;
        tipoPlano = tipoPlanoTopGun;
        if (planoPago && tipoPlano.equals("Plus")) {
            System.out.println("Incluido no plano");
            incluidoNoPlano = true;
        } else {
            if (planoPago) {
                System.out.println("Faça o upgrade do seu plano");
            } else if (tipoPlano.equals("Plus")) {
                System.out.println("Pagamento pendente");
            } else {
                System.out.println("Pagamento pendente e plano sem cobertura");
            }
            incluidoNoPlano = false;
        }
        notaDoFilme = notaDoFilmeTopGun;
        if (incluidoNoPlano || notaDoFilme >= 7.0) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Faça o aluguel do filme");
        }

        System.out.println("=================================================");

        int anoDeLancamentoTopGunEvolution = 2030;
        double notaDoFilmeTopGunEvolution = 4.8;
        boolean planoPagoTopGunEvolution = true;
        String tipoPlanoTopGunEvolution = "Plus";

        System.out.println("Filme: Top Gun Evolution");
        anoDeLancamento = anoDeLancamentoTopGunEvolution;
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        planoPago = planoPagoTopGunEvolution;
        tipoPlano = tipoPlanoTopGunEvolution;
        if (planoPago && tipoPlano.equals("Plus")) {
            System.out.println("Incluido no plano");
            incluidoNoPlano = true;
        } else {
            if (planoPago) {
                System.out.println("Faça o upgrade do seu plano");
            } else if (tipoPlano.equals("Plus")) {
                System.out.println("Pagamento pendente");
            } else {
                System.out.println("Pagamento pendente e plano sem cobertura");
            }
            incluidoNoPlano = false;
        }
        notaDoFilme = notaDoFilmeTopGunEvolution;
        if (incluidoNoPlano || notaDoFilme >= 7.0) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Faça o aluguel do filme");
        }

        System.out.println("=================================================");

        int anoDeLancamentoTopGunOrigins = 2050;
        double notaDoFilmeTopGunOrigins = 2.1;
        boolean planoPagoTopGunOrigins = false;
        String tipoPlanoTopGunOrigins = "Normal";

        System.out.println("Filme: Top Gun Origins");
        anoDeLancamento = anoDeLancamentoTopGunOrigins;
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        planoPago = planoPagoTopGunOrigins;
        tipoPlano = tipoPlanoTopGunOrigins;
        if (planoPago && tipoPlano.equals("Plus")) {
            System.out.println("Incluido no plano");
            incluidoNoPlano = true;
        } else {
            if (planoPago) {
                System.out.println("Faça o upgrade do seu plano");
            } else if (tipoPlano.equals("Plus")) {
                System.out.println("Pagamento pendente");
            } else {
                System.out.println("Pagamento pendente e plano sem cobertura");
            }
            incluidoNoPlano = false;
        }
        notaDoFilme = notaDoFilmeTopGunOrigins;
        if (incluidoNoPlano || notaDoFilme >= 7.0) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Faça o aluguel do filme");
        }
    }
}
