package game;

import java.util.List;

/**
 * Created by cloudera on 12/2/16.
 */
public interface GuessGameService {
    public void play(Player player, int max);

    public void printBestScore(Player player);

    public void printBestScore(List<Player> players);
}
