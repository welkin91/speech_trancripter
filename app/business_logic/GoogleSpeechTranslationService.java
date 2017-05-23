package business_logic;

import com.google.api.gax.grpc.OperationFuture;
import com.google.cloud.speech.spi.v1.SpeechClient;
import com.google.cloud.speech.v1.*;
import com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.io.IOException;
import java.util.List;

@Singleton
public class GoogleSpeechTranslationService {

    private static final String BASE_URI = "gs://flacfiles/";

    @Inject
    public GoogleSpeechTranslationService() throws IOException {
    }

    public String getTranscript(String filename) throws Exception{
        String res = "";
        SpeechClient speech = SpeechClient.create();
        RecognitionConfig config = RecognitionConfig.newBuilder()
                .setEncoding(AudioEncoding.FLAC)
                .setLanguageCode("en-US")
                .build();
        RecognitionAudio audio = RecognitionAudio.newBuilder()
                .setUri(BASE_URI + filename)  //test (3).flac
                .build();

        OperationFuture<LongRunningRecognizeResponse> response = speech.longRunningRecognizeAsync(config, audio);
        while (!response.isDone()) {
            Thread.sleep(5000);
        }

        List<SpeechRecognitionResult> results = response.get().getResultsList();

        for (SpeechRecognitionResult result : results) {
            List<SpeechRecognitionAlternative> alternatives = result.getAlternativesList();
            for (SpeechRecognitionAlternative alternative : alternatives) {
                res += alternative.getTranscript() + "\n";
            }
        }
        speech.close();
        return res;
    }
}

