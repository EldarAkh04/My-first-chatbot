import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.HashMap;

/**
 * This class is intended for the generated responses.
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    private HashMap<String, String> responseMap;

    /**
     * Constructor for objects of class Responder
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<>();
        fillResponse(); 
        responseMap = new HashMap<>();
        fillResponseMap();
    }

    /*public void fillResponses()
    {
        responses.add("Don't be sad");
        responses.add("Cheer up!");
        responses.add("It's okay to feel lonely sometimes.");
    }*/

    public String generateResponse(HashSet<String> words)
    {
        for(String word : words){
            String response = responseMap.get(word);
            if(response !=null){
                return response;
            }
        }

        return randomResponse();
    }

    private
    void fillResponseMap()
    {
        responseMap.put("sad",
            "Be strong!");
    }

    private void fillResponse()
    {
        responses.add("You have to explain it to me in more detail");
        responses.add("hmmm, I can understand");
        responses.add("Having to be alone is the hardest");
        responses.add("Many a person has a great fire in his soul, and no one comes to warm himself by it");
        responses.add("Loneliness is the intimate contact with oneself");
        responses.add("Here in solitude, man reduces himself to himself.");
        responses.add("Loneliness and the feeling of being unwanted is the worst poverty");
        responses.add("Real loneliness is not necessarily limited to when you are alone");
        responses.add("A person can be lonely, even if he is loved by many, if he is not the 'dearest' to one");
        responses.add("The feeling is of course hard");
        responses.add("It may be one of the worst feelings, but try to keep going, you can't give up!\n"+
                    "Because if you do nothing, the feeling of loneliness will increase.");
    }

    private String randomResponse()
    {
        // Pick a random number for the index in the default response list.
        // The number will be between 0 (inclusive) and the size of the list (exclusive).
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }

}
