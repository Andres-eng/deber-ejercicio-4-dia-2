public class Carro{
	private float precio;
	private String dueno, placa;
	public Carro(float precio,String dueno, String placa){
		this.precio=precio;
		this.placa=placa;
		
	}
	public void precio(float precio){
		precio=precio;
	}
	public float getPrecio(){
		return precio;
	}
	public void setDueño(String dueno){
		dueno=dueno;
	}
	public String getDueno(){
		return dueno;
	}
	public void setPlaca(String placa){
		dueno=dueno;
	}
	public String getPlaca(){
		return placa;
	}
	public void Impresion(){
		System.out.println(getPlaca());
		System.out.println(getDueno());
		System.out.println(getPrecio());
	}
}