package Creational.Builder;

public class EvBuilder {
    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int banyoSyisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasKlima;
    private boolean hasCocukParki;
    private boolean hasHavuz;

    private EvBuilder() {
        // Private constructor
    }

    public static EvBuilder startNormalHomeBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi,
            int tuvaletSayisi) {
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.setIl(il);
        evBuilder.setIlce(ilce);
        evBuilder.setMahalle(mahalle);
        evBuilder.setBinaYili(binaYili);
        evBuilder.setOdaSayisi(odaSayisi);
        evBuilder.setBanyoSayisi(banyoSayisi);
        return evBuilder; // Return the configured instance, not a new one
    }

    public static EvBuilder startHavuzluHomeBuilder(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi,
            int tuvaletSayisi) {
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.setIl(il);
        evBuilder.setIlce(ilce);
        evBuilder.setMahalle(mahalle);
        evBuilder.setBinaYili(binaYili);
        evBuilder.setOdaSayisi(odaSayisi);
        evBuilder.setBanyoSayisi(banyoSayisi);
        evBuilder.setHasHavuz(true);
        return evBuilder; // Return the configured instance, not a new one
    }

    public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setBinaYili(int binaYili) {
        this.binaYili = binaYili;
        return this;
    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBanyoSyisi(int banyoSyisi) {
        this.banyoSyisi = banyoSyisi;
        return this;
    }

    public EvBuilder setDublex(boolean isDublex) {
        this.isDublex = isDublex;
        return this;
    }

    public EvBuilder setEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }

    public Home build() {
        return new Home(il, ilce, mahalle, binaYili, odaSayisi,
                banyoSayisi, tuvaletSayisi, banyoSyisi, isDublex,
                isEsyali, hasOtopark, hasKlima, hasCocukParki,
                hasHavuz);
    }
}
