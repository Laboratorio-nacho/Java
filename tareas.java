import java.util.ArrayList;
import java.util.Scanner;

public class tareas {
    static void menu(){
        System.out.println("1- Ingrese titulo , descripcion de la tarea  y si esta hecha o no  ");
        System.out.println("2- Eliminar Tarea ");
        System.out.println("3- Modificar ");
        System.out.println("4- Cambiar el estado entre realizado y no realizado");
        System.out.println("5- salir ");
    
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion=0,e,ed;
        String titulo,descripcion,nv,nd,ne,estado;
        ArrayList<String>lista=new ArrayList<>(),l_descripcion=new ArrayList<>(),l_estado=new ArrayList<>();



        while (opcion!=6) {
            menu();
            opcion = entrada.nextInt();
            if (opcion==1) {
                System.out.println("Ingrese titulo");
                titulo=entrada.next();
                System.out.println("ingrese descripcion");
                descripcion=entrada.next();
                System.out.println("realizada o no reaizada?");
                estado=entrada.next();
                lista.add(titulo);
                l_descripcion.add(descripcion);
                l_estado.add(estado);

            }
            else if(opcion==2){
                System.out.println("ingrese indice a eliminar");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i+" "+lista.get(i)+" "+l_descripcion.get(i)+" "+l_estado.get(i));
   
                }
                e=entrada.nextInt();
                lista.remove(e);
                l_descripcion.remove(e);
                l_estado.remove(e);
            }

            else if (opcion==3) {
                System.out.println("ingrese indice a editar");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i+" "+lista.get(i)+" "+l_descripcion.get(i));

                    
                }
                ed=entrada.nextInt();
                System.out.println("ingrese nuevo titulo");
                nv=entrada.next();
                System.out.println("ingrese nueva descripcion");
                nd=entrada.next();
                lista.set(ed,nv);//(indice y nuevo elemnto)
                l_descripcion.set(ed,nd);

            }
            else if (opcion==4){
                System.out.println("ingrese indice a estado de tarea a editar");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i+" "+lista.get(i)+" "+l_descripcion.get(i)+" "+l_estado.get(i));
   
                
                }
                ed=entrada.nextInt();
                System.out.println("ingres nuevo estado de la tarea");
                ne=entrada.next();
                l_estado.set(ed, ne);

            }

            
        }

        entrada.close();




    }
    
}
