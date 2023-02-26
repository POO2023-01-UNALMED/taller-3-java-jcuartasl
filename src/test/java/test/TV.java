package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV = 0;
	
	public TV(Marca ma,boolean est) {
		marca = ma;
		estado = est;
		TV.numTV++;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if (estado == true){
			if (canal++ <= 120) {
				canal = canal++;		}
		}
	}
	
	public void canalDown() {
		if (estado == true){
			if (canal-- >= 1) {
				canal = canal--;
			}
		}
	}
	
	public void volumenUp() {
		if (estado == true){
			if (volumen++ <= 7) {
				volumen = volumen++;
			}
		}
	}
	public void volumenDown() {
		if (estado == true){
			if (volumen-- >= 0) {
				volumen = volumen--;
			}
		}
	}
	
	//GETTERS Y SETTERS
	public void setMarca(Marca ma) {
		this.marca = ma;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control ctrl) {
		this.control = ctrl;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int pre) {
		this.precio = pre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int vol) {
		if (estado == true && vol<=7) {
			this.volumen = vol;
		}
		
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int cn) {
		if (estado = true && cn<=120) {
			this.canal = cn;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public boolean getEstado() {
		return estado;
	}
}
