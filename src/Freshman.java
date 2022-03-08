import java.util.Random;
public class Freshman extends Fisher{
    private int attempt = 10;
    int[] poss = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};

    @Override
    public int Fish() {
        int count=0;

        for(int i=0;i<attempt;i++)
        {
            Random rnd = new Random();
            int kac = rnd.nextInt(poss.length);

            if(poss[kac]==1)
            {
                //System.out.println("Fish was caught.");
                count++;
            }
            else if(poss[kac]==0) {
                //System.out.println("Fish was not caught.");
            }
        }
        if(count>6)
        {
            int x=count-6;
            System.out.println(" "+ x +" fish escaped from Freshman's hook!");
            System.out.println("Total number of fish caught by the Freshman:6");
        }
        else
        System.out.println("Total number of fish caught by the Freshman:"+count);

        return count;
    }
}
