import java.util.HashSet;

/**
 * I am trying to programm a bot for loneliness. 
 * 
 * @author (Eldar Akhundzada) 
 * @version (31.12.2022)
 */
public class TheLonelinessSystem
{
    private Responder responder;
    private InputReader inputtext;
    

    /**
     * This is the TheLonelinessSystem
     */
    public TheLonelinessSystem()
    {
        responder = new Responder();
        inputtext = new InputReader();
    }
    
    public void start()
    {
        boolean finished = false;
        
        printWelcomeText();
        
        while(!finished){
            HashSet<String> input = inputtext.getInput();
            
            if(input.contains("bye")){
                finished = true;
            }else{
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        printGoodbyeText();
    }
    
    private void printWelcomeText()
    {
        System.out.println("Welcome to the loneliness system");
        System.out.println("");
        System.out.println("You are probably on this page because you suffer from loneliness.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Before you start, I must tell you that I am not a real person.");
        System.out.println("I am a bot responsible for alerting people to problems and directing\n"+
                            "them to real help.");
        System.out.println("Please tell me why you feel alone ");
        System.out.println("To finish this talk type 'bye'");
    }
    
    private void printGoodbyeText()
    {
       System.out.println("We hope you are feeling better and we were able to help you a little.\n"+
       "If you have serious problems, seek psychological help. Do not be afraid of it :)");
    }
}
