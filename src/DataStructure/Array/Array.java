
package DataStructure.Array;

public class Array 
{
    
}
class GameEntry
{
    String name;
    int score;

    public GameEntry(String name, int score) 
    {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    
    }
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry{" + "name=" + name + ", score=" + score + '}';
    }
}

class ScoreBoard
{
    int numEntries = 0;
    GameEntry[] board;
    
    public ScoreBoard(int capacity) 
    {
        board = new GameEntry[capacity];
    }
    
    
}