# Changes made/issues resolved to make a runnable file
1. Create DDL popos up a Message "You have not selected a path that contains valid output definition files. Please select a path now". Find this code, and what an output definition file is and the format it wants it in. EDIT:: It now shows The path:... contains no valid output definition files
2. you can't click exit on the   "You have not selected a path that contains...." message. It just keeps popping up.
3. If you click options->setoutput definition file. And then click Create DDL (after the Course.edg file has been loaded). It still tells you that you need to set it. This is not program breaking afaik though. Not a huge deal, low priority
4. You cannot click on options-> Show Database Products Available. not important, low priorty

These issues were resolved by setting our classpath to a different directory (com.bobbytables.app.)

# To Run 
1. Unzip the folder
2. cd into unzipped folder
3. java -jar target/BobbyTablesProject-1.0-SNAPSHOT.jar
4. When GUI opens Select File>Open Edge File>
5. Navigate to bobbytablesproject/src/main/java/com/bobbytables/app Select Courses.edg Select OK
6. Click on the CreateDDL button and select OK
7. Navigate to bobbytablesproject/target/classes/com/bobbytables/app and select OK
8. Select OK for MySQL
9. Select whatever name or save location for output file. 
10. Select OK



