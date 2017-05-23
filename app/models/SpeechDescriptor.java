package models;

import play.twirl.api.Content;

public class SpeechDescriptor implements Content {

//    private

    @Override
    public String body() {
        String res = "this is it";

        return res;
    }

    @Override
    public String contentType() {
        return null;
    }
}
