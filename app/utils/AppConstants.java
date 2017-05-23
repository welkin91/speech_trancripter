package utils;

public @interface AppConstants {

    String FILE_DESCRIPTOR = "audioFileDescriptor";
    String WEB_FLAC_CONTENT_TYPE = "audio/x-flac";
    String FLAC_CONTENT_TYPE = "audio/flac";
    String FLAC_EXT = ".flac";

    @interface APIResponse{
        String SUCCESS = "success";
        String FAILURE = "failure";
        String NO_RESPONSE = "Uh-Oh! Looks like google could not generate text for this audio clip!";
    }
}
