java
import java.io.File;

public class ListadoRecursivo {

    public static void main(String[] args) {
        String ruta= "C:\\Usuarios\\lak_q\\Documentos";
        listarDirectorio= new File(ruta);
        lis(directorio);
    }

    public static void listarDirectorio(File directorio) {
        File[] archivos = directorio.listFiles();
        if (file.isDirectory()) {
            System.out.println("Directorio: " + file.getName());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFiles(f);
                }
            }
        } else {
            System.out.println("Fichero: " + file.getName());
        }
    }
}

