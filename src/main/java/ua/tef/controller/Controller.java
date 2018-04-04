package ua.tef.controller;


import ua.tef.exception.NicknameAlreadyExistsException;
import ua.tef.model.Model;
import ua.tef.model.ValidationRegex;
import ua.tef.model.entity.Address;
import ua.tef.model.entity.Consumer;
import ua.tef.view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    public void processConsumer(){
        Scanner scanner = new Scanner(System.in);
        Consumer consumer = inputConsumer(scanner);
        processConsumerWithNicknameAvailabilityCheck(scanner,consumer);

    }
    public void processConsumerWithNicknameAvailabilityCheck(Scanner scanner,Consumer consumer){
        boolean flag = false;
        while (!flag) {
            try {
                model.processNewConsumer(consumer);
                flag = true;
            } catch (NicknameAlreadyExistsException e) {
                flag = false;
                view.printMessage(e.getMessage());
                String nickname = inputStringWithValidation(scanner, View.NICKNAME_CAPTION_INDEX, View.INCORRECT_NICKNAME_CAPTION_INDEX, ValidationRegex.NICKNAME_REGULAR_EXPRESSION);
                Consumer incorrectConsumer = e.getConsumer();
                incorrectConsumer.setNickname(nickname);
                consumer = incorrectConsumer;
            }
        }

    }
    public Consumer inputConsumer(Scanner scanner){
        String name = inputStringWithValidation(scanner,View.NAME_CAPTION_INDEX,View.INCORRECT_NAME_CAPTION_INDEX, ValidationRegex.ENGLISH_NAME_REGULAR_EXPRESSION);
        String surname= inputStringWithValidation(scanner,View.SURNAME_CAPTION_INDEX,View.INCORRECT_SURNAME_CAPTION_INDEX,ValidationRegex.ENGLISH_SURNAME_REGULAR_EXPRESSION);
        String patronymic= inputStringWithValidation(scanner,View.PATRONYMIC_CAPTION_INDEX,View.INCORRECT_PATRONYMIC_CAPTION_INDEX,ValidationRegex.ENGLISH_PATRONYMIC_REGULAR_EXPRESSION);
        String nickname = inputStringWithValidation(scanner,View.NICKNAME_CAPTION_INDEX,View.INCORRECT_NICKNAME_CAPTION_INDEX,ValidationRegex.NICKNAME_REGULAR_EXPRESSION);
        String comment=  inputStringWithValidation(scanner,View.COMMENT_CAPTION_INDEX,View.INCORRECT_COMMENT_CAPTION_INDEX,ValidationRegex.COMMENT_REGULAR_EXPRESSION);
        String homePhone= inputStringWithValidation(scanner,View.HOME_PHONE_CAPTION_INDEX,View.INCORRECT_HOME_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
        String firstPhoneNumber = inputStringWithValidation(scanner,View.MOBILE_PHONE_CAPTION_INDEX,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
        String secondPhone= inputStringWithValidation(scanner,View.SECOND_PHONE_CAPTION_INDEX,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
        String addressIndex= inputStringWithValidation(scanner,View.ADDRESS_INDEX_CAPTION_INDEX,View.INCORRECT_ADDRESS_INDEX_CAPTION_INDEX,ValidationRegex.ADDRESS_INDEX_REGULAR_EXPRESSION);
        String city = inputStringWithValidation(scanner,View.CITY_CAPTION_INDEX,View.INCORRECT_CITY_CAPTION_INDEX,ValidationRegex.CITY_REGULAR_EXPRESSION);
        String street= inputStringWithValidation(scanner,View.STREET_CAPTION_INDEX,View.INCORRECT_STREET_CAPTION_INDEX,ValidationRegex.STREET_REGULAR_EXPRESSION);
        String houseNumberString= inputStringWithValidation(scanner,View.HOUSE_NUMBER_CAPTION_INDEX,View.INCORRECT_HOUSE_NUMBER_CAPTION_INDEX,ValidationRegex.HOUSE_NUMBER_REGULAR_EXPRESSION);
        String apartmentNumberString= inputStringWithValidation(scanner,View.APARTMENTS_NUMBER_CAPTION_INDEX,View.INCORRECT_APARTMENTS_NUMBER_CAPTION_INDEX,ValidationRegex.APARTMENT_NUMBER_REGULAR_EXPRESSION);
        Address address = new Address(addressIndex,city,street,Integer.valueOf(houseNumberString),Integer.valueOf(apartmentNumberString));
        Consumer consumer = new Consumer(name,surname,patronymic,nickname,comment,homePhone,firstPhoneNumber,secondPhone,address);
        return consumer;
    }
    public boolean validate(String input,String regex){
       return input.matches(regex);
    }
    public String inputStringWithValidation(Scanner scanner,String startMessageKey,String incorrectInputMessageKey,String regex){
        view.printLocalizedMessage(startMessageKey);
        String input= scanner.next();
        while (!validate(input,regex)){
            view.printLocalizedMessage(incorrectInputMessageKey);
            view.printLocalizedMessage(startMessageKey);
            input = scanner.next();
        }
        return input;
    }
}
