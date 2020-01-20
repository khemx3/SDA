package lab2.lab2Code;

public class GameCharacterHendrix extends GameCharacter {


    public GameCharacterHendrix() {
        guitarBehavior = new Guitar_GibsonSG();
        soloBehavior = new Solo_JumpOffStage();
    }
}
