package br.com.devdojo.maratonajsf.bean.estudiante;


import br.com.devdojo.maratonajsf.model.Estudiante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by Windows 10 Turbo (L) on 23/04/2017.
 */
@Named
public class EstudianteRegistrarBean implements Serializable {
    private Estudiante estudiante = new Estudiante();

    private String[] nombresArray={"DevDojo","eh","foda"};
    private List<String> nombresList=asList("Abba","Heide","Gabriel","Luis");
    private Set<String> nombresSet = new HashSet<>(asList("Goku","Luffy","Naruto","Crilin"));
    private Map<String,String> nomesMap=new HashMap<>();

    {
        nomesMap.put("Goku", "el mas fuerte");
        nomesMap.put("One Piece","El mas largo");
        nomesMap.put("Naruto","O com mais lenga lenga");
        nomesMap.put("Krilin","El que mas ha resucitado");

//        for(Map.Entry<String, String> entry:nomesMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

    }

    public void executar(){
        System.out.println("Haciendo busqueda en la base de datos");
        System.out.println("Procesando datos");
        System.out.println("Exhibiendo los datos");
    }
    public void executar(String param){
        System.out.println("Haciendo busqueda en la base de datos con PARAMETROS " +param);
        System.out.println("Procesando datos");
        System.out.println("Exhibiendo los datos");
    }

    public String executarRetorno(String param){
       return "Que lindo ?" +param;
    }

    public String IrParaIndex2(){
        System.out.println("Entro con action Listener");
       return "index2?faces-redirect=true";
    }


    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String[] getNombresArray() {
        return nombresArray;
    }

    public void setNombresArray(String[] nombresArray) {
        this.nombresArray = nombresArray;
    }

    public List<String> getNombresList() {
        return nombresList;
    }

    public void setNombresList(List<String> nombresList) {
        this.nombresList = nombresList;
    }

    public Set<String> getNombresSet() {
        return nombresSet;
    }

    public void setNombresSet(Set<String> nombresSet) {
        this.nombresSet = nombresSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }
}
