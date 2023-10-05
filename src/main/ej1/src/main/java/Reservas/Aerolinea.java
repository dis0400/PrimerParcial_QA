package Reservas;

public class Aerolinea {
    public boolean existenPasajes(String destino, int cantidad) {
        return false;
    }
    public String getDay(int dia, int mes, int gestion) {

        return "DíaDesconocido";
    }

    public String reservaVuelo(String destino, int dia, int mes, int gestion) {
        String mesStr = "";

        switch (mes) {
            case 1: mesStr = "Enero"; break;
            case 2: mesStr = "Febrero"; break;
            case 3: mesStr = "Marzo"; break;
            case 4: mesStr = "Abril"; break;
            case 5: mesStr = "Mayo"; break;
            case 6: mesStr = "Junio"; break;
            case 7: mesStr = "Julio"; break;
            case 8: mesStr = "Agosto"; break;
            case 9: mesStr = "Septiembre"; break;
            case 10: mesStr = "Octubre"; break;
            case 11: mesStr = "Noviembre"; break;
            case 12: mesStr = "Diciembre"; break;
            default: mesStr = "MesDesconocido"; break;
        }

        String diaStr = getDay(dia, mes, gestion);

        if (existenPasajes(destino, 2)) { // Suponemos que deseas reservar 2 pasajes.
            return "el día " + diaStr + " " + dia + " " + mesStr + " " + gestion + " existen 2 pasajes para " + destino;
        } else {
            return "no existen suficientes pasajes para " + destino;
        }
    }

    public static void main(String[] args) {
        Aerolinea aerolinea = new Aerolinea();
        String resultado = aerolinea.reservaVuelo("La Paz", 29, 5, 2023);
        System.out.println(resultado);
    }
}

