package ua.tef.model;

public interface ValidationRegex {
    String ENGLISH_NAME_REGULAR_EXPRESSION = "([a-zA-Z])+";
    String ENGLISH_SURNAME_REGULAR_EXPRESSION = "([a-zA-Z])+";
    String ENGLISH_PATRONYMIC_REGULAR_EXPRESSION = "([a-zA-Z])+";
    String NICKNAME_REGULAR_EXPRESSION  = "^[^0-9]\\w+$";
    String COMMENT_REGULAR_EXPRESSION = "^[^0-9]\\w+$";
    String PHONE_NUMBER_REGULAR_EXPRESSION = "^[0-9\\-\\+]{9,15}$";
    String ADDRESS_INDEX_REGULAR_EXPRESSION = "^[0-9]+";
    String CITY_REGULAR_EXPRESSION = "[A-Z]+[a-z]+";
    String STREET_REGULAR_EXPRESSION = "[A-Z]+[a-z]+";
    String HOUSE_NUMBER_REGULAR_EXPRESSION = "^[0-9]+";
    String APARTMENT_NUMBER_REGULAR_EXPRESSION = "^[0-9]+";
}
