package ua.tef.controller;

import ua.tef.model.ValidationRegex;
import ua.tef.view.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class FormProcessingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/form.jsp")
                .forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter(FormInputNames.NAME_INPUT_NAME)!=null){

        }
    }
    private void processConsumer(HttpServletRequest request){
        HashMap<String,String> errors = new HashMap<>();
        boolean isFormCorrect = true;
        String nameError =validateWithErrorReturn(request,FormInputNames.NAME_INPUT_NAME,View.INCORRECT_NAME_CAPTION_INDEX,ValidationRegex.ENGLISH_NAME_REGULAR_EXPRESSION,true);
        if(!nameError.equals("")){
            isFormCorrect = false;
        }
//        String name = inputStringWithValidation(scanner, View.NAME_CAPTION_INDEX,View.INCORRECT_NAME_CAPTION_INDEX, ValidationRegex.ENGLISH_NAME_REGULAR_EXPRESSION);
//        String surname= inputStringWithValidation(scanner,View.SURNAME_CAPTION_INDEX,View.INCORRECT_SURNAME_CAPTION_INDEX,ValidationRegex.ENGLISH_SURNAME_REGULAR_EXPRESSION);
//        String patronymic= inputStringWithValidation(scanner,View.PATRONYMIC_CAPTION_INDEX,View.INCORRECT_PATRONYMIC_CAPTION_INDEX,ValidationRegex.ENGLISH_PATRONYMIC_REGULAR_EXPRESSION);
//        String nickname = inputStringWithValidation(scanner,View.NICKNAME_CAPTION_INDEX,View.INCORRECT_NICKNAME_CAPTION_INDEX,ValidationRegex.NICKNAME_REGULAR_EXPRESSION);
//        String comment=  inputStringWithValidation(scanner,View.COMMENT_CAPTION_INDEX,View.INCORRECT_COMMENT_CAPTION_INDEX,ValidationRegex.COMMENT_REGULAR_EXPRESSION);
//        String homePhone= inputStringWithValidation(scanner,View.HOME_PHONE_CAPTION_INDEX,View.INCORRECT_HOME_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
//        String firstPhoneNumber = inputStringWithValidation(scanner,View.MOBILE_PHONE_CAPTION_INDEX,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
//        String secondPhone= inputStringWithValidation(scanner,View.SECOND_PHONE_CAPTION_INDEX,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION);
//        String addressIndex= inputStringWithValidation(scanner,View.ADDRESS_INDEX_CAPTION_INDEX,View.INCORRECT_ADDRESS_INDEX_CAPTION_INDEX,ValidationRegex.ADDRESS_INDEX_REGULAR_EXPRESSION);
//        String city = inputStringWithValidation(scanner,View.CITY_CAPTION_INDEX,View.INCORRECT_CITY_CAPTION_INDEX,ValidationRegex.CITY_REGULAR_EXPRESSION);
//        String street= inputStringWithValidation(scanner,View.STREET_CAPTION_INDEX,View.INCORRECT_STREET_CAPTION_INDEX,ValidationRegex.STREET_REGULAR_EXPRESSION);
//        String houseNumberString= inputStringWithValidation(scanner,View.HOUSE_NUMBER_CAPTION_INDEX,View.INCORRECT_HOUSE_NUMBER_CAPTION_INDEX,ValidationRegex.HOUSE_NUMBER_REGULAR_EXPRESSION);
//        String apartmentNumberString= inputStringWithValidation(scanner,View.APARTMENTS_NUMBER_CAPTION_INDEX,View.INCORRECT_APARTMENTS_NUMBER_CAPTION_INDEX,ValidationRegex.APARTMENT_NUMBER_REGULAR_EXPRESSION);
    }

    private String  validateWithErrorReturn(HttpServletRequest request, String formInputName, String incorrectKey,String regex,boolean isRequired) {
        String input;
        String errorKey = "";
        if((input=request.getParameter(formInputName))!=null){
            if(input.equals("")){
                if (isRequired) {
                    errorKey = View.INPUT_EMPTY_CAPTION_INDEX;
                }
            }
            if(!validate(input, regex)){
                errorKey = incorrectKey;
            }
        }
        return errorKey;
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/form.jsp")
                .forward(request,response);

    }
    public boolean validate(String input,String regex){
        return input.matches(regex);
    }

}

