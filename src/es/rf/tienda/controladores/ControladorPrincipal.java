package es.rf.tienda.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import es.rf.tienda.dominio.Categoria;
import es.rf.tienda.dominio.Usuario;
import es.rf.tienda.vistas.VistaCategoria;
import es.rf.tienda.vistas.VistaListadoCategorias;
import es.rf.tienda.vistas.VistaListadoUsuarios;
import es.rf.tienda.vistas.VistaPrincipal;
import es.rf.tienda.vistas.VistaUsuario;

public class ControladorPrincipal {
	private VistaPrincipal v;
    
	
    //constructor
	public ControladorPrincipal(VistaPrincipal vista) {
        this.v = vista;
    }
	
	public void iniciar() {
		v.clickEnBotonListadoCategorias(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.dispose();

				Categoria cat1 = new Categoria(0, "categoria 1", "esta es la categoria 1");
				Categoria cat2 = new Categoria(1, "categoria 2", "esta es la categoria 2");
				Categoria cat3 = new Categoria(2, "categoria 3", "esta es la categoria 3");

				ArrayList<Categoria> data = new ArrayList<>();

				for (int i = 1; i < 5; i++) {
					data.add(cat1);
					data.add(cat2);
					data.add(cat3);
				}

				VistaListadoCategorias vListadoCategorias = new VistaListadoCategorias();
				vListadoCategorias.agregarListado(data);
				vListadoCategorias.volverALaVistaAnterior(v);
				vListadoCategorias.iniciarVista();
			}

		});

		v.clickEnBotonListadoUsuarios(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.dispose();

				Usuario usr1 = new Usuario();
				Usuario usr2 = new Usuario();
				Usuario usr3 = new Usuario();

				usr1.setId_usuario(2);
				usr2.setId_usuario(122);
				usr3.setId_usuario(3232);

				usr1.setUser_nombre("Jorge");
				usr2.setUser_nombre("Maria");
				usr3.setUser_nombre("Lucas");

				usr1.setUser_email("Jorge@asd.com");
				usr2.setUser_email("Maria@asd.com");
				usr3.setUser_email("Lucas@asd.com");

				ArrayList<Usuario> data = new ArrayList<>();

				for (int i = 1; i < 5; i++) {
					data.add(usr1);
					data.add(usr2);
					data.add(usr3);
				}

				VistaListadoUsuarios vListadoUsuarios = new VistaListadoUsuarios();
				vListadoUsuarios.agregarListado(data);
				vListadoUsuarios.volverALaVistaAnterior(v);
				vListadoUsuarios.iniciarVista();
			}

		});

		v.clickEnBotonNuevaCategoria(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.dispose();

				VistaCategoria vCategoria = new VistaCategoria();
				vCategoria.volverALaVistaAnterior(v);
				vCategoria.iniciarVista();

			}

		});

		v.clickEnBotonNuevoUsuario(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				v.dispose();

				VistaUsuario vUsuario = new VistaUsuario();
				vUsuario.volverALaVistaAnterior(v);
				vUsuario.iniciarVista();
			}

		});
		v.iniciarVista();
	}
}
