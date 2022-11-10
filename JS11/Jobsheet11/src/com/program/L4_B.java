package com.program;
// Crated by 21343017_Aldhy

public class L4_B extends L4_A{
    
    private int b;

    public void setB(int nilai){
        b = nilai;
    }
    public  int getB(){
        return b;
    }

    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = " + getB());
    }
}
