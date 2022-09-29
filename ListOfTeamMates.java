import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListOfTeamMates {
    public static void main(String[] args) {
        ArrayList<TeamMate> listaTeamMates = new ArrayList<>();
        ArrayList<String> listaNomes = new ArrayList<String>(Arrays.asList("Pedro", "Eduardo", "Lucas", "Gabriel", "João"));

        inicializarLista(listaTeamMates, listaNomes);
        mostraLista(listaTeamMates);
        mostrarOnlines(listaTeamMates);
    }

    private static void inicializarLista(ArrayList<TeamMate> listaTeamMates, ArrayList<String> listaNomes) {
        Integer contador=0;
        for(String nome : listaNomes){
            TeamMate mate = new TeamMate(String.valueOf(contador), nome, (contador%2==0));
            listaTeamMates.add(mate);
            contador++;
        }
        TeamMate mate = new TeamMate();
        mate.setName("Júlio");
        mate.setUserId(String.valueOf(contador));
        mate.setOnline(true);
        listaTeamMates.add(mate);
    }

    private static void mostrarOnlines(ArrayList<TeamMate> listaTeamMates) {
        System.out.println("Lista de IDs de Team Mates onlines");
        for(TeamMate mate : listaTeamMates){
            if(mate.getOnline()){
                System.out.println(mate.getUserId());
            }
        }
    }

    private static void mostraLista(ArrayList<TeamMate> listaTeamMates) {
        System.out.println("Lista de nomes de Team Mates:");
        for(TeamMate mate : listaTeamMates){
            System.out.println(mate.getName());
        }
    }
}
