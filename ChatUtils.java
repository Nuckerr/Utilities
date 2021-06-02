package wtf.nucker.spigotutilities.utils;

import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class has a bunch of useful methods and variables
 */
public class ChatUtils {
    /**
     * Good sized bar for scoreboards
     */
    public static final String SB_BAR = ChatColor.STRIKETHROUGH + "----------------------";
    /**
     * Good sized bar for guis
     */
    public static final String MENU_BAR = ChatColor.STRIKETHROUGH + "------------------------";
    /**
     * Good sized bar for information messages
     */
    public static final String CHAT_BAR = ChatColor.STRIKETHROUGH + "------------------------------------------------";
    /**
     * No text in the message, adds a bit of space between a message
     */
    public static final String BLANK_MESSAGE = String.join("", Collections.nCopies(150, " \n"));


    /**
     * A shorter method for the bukkit method ChatColor#translateAlternateColorCodes.
     * Dosent require a altColorChar param, this is provided in the method as '&'
     * @param string the string you want translating
     * @return the translated string
     */
    public static String translate(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    /**
     * A shorter method for the bukkit method ChatColor#translateAlternateColorCodes.
     * Dosent require a altColorChar param, this is provided in the method as '&'
     * This methods supports lists
     * @param lines the list of strings you want to translate
     * @return each string in your list being translated
     */
    public static List<String> translate(List<String> lines) {
        List<String> strings = new ArrayList<>();

        for (String line : lines) {
            strings.add(ChatColor.translateAlternateColorCodes('&', line));
        }

        return strings;
    }

    /**
     * A useful enum with a bunch of symbols you may want to access
     */
    public enum Symbols {
        /**
         * Returns "❤" symbol
         */
        HEALTH(StringEscapeUtils.unescapeJava("\u2764")),
        /**
         * Returns "«" symbol
         */
        ARROW_LEFT(StringEscapeUtils.unescapeJava("\u00AB")),
        /**
         * Returns "»" symbol
         */
        ARROW_RIGHT(StringEscapeUtils.unescapeJava("\u00BB")),
        /**
         * Returns "✖" symbol
         */
        CROSS(StringEscapeUtils.unescapeJava("\u2716")),
        /**
         * Returns "⚠" symbol
         */
        WARNING(StringEscapeUtils.unescapeJava("\u26A0"));

        private final String symbol;

        /**
         * The constructor for the symbol enum
         * @param symbol the symbol unicode
         */
        Symbols(String symbol) {
            this.symbol = symbol;
        }

        /**
         * A method to get the unicode symbol
         * @return the symbol
         */
        public String getSymbol() {
            return symbol;
        }
    }
}
