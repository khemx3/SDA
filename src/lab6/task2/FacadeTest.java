package lab6.task2;

public class FacadeTest {

  public static void main(String[] args) {
    TeaFacade teaMaker = new TeaFacade(new TeaCup(), new Water(), new TeaInfuser());
    teaMaker.makeTea("Earl Grey");
  }
}
