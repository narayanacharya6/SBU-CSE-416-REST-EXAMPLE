This is a simple REST example for CSE-416 using JAX-RS built using IntelliJ as my IDE.
I used TomEE as my server of choice to avoid known issues with Glassfish and higher versions of JDK.
The examples is based on the lecture on 02/12/2020 and covers basic annotations in JAX-RS.

Some NOTES:
0. There is no web.xml file under the web directory as everything is configured via annotaions.

1. If you use a Glassfish server, remember that there are known compatibility issues for Glassfish 5+ with JDK 9+.
For lower versions of JDK you might struggle getting JDK working with IntelliJ seamlessly.
It can be done but can turn painful soon. I recommend using TomEE Plume as your server. 
NOT Tomcat, but TomEE. Tomcat does not come with REST modules packed in, so you have to go shopping for it again. So avoid Tomcat.

2. I also recommend checking this guide out if you are working with IntelliJ for the first time. 
The guide assumes you have Glassfish installed. Also notice the Glassfish version is 4.+.

3. While accessing the URLs in your browser, notice how the URLs are constructed.
localhost:port/<ARTIFACT_NAME>/<APPLICATION_PATH>/<RELATIVE_RESOURCE_PATH>

For this example I have,
ARTIFACT_NAME=CSE-416-REST-SAMPLE (Check the folder name under the out directory for this. You can configure this from the Artifacts window as shown in the guide.)
APPLICATION_PATH=/api (Check out the ApplicationConfig class.)
RELATIVE_RESOURCE_PATH=/helloworld (Check out the HelloWorld class.)

For specific methods with the @Path annotation, they will be, say /CSE-416-REST-SAMPLE/api/helloworld/query?query=WHAT 

4. Notice that the ApplicationConfig class does NOT override anything as it does not need to.
The HelloWorld class has the necessary annotations for it be configured accordingly. 
ApplicationConfig, for the purposes of this example, is simply helping us set the base path of our application's resources.

If you have doubts, please reach out to me.