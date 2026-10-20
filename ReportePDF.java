public class ReportePDF implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println(" REPORTE PDF ");
        System.out.println("contenido: " + contenido);
        System.out.println("exportando en formato PDF");
    }
}
