# speech_transcripter

Google Speech Apis generally take a lot of time to respond. They might give empty responses too. 
The reason for long time is asynchronous processing of audio clips for speech recognition.
The bigger the file size, the longer the Api takes to respond. 

The API also restricts input files. 
For the purpose of this assignment, i am accepting only .flac files.  

** In order to run this module, you need to have sbt and google cloud sdk running in your system. You should also have a google bucket (global access) by the name of "flacfiles" in your default google cloud account.**

steps:<br>
git clone {url} <br>
  <t>cd speech_trancripter<br>
  <t>sbt;<br>
    <t><t>clean;<br>
    <t><t>run 9000;<br>

Make sure while setting up a google cloud account you also set up a service account and generate a Credential JSON. Use the local path of this JSON file as the value of env variable GOOGLE_APPLICATION_CREDENTIALS.
