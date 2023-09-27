package com.dawii.qaerick;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dawii.qaerick.controllers.ComentarioController;
import com.dawii.qaerick.controllers.EtiquetaController;
import com.dawii.qaerick.controllers.PublicacionController;
import com.dawii.qaerick.models.Comentario;
import com.dawii.qaerick.models.Etiqueta;
import com.dawii.qaerick.models.Publicacion;

@SpringBootApplication
public class T1ErickQuispeAldazabalApplication {

	public static void main(String[] args) {
		SpringApplication.run(T1ErickQuispeAldazabalApplication.class, args);
	}

	@Bean
	public CommandLineRunner testMain(PublicacionController publicacionController, EtiquetaController etiquetaController, ComentarioController comentarioController) {
		return args -> {
			Date fecha = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			Publicacion publicacion1 = new Publicacion();
			publicacion1.setPubNom("Publicacion UNO");
			publicacion1.setPubCon("Primera publicacion...");
			publicacion1.setPubFch(sdf.format(fecha));
			
			if (publicacionController.registrarPublicacion(publicacion1) != null) {
				System.out.println("Se registro la publicacion exitosamente.");
			}
			
			Etiqueta etiqueta1 = new Etiqueta();
			etiqueta1.setEtiNom("Pedro Salas");
			etiqueta1.setEtiFch(sdf.format(fecha));
			etiqueta1.setPublicacion(publicacion1);
			
			Etiqueta etiqueta2 = new Etiqueta();
			etiqueta2.setEtiNom("Maria Flores");
			etiqueta2.setEtiFch(sdf.format(fecha));
			etiqueta2.setPublicacion(publicacion1);
			
			if (etiquetaController.registrarEtiqueta(etiqueta1) != null) {
				System.out.println("Se registro la etiqueta exitosamente.");
			}
			if (etiquetaController.registrarEtiqueta(etiqueta2) != null) {
				System.out.println("Se registro la etiqueta exitosamente.");
			}
			
			Comentario comentario1 = new Comentario();
			comentario1.setComCon("Primer comentario...");
			comentario1.setComFch(sdf.format(fecha));
			comentario1.setPublicacion(publicacion1);
			
			Comentario comentario2 = new Comentario();
			comentario2.setComCon("Segundo comentario...");
			comentario2.setComFch(sdf.format(fecha));
			comentario2.setPublicacion(publicacion1);
			
			if (comentarioController.registrarComentario(comentario1) != null) {
				System.out.println("Se registro el comentario exitosamente.");
			}
			if (comentarioController.registrarComentario(comentario2) != null) {
				System.out.println("Se registro el comentario exitosamente.");
			}
			
			Publicacion pubRecuperada = publicacionController.buscarPublicacion(1);
			Etiqueta etiRecuperada = etiquetaController.buscarEtiqueta(2);
			Comentario comRecuperado = comentarioController.buscarComentario(1);
			
			System.out.println("********** Busqueda Publicacion **********");
			System.out.println(pubRecuperada.getPubNom());
			System.out.println(pubRecuperada.getPubCon());
			System.out.println(pubRecuperada.getPubFch());
			System.out.println("********** Busqueda Etiqueta **********");
			System.out.println(etiRecuperada.getEtiNom());
			System.out.println(etiRecuperada.getEtiFch());
			System.out.println("********** Busqueda Comentario **********");
			System.out.println(comRecuperado.getComCon());
			System.out.println(comRecuperado.getComFch());
		};
	}
}
