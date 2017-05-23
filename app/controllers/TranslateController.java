package controllers;

import business_logic.GoogleSpeechTranslationService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import utils.AppConstants;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class TranslateController extends Controller {

    private GoogleSpeechTranslationService googleSpeechTranslationService;

    @Inject
    public TranslateController(GoogleSpeechTranslationService translationService) {
        this.googleSpeechTranslationService = translationService;
    }


    public Result translation(String filename) throws IOException{
        ObjectNode response = Json.newObject();
        try {
            String res = this.googleSpeechTranslationService.getTranscript(filename);
            if (res == null || res.isEmpty()){
                res = AppConstants.APIResponse.NO_RESPONSE;
            }
            response.put("script", res);
            return ok(response);
        }catch (Exception e){
            response.put("errorMessage", e.getMessage());
            return badRequest(response);
        }
    }

}
