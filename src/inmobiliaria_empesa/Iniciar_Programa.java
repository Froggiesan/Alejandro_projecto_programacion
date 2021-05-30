package inmobiliaria_empesa;

import inmobiliaria_empesa.interfaces_principales.*;
import inmobiliaria_empesa.modificarBBDD.Modificar_pisos;

public class Iniciar_Programa {

    public static void main(String[] args) {
        Home_pre_login iniciarPrograma = new Home_pre_login();
        iniciarPrograma.setVisible(true);

    }
    
}
