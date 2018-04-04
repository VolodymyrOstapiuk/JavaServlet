package ua.tef.view;

import java.util.ResourceBundle;

public class View {
    public final static String BUNDLE_INDEX = "base";
    public final static String WELCOME_CAPTION_INDEX = "welcome";

    public final static String NAME_CAPTION_INDEX = "name_input_caption";
    public final static String SURNAME_CAPTION_INDEX = "surname_input_caption";
    public final static String PATRONYMIC_CAPTION_INDEX = "patronymic_input_caption";
    public final static String NICKNAME_CAPTION_INDEX = "nickname_input_caption";
    public final static String COMMENT_CAPTION_INDEX = "comment_caption";
    public final static String HOME_PHONE_CAPTION_INDEX = "home_phone_caption";
    public final static String MOBILE_PHONE_CAPTION_INDEX = "mobile_phone_caption";
    public final static String SECOND_PHONE_CAPTION_INDEX = "second_phone_caption";
    public final static String ADDRESS_INDEX_CAPTION_INDEX ="address_index_caption";
    public final static String CITY_CAPTION_INDEX = "city_caption";
    public final static String STREET_CAPTION_INDEX = "street_caption";
    public final static String HOUSE_NUMBER_CAPTION_INDEX = "house_number_caption";
    public final static String APARTMENTS_NUMBER_CAPTION_INDEX = "apartments_number_caption";
    public final static String INCORRECT_NAME_CAPTION_INDEX = "incorrect_name_caption";
    public final static String INCORRECT_SURNAME_CAPTION_INDEX = "incorrect_surname_caption";
    public final static String INCORRECT_PATRONYMIC_CAPTION_INDEX = "incorrect_patronymic_caption";
    public final static String INCORRECT_NICKNAME_CAPTION_INDEX = "incorrect_nickname_caption";
    public final static String INCORRECT_COMMENT_CAPTION_INDEX = "incorrect_comment_caption";
    public final static String INCORRECT_HOME_PHONE_CAPTION_INDEX = "incorrect_home_phone_caption";
    public final static String INCORRECT_MOBILE_PHONE_CAPTION_INDEX = "incorrect_mobile_phone_caption";
    public final static String INCORRECT_ADDRESS_INDEX_CAPTION_INDEX ="incorrect_address_index_caption";
    public final static String INCORRECT_CITY_CAPTION_INDEX = "incorrect_city_caption";
    public final static String INCORRECT_STREET_CAPTION_INDEX = "incorrect_street_caption";
    public final static String INCORRECT_HOUSE_NUMBER_CAPTION_INDEX = "incorrect_house_number_caption";
    public final static String INCORRECT_APARTMENTS_NUMBER_CAPTION_INDEX = "incorrect_apartments_number_caption";
    public final static String NICKNAME_ALREADY_EXISTS_INDEX = "nickname_already_exists";
    public final static String INPUT_EMPTY_CAPTION_INDEX = "input_empty";
    public final  static  ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_INDEX);
    public final static String NICKNAME_ALREADY_EXISTS_CAPTION = bundle.getString(NICKNAME_ALREADY_EXISTS_INDEX);

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printLocalizedMessage(String messageKey){
        printMessage(bundle.getString(messageKey));
    }

}
