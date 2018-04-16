package com.altia.formacion.spring.sistemasonido;

//@Component
public class CDPlayer implements MediaPlayer {

	//@Autowired
	private CompactDisc cd;
	
//	@Autowired
	public CDPlayer(CompactDisc compact) {
		this.cd = compact;
	}

	public CDPlayer() {
		//super();
	}
	
//	@Autowired
//	public void setCompactDisc(CompactDisc cd) {
//		this.cd = cd;
//	}
	
	//@Autowired(required=false)
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		System.out.print("Intentando reproducir CD: ");
		if(cd == null)
			System.out.println("No hay CD");
		else
			cd.play();
	}

}
