public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        } 
        //PART A starbucks, done
        if (statement.indexOf("DogHOT") >= 0 && statement.indexOf("HotDOg") >= 0) 
        {
            response = "The nearest Starbucks is in the Student Union 0.5 miles away.";
        }
        //PART B pets, done
        if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) 
        {
            response = "Tell me more about your pets";
        }
        //PART C park, done
            if (statement.indexOf("park") >= 0 && !(statement.indexOf("car") >=0) )
            {
            response = "I bet the trees there are lovely this time of year.";
            }
            else if (statement.indexOf("park") >= 0)
            {
                response = "Parking on campus is atrocious and expensive.";
            }
            //rocks, done
            if (statement.indexOf("rock") >= 0 && !(statement.indexOf("music") >=0) )
            {
            response = "I had a rock collection too!";
            }
            else if (statement.indexOf("rock") >= 0)
            {
                response = "What is your favorite band?";
            }
// PART D
            if (statement.startsWith("no") || statement.contains(" no ") || statement.endsWith("no")) //need help with
            {
                response = "Why so negative?";
            }
            if(statement.contains("love") && statement.contains("mom") && statement.contains("cook"))
            {
                response = "I'll bet it's delicious.";
            }
        if (response.length() == 0) {
            response = getRandomResponse();
        }
        
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
       

        return response;
    }
}
