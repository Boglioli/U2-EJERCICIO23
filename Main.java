public class Main {
    public static void main(String[] args) {
        String datos = "ventas del mes: $500.000";
        GeneradorReporte pdf = new ReportePDF();
        SistemaGestion sistemaPDF = new SistemaGestion(pdf);
        sistemaPDF.generarReporte(datos);
        System.out.println();
        GeneradorReporte excel = new ReporteExcel();
        SistemaGestion sistemaExcel = new SistemaGestion(excel);
        sistemaExcel.generarReporte(datos);
        System.out.println();
        GeneradorReporte html = new ReporteHTML();
            SistemaGestion sistemaHTML = new SistemaGestion(html);
            sistemaHTML.generarReporte(datos);

    }
}
