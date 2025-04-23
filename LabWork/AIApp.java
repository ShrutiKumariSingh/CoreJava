public class AIApp
{
	public static void main(String[] args)
	{
		VirtualAssistant assistant = new VirtualAssistant("Alexa");
        	assistant.displayInfo();
        	assistant.listen();
        	assistant.respond("Hello, assistant!");
        	assistant.setReminder("2:00 PM", "Meeting with the team");
        	assistant.sendEmail("shruti@gmail.com", "Project Update");
   	}
}
interface SpeechProcessor 
{
	void listen();     
	void respond(String input);  
}
interface TaskManager 
{
	void setReminder(String time, String message);  
	void sendEmail(String to, String subject);  
}
class VirtualAssistant implements SpeechProcessor, TaskManager 
{
	String name;
	public VirtualAssistant(String name) 
	{
        	this.name = name;
    	}
    	public void displayInfo() 
    	{
        	System.out.println("Assistant Name: " + name);
        	System.out.println("Capabilities:");
        	System.out.println("- Listen to user input");
        	System.out.println("- Respond to user input");
        	System.out.println("- Set reminders");
        	System.out.println("- Send dummy emails");
    	}
    	public void listen() 
    	{
        	System.out.println(name + " is now listening for user input...");
        }
    	public void respond(String input) 
    	{
        	System.out.println(name + " responds: You said, \"" + input + "\". How can I assist you further?");
    	}
    	public void setReminder(String time, String message) 
    	{
       		System.out.println(name + " has set a reminder for " + time + ": " + message);
    	}
   	public void sendEmail(String to, String subject) 
   	{
        	System.out.println(name + " is sending an email to " + to + " with subject: \"" + subject + "\".");
        	System.out.println("Email sent successfully !! ");
   	}
}


