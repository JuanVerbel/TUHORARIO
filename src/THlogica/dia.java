package THlogica;

public class dia {

    private int dia;
    private int hd; //Hora entrada
    private int md; //Minutos de entrada
    private int hds; //Hora salida
    private int mds; //Minutos de salida

    public dia sig;
    public dia ant;

    public dia(int dia, int hd, int hds, int md, int mds) {
        this.dia = dia;
        this.hd = hd;
        this.hds = hds;
        this.md = md;
        this.mds = mds;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getHds() {
        return hds;
    }

    public void setHds(int hds) {
        this.hds = hds;
    }

    public int getMd() {
        return md;
    }

    public void setMd(int md) {
        this.md = md;
    }

    public int getMds() {
        return mds;
    }

    public void setMds(int mds) {
        this.mds = mds;
    }
    
    
    
    
    //DEVUELVE LA CONVERSIÓN DEL NUMERO AL DÍA
    public static String nombreDia(int dia) {
        String nombre = "";
        switch (dia) {
            case 0:
                nombre = "Lun ";
                break;
            case 1:
                nombre = "Mar ";
                break;
            case 2:
                nombre = "Mie ";
                break;
            case 3:
                nombre = "Jue ";
                break;
            case 4:
                nombre = "Vie ";
                break;
            case 5:
                nombre = "Sáb ";
                break;

        }
        return nombre;
    }
    
    public static String nombreDiacomp(int dia) {
        String nombre = "";
        switch (dia) {
            case 0:
                nombre = "Lunes";
                break;
            case 1:
                nombre = "Martes";
                break;
            case 2:
                nombre = "Miercoles";
                break;
            case 3:
                nombre = "Jueves";
                break;
            case 4:
                nombre = "Viernes";
                break;
            case 5:
                nombre = "Sábado";
                break;

        }
        return nombre;
    }
    

    public static String convertirHora(int horaM, int m) {
        int h = horaM;

        // Convertir la hora a formato de 12 horas
        String horaMilitar = (h < 12) ? "am" : "pm";
        h = (h == 12) ? 12 : h % 12;
        String mm = (m >= 10) ?  ""+(m) : ("0" + m);
        return h + ":" + mm + " " + horaMilitar;
    }

    //RETORNA SI SE CRUZA EL DIA CON LA HORA DADA
    public boolean cruza(int day, int start, int end, int mst, int mend) {
        return (day == this.dia && !((hds + mds/60.0 <= start + mst/60.0) || end + mend/60.0 <= hd + md/60.0));
    }

    public String encript() {
        return (char) (dia + 97) + "" + (char) (hd + 97) + "" + ((md >= 10) ? (""+md) : ("0" + md) ) + "" + (char) (hds + 97) + "" + ((mds >= 10) ? (""+mds) : ("0" + mds) );
    }
    
    public double Hcant(){
        return hds - hd + (mds - md)/60.0;
    }
    
}
