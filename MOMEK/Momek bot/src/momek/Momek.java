package momek;

import javax.security.auth.login.LoginException;

import Events.GuildMemberJoin;
import Events.GuildMemberLeave;
import commandsmomek.Clear;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class Momek {
public static JDA jda;
public static String prefix = ">";


// Main method 
@SuppressWarnings("deprecation")
public static void main(String[] args) throws LoginException {
	jda = new JDABuilder(AccountType.BOT).setToken("NzM2OTAwNjUzNzU4MTUyNzQ2.Xx1iNg.bSyW63IJseAK24_eF-jSCEByxtY").build();
	jda.getPresence().setStatus(OnlineStatus.IDLE);
	
    jda.addEventListener(new Clear());
    jda.addEventListener(new GuildMemberJoin());
    jda.addEventListener(new GuildMemberLeave());
}
}