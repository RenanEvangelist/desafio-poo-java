package desafio;

import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do zero ao avançado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Aprenda a criar APIs com Spring Boot");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Carreira");
        mentoria1.setDescricao("Dicas para ingressar no mercado de TI");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp completo para devs Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRenan = new Dev();
        devRenan.setNome("Renan Evangelista");
        devRenan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Renan: " + devRenan.getConteudosInscritos());
        devRenan.progredir();
        devRenan.progredir();
        System.out.println("Conteúdos Concluídos Renan: " + devRenan.getConteudosConcluidos());
        System.out.println("XP: " + devRenan.calcularTotalXp());

        System.out.println("---------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria Silva");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
