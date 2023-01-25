package br.com.fio.desafio.dominio;

public class Curso  extends Conteudo {
    private int carcaHoraria;

    @Override
    public double calculaXp() {
        return XP_PADRAO * carcaHoraria;
    }

    public Curso() {
    }
       public int getCarcaHoraria() {
        return carcaHoraria;
    }

    public void setCarcaHoraria(int carcaHoraria) {
        this.carcaHoraria = carcaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carcaHoraria=" + carcaHoraria +
                '}';
    }



}
