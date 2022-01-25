package pushkarov_misha.TelegramBot;

import org.jetbrains.annotations.NotNull;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramBotInJava extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(@NotNull Update update) {

        String messageIn = update.getMessage().getText();

        SendMessage messageOut = new SendMessage();

        if (messageIn.equals("myname")) {
            messageOut.setText(update.getMessage().getFrom().getFirstName());
        }
        if (messageIn.equals("mylastname")) {
            messageOut.setText(update.getMessage().getFrom().getLastName());
        }
        if (messageIn.equals("myfullname")) {
            messageOut.setText(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
        }

        messageOut.setChatId(update.getMessage().getChatId());

        try {
            execute(messageOut);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

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
