package pushkarov_misha.TelegramBot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class TelegramBotInJava extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "myFirstTelegramBotInJava_bot";
    }

    public String getBotToken() {
        return "5094952797:AAHnLSCrP_6mR0Kq3LnTbuCWsEHto9wEfHo";
    }
}
