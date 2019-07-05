
public class Movies{

    public static void main(String[] args) {


        String[] title = {"INDIANA JONES ET LE ROYAUME DU CRÂNE DE CRISTAL",
                "INDIANA JONES ET LA DERNIÈRE CROISADE",
                "INDIANA JONES ET LE TEMPLE MAUDIT"};

        String[][] actors = {

                             {"actor1", "actor2", "actor3"},
                              {"actor1", "actor2", "actor3"},
                              {"actor1", "actor2", "actor3"}
        };

        for(int i = 0; i < title.length; i++ ){

            System.out.println("Dans le film " + title[i] + "Les principaux acteurs sont : " );
            for(int j = 0; j < actors[i].length; j++){

                System.out.println(actors[i][j]);

            }


        }


    };

}