package executavel;

public class ProjetoVideo {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 3 de MYSQL");
		v[2] = new Video("Aula 5 de CSS3");
		
		v[0].play();
		v[0].pause();

//		System.out.println(v[0].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Gabriel", 25, "m", "gabi65");
		g[1] = new Gafanhoto("Isabel", 18, "f", "isa94");
		
		Visualizacao visu[] = new Visualizacao[5];
		
		visu[0] = new Visualizacao(g[0], v[2]);
		visu[0].avaliar();
		System.out.println(visu[0].toString());
		
		visu[1] = new Visualizacao(g[0], v[1]);
		visu[0].avaliar(87f);
		System.out.println(visu[1].toString());
		
//		System.out.println("Videos: ");
//		System.out.println(v[0].toString());
//		System.out.println(v[1].toString());
//		System.out.println(v[2].toString());
//		
//		System.out.println("Alunos: ");
//		System.out.println(g[0].toString());
//		System.out.println(g[1].toString());
		
	}

}
