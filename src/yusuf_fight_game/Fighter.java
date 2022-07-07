package yusuf_fight_game;

public class Fighter extends Game implements Tournament{
  public Fighter(String name, int strength, int punchDamage) {
    super(name, strength, punchDamage);
  }

  private boolean didLose = false;

  public boolean getDidLose() {
    return didLose;
  }

  public void setDidLose(boolean didLose) {
    this.didLose = didLose;
  }
}
