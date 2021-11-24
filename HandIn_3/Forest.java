import java.util.ArrayList;

public class Forest 
{
    private ArrayList<Tree> trees;

    public Forest()
    {
        trees = new ArrayList<>();
    }

    public void addTree(int growthPct)
    {
        // trees.add(new Tree(growthPct));
        // trees.add(newTree)
        trees.add(new Tree(growthPct));
    }

    public String toString()
    {
        // if
        String t = "Forest(";
        for(Tree tree : trees) {
            t += tree.toString();
            // t = t + tree.toString();
        }
        t += ')';
        return t;
        /* return "Forest(" + Tree + 
        "(" + age + ", " + height + 
        ")Tree(" + age = 1, height = 0.25)Tree(age = 1, height = 0.25))"; */
    }

    public void growOneYear(){
        for(Tree tree : trees) {
            tree.growOneYear();
        }
    }
}