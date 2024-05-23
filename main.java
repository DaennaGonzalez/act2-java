public class Main {
    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 78, 92, 88};
        Alumno alumno = new Alumno("Juan Pérez", calificaciones);
        alumno.imprimirResultados();
    }
}

