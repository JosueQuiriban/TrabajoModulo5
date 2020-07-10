package cl.awakelab.beans;


public class Accidente {
    
    private int id_accidente;
    private String rut_empresa;
    private String nombre_empresa;
    private String tipo_accidente;
    private String fecha_accidente;
    private String lugar_accidente;
    private String detalle_accidente;
    private int id_cliente;
    
    public Accidente() {
        super();
    }

        public Accidente(int id_accidente, String rut_empresa, String nombre_empresa, String tipo_accidente,
                        String fecha_accidente, String lugar_accidente, String detalle_accidente, int id_cliente) {
                this.id_accidente = id_accidente;
                this.rut_empresa = rut_empresa;
                this.nombre_empresa = nombre_empresa;
                this.tipo_accidente = tipo_accidente;
                this.fecha_accidente = fecha_accidente;
                this.lugar_accidente = lugar_accidente;
                this.detalle_accidente = detalle_accidente;
                this.id_cliente = id_cliente;
        }
        
        public Accidente(String rut_empresa, String nombre_empresa, String tipo_accidente, String fecha_accidente,
                        String lugar_accidente, String detalle_accidente, int id_cliente) {
                this.rut_empresa = rut_empresa;
                this.nombre_empresa = nombre_empresa;
                this.tipo_accidente = tipo_accidente;
                this.fecha_accidente = fecha_accidente;
                this.lugar_accidente = lugar_accidente;
                this.detalle_accidente = detalle_accidente;
                this.id_cliente = id_cliente;
        }
        
        
        public Accidente(String rut_empresa, String nombre_empresa, String tipo_accidente, String fecha_accidente,
                        String lugar_accidente, String detalle_accidente) {
                this.rut_empresa = rut_empresa;
                this.nombre_empresa = nombre_empresa;
                this.tipo_accidente = tipo_accidente;
                this.fecha_accidente = fecha_accidente;
                this.lugar_accidente = lugar_accidente;
                this.detalle_accidente = detalle_accidente;
        }


        public String getRut_empresa() {
                return rut_empresa;
        }
        public void setRut_empresa(String rut_empresa) {
                this.rut_empresa = rut_empresa;
        }
        public String getNombre_empresa() {
                return nombre_empresa;
        }
        public void setNombre_empresa(String nombre_empresa) {
                this.nombre_empresa = nombre_empresa;
        }
        public String getTipo_accidente() {
                return tipo_accidente;
        }
        public void setTipo_accidente(String tipo_accidente) {
                this.tipo_accidente = tipo_accidente;
        }
        public String getFecha_accidente() {
                return fecha_accidente;
        }
        public void setFecha_accidente(String fecha_accidente) {
                this.fecha_accidente = fecha_accidente;
        }
        public String getLugar_accidente() {
                return lugar_accidente;
        }
        public void setLugar_accidente(String lugar_accidente) {
                this.lugar_accidente = lugar_accidente;
        }
        public String getDetalle_accidente() {
                return detalle_accidente;
        }
        public void setDetalle_accidente(String detalle_accidente) {
                this.detalle_accidente = detalle_accidente;
        }
        public int getId_accidente() {
                return id_accidente;
        }
        public int getId_cliente() {
                return id_cliente;
        } 

}
