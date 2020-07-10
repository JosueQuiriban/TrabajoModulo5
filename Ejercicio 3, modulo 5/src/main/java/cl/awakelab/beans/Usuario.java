package cl.awakelab.beans;

public class Usuario {

	    private int id_usuario;
	    private String username;
	    private String password;
	    private String fecha_registro;
	    static final String CONTRASENA= "12345";
	    
	    public Usuario() {
	    	
	    }
	    
	    public Usuario(int id_usuario) {
	        super();
	        this.id_usuario = id_usuario;
	    }

	    public Usuario(String username, String password, String fecha_registro) {
	        super();
	        this.username = username;
	        this.password = CONTRASENA;
	        this.fecha_registro = fecha_registro;
	    }

	    public Usuario(int id_usuario, String username, String password, String fecha_registro) {
	        super();
	        this.id_usuario = id_usuario;
	        this.username = username;
	        this.password = CONTRASENA;
	        this.fecha_registro = fecha_registro;
	    }

	    public int getId_usuario() {
	        return id_usuario;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getFecha_registro() {
	        return fecha_registro;
	    }

	    public void setFecha_registro(String fecha_registro) {
	        this.fecha_registro = fecha_registro;
	    }

	    public void setId_usuario(int id_usuario) {
	        this.id_usuario = id_usuario;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	}