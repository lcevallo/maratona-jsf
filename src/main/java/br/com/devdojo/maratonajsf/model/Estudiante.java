package br.com.devdojo.maratonajsf.model;

import br.com.devdojo.maratonajsf.model.enums.Turno;

/**
 * Created by Windows 10 Turbo (L) on 27/04/2017.
 */
public class Estudiante {

    private String  nombre= "Gabriel";
    private  String apellido="Cevallos";

    private double nota1;
    private double nota2;
    private double nota3=10;

    private Turno turno=Turno.MATUTINO;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
