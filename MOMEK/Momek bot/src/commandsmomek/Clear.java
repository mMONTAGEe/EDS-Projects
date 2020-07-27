    // NOT FINISHED!!!!
package commandsmomek;



import java.util.List;

import momek.Momek;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Clear extends ListenerAdapter  {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		if (args[0].equalsIgnoreCase(Momek.prefix + "Clear")) {
		if (args.length < 2)	{

			// TODO Errors (NOT FINISHED)!!!!!
		}
		else {
			try {
				List<Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
				event.getChannel().deleteMessages(messages).queue();
			}
			catch (Exception e) {
			
		
			
		}
		}
}
}
}