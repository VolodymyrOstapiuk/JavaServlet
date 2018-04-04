package ua.tef.controller;

import ua.tef.error.ValidationError;
import ua.tef.exception.NotValidInputException;
import ua.tef.model.Model;
import ua.tef.model.ValidationRegex;
import ua.tef.model.entity.Address;
import ua.tef.model.entity.Consumer;
import ua.tef.view.View;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class FormProcessingServlet extends HttpServlet {
    private Model model;

    public FormProcessingServlet(Model model) {
        this.model = model;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequestToForm(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processConsumer(req,resp);
    }
    private void processConsumer(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HashMap<String,ValidationError> errors = new HashMap<>();
        boolean isFormCorrect = true;
        boolean isFieldCorrect = true;
        String name = "";
        String surname = "";
        String patronymic = "";
        String nickname = "";
        String comment = "";
        String homePhone = "";
        String firstPhoneNumber= "";
        String secondPhone= "";
        String addressIndex = "";
        String city = "";
        String street= "";
        String houseNumberString= "";
        String apartmentNumberString = "";
        try {
            name = validateWithAddingToErrorsMap(request, errors,FormInputNames.NAME_INPUT_NAME,View.INCORRECT_NAME_CAPTION_INDEX,ValidationRegex.ENGLISH_NAME_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            surname = validateWithAddingToErrorsMap(request, errors,FormInputNames.SURNAME_INPUT_NAME,View.INCORRECT_SURNAME_CAPTION_INDEX,ValidationRegex.ENGLISH_SURNAME_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            patronymic = validateWithAddingToErrorsMap(request, errors,FormInputNames.PATRONYMIC_INPUT_NAME,View.PATRONYMIC_CAPTION_INDEX,ValidationRegex.NICKNAME_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            nickname = validateWithAddingToErrorsMap(request, errors,FormInputNames.NICKNAME_INPUT_NAME,View.INCORRECT_NICKNAME_CAPTION_INDEX,ValidationRegex.ENGLISH_PATRONYMIC_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(isFieldCorrect){
            if(!model.isNickNameAvailable(nickname)){
                isFieldCorrect = false;
                errors.put(FormInputNames.NICKNAME_INPUT_NAME,new ValidationError(nickname,View.NICKNAME_ALREADY_EXISTS_CAPTION));
            }
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            comment = validateWithAddingToErrorsMap(request, errors,FormInputNames.COMMENT_INPUT_NAME,View.INCORRECT_COMMENT_CAPTION_INDEX,ValidationRegex.ENGLISH_PATRONYMIC_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            homePhone = validateWithAddingToErrorsMap(request, errors,FormInputNames.HOMEPHONE_INPUT_NAME,View.INCORRECT_HOME_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            firstPhoneNumber = validateWithAddingToErrorsMap(request, errors,FormInputNames.FIRSTMOBILE_INPUT_NAME,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            secondPhone = validateWithAddingToErrorsMap(request, errors,FormInputNames.SECONDMOBILE_INPUT_NAME,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION,false);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            addressIndex = validateWithAddingToErrorsMap(request, errors,FormInputNames.INDEX_INPUT_NAME,View.INCORRECT_ADDRESS_INDEX_CAPTION_INDEX,ValidationRegex.ADDRESS_INDEX_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            city = validateWithAddingToErrorsMap(request, errors,FormInputNames.CITY_INPUT_NAME,View.INCORRECT_CITY_CAPTION_INDEX,ValidationRegex.CITY_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            houseNumberString = validateWithAddingToErrorsMap(request, errors,FormInputNames.HOUSE_NUMBER_INPUT_NAME,View.INCORRECT_HOUSE_NUMBER_CAPTION_INDEX,ValidationRegex.HOUSE_NUMBER_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            firstPhoneNumber = validateWithAddingToErrorsMap(request, errors,FormInputNames.FIRSTMOBILE_INPUT_NAME,View.INCORRECT_MOBILE_PHONE_CAPTION_INDEX,ValidationRegex.PHONE_NUMBER_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }
        try {
            apartmentNumberString = validateWithAddingToErrorsMap(request, errors,FormInputNames.APPARTMENT_NUMBER_INPUT_NAME,View.INCORRECT_APARTMENTS_NUMBER_CAPTION_INDEX,ValidationRegex.APARTMENT_NUMBER_REGULAR_EXPRESSION,true);
            isFieldCorrect = true;
        } catch (NotValidInputException e) {
            isFieldCorrect = false;
        }
        if(!isFieldCorrect){
            isFormCorrect = false;
        }

//        String apartmentNumberString= inputStringWithValidation(scanner,View.APARTMENTS_NUMBER_CAPTION_INDEX,View.INCORRECT_APARTMENTS_NUMBER_CAPTION_INDEX,ValidationRegex.APARTMENT_NUMBER_REGULAR_EXPRESSION);
        if(!isFormCorrect) {
            request.setAttribute("errors", errors);
            Consumer consumer = new Consumer(name,surname,patronymic,nickname,comment,homePhone,firstPhoneNumber,secondPhone,new Address(addressIndex,city,street,Integer.parseInt(houseNumberString),Integer.parseInt(apartmentNumberString)));
            processRequestToForm(request,response);
        }else {
            processRequestToSuccess(request,response);
        }
    }


    private String validateWithAddingToErrorsMap(HttpServletRequest request, HashMap<String, ValidationError> errors,String formInputName, String incorrectKey,String regex,boolean isRequired) throws NotValidInputException {
        boolean isFormCorrect;
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
          errors.put(formInputName,new ValidationError(input,errorKey));
        if(!errorKey.equals("")){
            throw new NotValidInputException(errorKey,new ValidationError(input,errorKey));
        }
        return input;

    }

    private void processRequestToForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/form.jsp")
                .forward(request,response);

    }
    private void processRequestToSuccess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/success.jsp")
                .forward(request,response);

    }

    public boolean validate(String input,String regex){
        return input.matches(regex);
    }

}

