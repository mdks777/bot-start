import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent

class GoodbyeCommand {
    fun handle(event: PrivateMessageReceivedEvent) {
        for (i in 1..10){
            event.channel.sendMessage(event.message.contentRaw).queue()
        }
    }
}