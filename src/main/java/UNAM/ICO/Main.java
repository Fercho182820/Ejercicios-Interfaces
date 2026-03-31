package UNAM.ICO;

import UNAM.ICO.Empleado.Empleado;
import UNAM.ICO.Empleado.EmpleadoBase;
import UNAM.ICO.Empleado.EmpleadoMedioTiempo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        EmpleadoBase E1 = new EmpleadoBase("Zy",321101,"Almacenista",12,4,8,50.00,400.00);
        System.out.println(E1);
        E1.calcularSalario();
        EmpleadoMedioTiempo E2 = new EmpleadoMedioTiempo("Nicolas",321102,"Empleado General",8,2,6,30.00,150.00);
        System.out.println(E2);
        E2.calcularSalario();
    }
    }
