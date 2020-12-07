import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

class HelloCommand {
    fun handle(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("HELLO").queue()
    }
}