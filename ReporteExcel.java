public class ReporteExcel implements GeneradorReporte {
    @Override
    public void exportar(String contenido) {
        System.out.println("REPORTE EXCEL ");
        System.out.println("contenido: " + contenido);
        System.out.println("exportando en formato excel");
    }
}
