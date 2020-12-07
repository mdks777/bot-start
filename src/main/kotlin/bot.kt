import net.dv8tion.jda.api.JDABuilder

fun main(){}

val jda = JDABuilder("")
    .addEventListeners(BotAdapter()) // イベントリスナーの追加
    .build()
    .awaitReady()