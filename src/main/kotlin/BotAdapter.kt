import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class BotAdapter :ListenerAdapter() {
    override fun onGuildMessageReceived(event: GuildMessageReceivedEvent) {
        println(event.message.contentRaw)
        if (!event.message.contentRaw.startsWith(".hello")) return
        if (event.message.author == event.jda.selfUser) return

        HelloCommand().handle(event)
    }

    override fun onPrivateMessageReceived(event: PrivateMessageReceivedEvent) {
        println(event.message.contentRaw)
        if (!event.message.contentRaw.startsWith(".goodbye")) return
        if (event.message.author == event.jda.selfUser) return

        GoodbyeCommand().handle(event)
    }
}