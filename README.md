# speech_transcripter

Google Speech Apis generally take a lot of time to respond. They might give empty responses too. 
The reason for long time is asynchronous processing of audio clips for speech recognition.
The bigger the file size, the longer the Api takes to respond. 

The API also restricts input files. 
For the purpose of this assignment, i am accepting only .flac files.  