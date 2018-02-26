package test;
import java.util.*;
import java.lang.*;

public class GameWheel {
  private ArrayList<PrizeCard> prizeCards;
  private int currentPos;

  public GameWheel() {
    prizeCards = new ArrayList<PrizeCard>();
    currentPos = 0;
    prizeCards = initGameWheel();
    prizeCards = scramble();
  }

  public ArrayList<PrizeCard> initGameWheel() {
    ArrayList<PrizeCard> init = new ArrayList<PrizeCard>();
    for (int i=1; i <= 40; i++) {
      if (i%2 == 1)
        init.add(new PrizeCard(i, "red", i*10));
      else if (i%10 == 0)
        init.add(new PrizeCard(i, "black", i*200));
      else
        init.add(new PrizeCard(i, "blue", i*100));
    }
    return init;
  }

  public ArrayList<PrizeCard> getPrizeCards() {
    return prizeCards;
  }

  public ArrayList<PrizeCard> scramble() {


    ArrayList<PrizeCard> scrambled = new ArrayList<PrizeCard>();

      /* write your code here */

    return scrambled;
  }

  public PrizeCard spinWheel() {
    //spin power between range of 1-100 (inclusive)
    int power = (int)(Math.random()*100 + 1);
    int newPos = (currentPos + power) % prizeCards.size();
    currentPos = newPos;
    return prizeCards.get(currentPos);
  }


}
