public class ReporteHTML implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println("REPORTE HTML ");
        System.out.println("contenido: " + contenido);
        System.out.println("exportando en formato HTML");
    }

}
