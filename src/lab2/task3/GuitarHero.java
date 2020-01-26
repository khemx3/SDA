package lab2.task3;

import java.util.Arrays;
import java.util.List;

public class GuitarHero {
    public static void main(String args[]) {

        List<GameCharacter> characters = Arrays.asList(
                new CharacterAngusYoung(),
                new CharacterSlash(),
                new CharacterJimiHendrix()
        );

        GuitarBehavior[] guitars = new GuitarBehavior[] {
                new GuitarGibsonLP(), new GuitarGibsonSG(), new GuitarTelecaster()
        };

        SoloBehavior[] solos = new SoloBehavior[] {
                new SoloGuitarOnFire(), new SoloJumpOffStage(), new SoloSmashTheGuitar()
        };

        for(int i = 0; i < characters.size(); i++){
            GameCharacter gc = characters.get(i);
            GuitarBehavior guitar = guitars[i];
            SoloBehavior solo = solos[i];

            gc.setGuitarBehavior(guitar).setSoloBehavior(solo);
        }

        for(GameCharacter player: characters) {
            System.out.println();
            player.sayName();
            player.playGuitar();
            player.performSolo();
        }
    }
}
