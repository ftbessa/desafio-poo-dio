package br.com.fio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCarcaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCarcaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootecamp bootecamp = new Bootecamp();
        bootecamp.setNome("Bootcamp Java Developer");
        bootecamp.setDescricao("Descrição Bootcamp Java Developer");
        bootecamp.getConteudos().add(curso1);
        bootecamp.getConteudos().add(curso2);
        bootecamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootecamp);
        System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila: " +devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootecamp);
        System.out.println("Conteúdos inscritos João: " +devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " +devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: " +devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
    }
