package pl.wat.backend.dto;

import java.util.List;

public class DTOSala {

    private int salaNumber;
    private List<List<Integer>> repertuar;

    // Konstruktor dla danych związanych z repertuarem
    public DTOSala(int salaNumber, List<List<Integer>> repertuarList) {
        this.salaNumber = salaNumber;
        this.repertuar = repertuarList;
    }

    // Gettery i Settery
    public int getSalaNumber() {
        return salaNumber;
    }

    public void setSalaNumber(int salaNumber) {
        this.salaNumber = salaNumber;
    }

    public List<List<Integer>> getRepertuar() {
        return repertuar;
    }

    public void setRepertuar(List<List<Integer>> repertuar) {
        this.repertuar = repertuar;
    }
}
