package com.sam;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Buku {

    @NotNull
    @Size(min = 5, max = 5, message = "panjang kode harus 5 karakter")
    private String kode;
    @NotNull
    private String judul;
    @NotNull
    private String penulis;
    @NotNull
    private String penerbit;
    @NotNull
    @Min(value = 2000, message = "minimal tahum adalah 2000")
    private int tahun_terbit;
    @Size(min = 5, max = 5)
    private String isbn;

    public Buku() {}

    public Buku(
            @NotNull @Size(min = 5, max = 5, message = "panjang kode harus 5 karakter") String kode,
            @NotNull String judul,
            @NotNull String penulis,
            @NotNull String penerbit,
            @NotNull @Min(value = 2000, message = "minimal tahum adalah 2000") int tahun_terbit,
            @Size(min = 5, max = 5) String isbn) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
        this.isbn = isbn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
