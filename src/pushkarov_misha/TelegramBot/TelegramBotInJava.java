package pushkarov_misha.TelegramBot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class TelegramBotInJava extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "myFirstTelegramBotInJava_bot";
    }

    @Override
    public String getBotToken() {
        return "5094952797:AAHnLSCrP_6mR0Kq3LnTbuCWsEHto9wEfHo";
    }
}
