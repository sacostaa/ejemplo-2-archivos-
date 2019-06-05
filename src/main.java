import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class main {
    
    public static void main(String[] args) {
        ArrayList <Liga> ligas = new ArrayList<Liga>();
        File f = new File ("hamlet.txt");
        if (f.exists()){
            try {
                Scanner input = new Scanner(f);
                if(input.hasNextInt()){
                  int numeroligas = input.nextInt();
                  
                    for (int i = 0; i < numeroligas; i++) {
                        String nombreliga = input.next();
                        Liga liga = new Liga (nombreliga);
                        if(input.hasNextInt()){
                            int numeroequipos = input.nextInt();
                            for (int j = 0; j < numeroequipos; j++) {
                                liga.addequipo(input.next());
                            }
                            ligas.add(liga);
                        }
                    }
                    
                    File archivosalida = new File ("salida.txt");
                    PrintStream salida = null;
                    if (!archivosalida.exists()) 
                          try {
                              archivosalida.createNewFile();
                  } catch (IOException ex) {
                              System.out.println("ECXEPCION");
                  }
                        
                        try{
                          
                            salida = new PrintStream (archivosalida);
                            for(Liga liga : ligas){
                                
                            
                            for (Equipo equipo : liga.getEquipos()) {
                                salida.println(equipo.getNombre());
                                System.out.println(equipo.getNombre());
                            }
                            }
                            salida.flush();
                            salida.close();
                            
                        }catch (IOException s){
                            System.out.println("excepcion");
                        }
                    
                }
            }catch(FileNotFoundException ex){
                System.out.println("no encontro archivo");
            }
        }
        int count = 0;
        
    }
    
}
